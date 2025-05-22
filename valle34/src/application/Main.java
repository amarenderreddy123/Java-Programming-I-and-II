package application;
	
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Main extends Application {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This program connects with MySQL to provide a user with a GUI they can use to access record from example database.
	 * Pseudo-Code:
	 * - Create query box
	 * - Create property box
	 * - Create where box
	 * - Create result box
	 * - Create execute button
	 * - Add all nodes to container
	 * - Create getQuery method
	 * - Create runQuery method
	 */
	private final List<String> selectedColumns = new ArrayList<>();
    private final List<String> columns = new ArrayList<String>(List.of("vin", "make", "model", "year", "color", "price"));
    private TextField whereField = null;
	@Override
	public void start(Stage primaryStage) {
		try {
			//generate ui
			BorderPane borderPane = new BorderPane();
	        VBox vbContainer = new VBox();         
	        vbContainer.setSpacing(20.0);
	        vbContainer.setPadding(new Insets(10));  
	        borderPane.getChildren().add(vbContainer);         
	        primaryStage.setTitle("Product Table Viewer");         
	        primaryStage.setScene(new Scene(borderPane, 470, 500));
			
	        //queryBox displays current query
	        VBox queryBox = new VBox();
	        queryBox.setSpacing(10.0);
	        Label lbQueryLabel = new Label("Current Query:");
	        lbQueryLabel.setMinWidth(450.0);
	        lbQueryLabel.setFont(new Font(20.0));
	        Label lbQuery = new Label("SELECT * FROM product;");
	        lbQuery.setMinWidth(450.0);
	        lbQuery.setWrapText(true);
	        queryBox.getChildren().addAll(lbQueryLabel, lbQuery);
			
	        //propertyBox adds checkboxes for each property in the table
	        VBox propertyBox = new VBox();
	        Label lbPropertyLabel = new Label("Select properties:");
	        lbPropertyLabel.setFont(new Font(20.0));
	        propertyBox.getChildren().add(lbPropertyLabel);
	        HBox hBox = new HBox();
	        hBox.setMinWidth(450.0);
	        hBox.setSpacing(10.0);
	        for (String column : columns) {
	            CheckBox checkBox = new CheckBox(column);
	            checkBox.setMinWidth(50.0);
	            checkBox.setMinHeight(20.0);
	            checkBox.setOnAction(event -> {
	            	if(checkBox.isSelected()){
	            		selectedColumns.add(column);
	            	}
	            	else{
	            		selectedColumns.remove(column);
	            	}
	            	//update query label
	            	lbQuery.setText(getQuery());
	            });
	            hBox.getChildren().add(checkBox);
	        }
	        propertyBox.getChildren().add(hBox);
	        
	        //whereBox is where the user inputs their custom where clause
	        VBox whereBox = new VBox();
	        whereBox.setSpacing(10.0);
	        Label lbWhereLabel = new Label("Elements of where:");
	        lbWhereLabel.setFont(new Font(20.0));
	        whereField = new TextField("");
	        whereField.setPromptText("color='silver' AND make='Cadillac'");
	        whereField.setMinWidth(450.0);
	        whereField.setOnKeyPressed(event -> lbQuery.setText(getQuery()));
	        whereBox.getChildren().addAll(lbWhereLabel, whereField);
	        
	        //resultBox shows the results         
	        VBox resultBox = new VBox();
	        resultBox.setSpacing(10.0);
	        Label resultLabel = new Label("Result:");
	        resultLabel.setFont(new Font(20.0));
	        TextArea resultArea = new TextArea();
	        resultArea.setFont(new Font(15.0));
	        resultArea.setMinWidth(450.0);
	        resultArea.setMinHeight(150.0);
	        resultArea.setEditable(false);
	        resultBox.getChildren().addAll(resultLabel, resultArea);
	        
	        //run button updates the resultAreas text (shows the results of the query)
	        Button button = new Button("Run");
	        button.setFont(new Font(15.0));
	        button.setMinWidth(450.0);
	        button.setOnAction(event -> {resultArea.setText(runQuery(getQuery()));});
	        
	        //general display code
	        vbContainer.getChildren().addAll(queryBox, propertyBox, whereBox, resultBox, button);  
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	//generates the query
    private String getQuery() {
        String whereClause = ";";
        //if wherefield is null
        if(!whereField.getText().equals("")){
            whereClause = " WHERE " + whereField.getText() + ";";
        }
        if(selectedColumns.size() == 0){
            return "SELECT * FROM product" + whereClause;
        }
        else{
            return "SELECT " + String.join(",", selectedColumns) + " FROM product" + whereClause;
        }
    }
    //executes passed query
    private String runQuery(String query) {
        //get the properties to read
        List<String> properties = (selectedColumns.size() == 0 ? columns : selectedColumns);
        //stores the result
        StringBuilder sb = new StringBuilder();
        //run your database query here
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/example", "malachi", "sesame2"); 
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            for (String prop : properties) sb.append(prop).append(", ");
            sb.append("\b\n");
            while (resultSet.next()) {
                for (String prop : properties) sb.append(resultSet.getObject(prop)).append(", ");
                sb.append("\b\n");
            }
            statement.close();
            connection.close();
            return sb.toString();
        }
        catch(SQLException e) {
            e.printStackTrace();
            return e.getLocalizedMessage();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        return "";
    }
	public static void main(String[] args) {
		launch(args);
	}
}