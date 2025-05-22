package application;
	
import java.text.NumberFormat;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


public class OrderForm extends Application {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This program is an order form that uses checkboxes and radio buttons.
	 * Pseudo-Code:
	 * - Create all global nodes
	 * - Configure the radio buttons
	 * - Create layout of the application, I used 2 GridPane's inside a VBox.
	 * - Change process buttons handle, make it update the label with total price due.
	 * - Change reset button  handle, make it reset all nodes to their default values.
	 * - Create a new scene using the VBox and display it
	 */
	
	//creating global nodes for program (nodes that get accessed in some way)
	private TextField tfItemName = new TextField();
	private TextField tfItemPrice = new TextField();
	private TextField tfQuantity = new TextField();
	private CheckBox chkTaxable = new CheckBox("Taxable?");
	private RadioButton rbNextDay = new RadioButton("$20");
	private RadioButton rbThisWeek = new RadioButton("$12");
	private RadioButton rbSomeDay = new RadioButton("$5");
	private Label lbTotalDue = new Label("$0.00");
	private Button btProcess = new Button("Process");
	private Button btReset = new Button("Reset");
	@Override
	public void start(Stage primaryStage) {
		try {
			//Configure radio buttons to only allow one to selected at a time
			ToggleGroup group = new ToggleGroup();
			rbNextDay.setToggleGroup(group);
			rbThisWeek.setToggleGroup(group);
			rbSomeDay.setToggleGroup(group);
			rbSomeDay.setSelected(true);
						
			//Create and style panes, giving them all nodes
			VBox rootPane=new VBox();
			GridPane orderGp = new GridPane();
			orderGp.setHgap(5);
			orderGp.setVgap(5);
			orderGp.add(new Label("Item"), 0, 0);
			orderGp.add(tfItemName, 1, 0);
			orderGp.add(new Label("Price"), 0, 1);
			orderGp.add(tfItemPrice, 1, 1);
			orderGp.add(new Label("Quantity"), 0, 2);
			orderGp.add(tfQuantity, 1, 2);
			orderGp.add(chkTaxable, 1, 3);
			orderGp.setAlignment(Pos.CENTER_LEFT);
			orderGp.setHgap(10);
			GridPane shippingGp = new GridPane();
			shippingGp.setHgap(5);
			shippingGp.setVgap(5);
			shippingGp.add(new Label("Shipping"), 0, 0);
			shippingGp.add(new Label("Next Day"), 0, 1);
			shippingGp.add(rbNextDay, 1, 1);
			shippingGp.add(new Label("This Week"), 0, 2);
			shippingGp.add(rbThisWeek, 1, 2);
			shippingGp.add(new Label("Some Day"), 0, 3);
			shippingGp.add(rbSomeDay, 1, 3);
			shippingGp.add(new Label("Total Due"), 0, 4);
			shippingGp.add(lbTotalDue, 1, 4);
			shippingGp.add(btProcess, 0, 5);
			shippingGp.add(btReset, 1, 5);
			shippingGp.setAlignment(Pos.CENTER_LEFT);
			
			//Process button
			btProcess.setOnAction(new EventHandler<ActionEvent>() {
				@Override
		        public void handle(ActionEvent e) {
					String itemName = tfItemName.getText(); //gets item name, not useful for this program but maybe for future implementations
					double totalDue=getTotal()+getShippingPrice();
					NumberFormat formatter = NumberFormat.getCurrencyInstance(); //used numberformatted as assigned
					String formattedTotal = formatter.format(totalDue);
					System.out.println(String.format("%s bought for %s", itemName, formattedTotal)); //not required
					lbTotalDue.setText(String.format("%s", formattedTotal)); //update the totalDue label
				}
				
				//Method returns shipping price based on radio buttons
				private int getShippingPrice() {
					if(rbNextDay.isSelected()) {
						return 20; //price of nextday shipping
					}
					else if(rbThisWeek.isSelected()) {
						return 12;
					}
					else {
						return 5;
					}
				}
				
				//Method returns total including tax
				private double getTotal() {
					double itemPrice = Double.parseDouble(tfItemPrice.getText());
					double quantity = Double.parseDouble(tfQuantity.getText());
					double total=0;
					total+=itemPrice*quantity;
					if(chkTaxable.isSelected()) {
						total += total * 0.07;
					}
					return total;
				}
			});
			
			//Reset button
			btReset.setOnAction(new EventHandler<ActionEvent>() {
				@Override
		        public void handle(ActionEvent e) {
					//reset button resets all fields to default values
					tfItemName.setText("");
					tfItemPrice.setText("");
					tfQuantity.setText("");
					chkTaxable.setSelected(false);
					rbSomeDay.setSelected(true);
					lbTotalDue.setText("$0.00");
				}
			});

			//Output
			rootPane.getChildren().addAll(orderGp, shippingGp); //adds both grid panes to the VBox
			rootPane.setAlignment(Pos.CENTER); //centers everything on the y-axis
			//adds some margins on the left side
			VBox.setMargin(orderGp, new Insets(0, 0, 0, 10));
			VBox.setMargin(shippingGp, new Insets(0, 0, 0, 10));
			//Adding rootPane to a scene and displaying
			Scene scene = new Scene(rootPane, 230, 275);
			primaryStage.setTitle("Order Form");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
