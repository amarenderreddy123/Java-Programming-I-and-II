package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class ShapesInGrid extends Application {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This is a javaFX program that draws 3 shapes, technically 4 to the screen. A blue square, red circle, and green cross.
	 * Pseudo-Code:
	 * - Create and style gridpane
	 * - Create and style blue rectangle
	 * - Create and style red circle
	 * - Create and style green cross
	 * - Add these nodes to the gridpane
	 * - Create scene with gridpane and display
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			//Create grid pane
			GridPane root = new GridPane();
			//Sets padding, space on inside
			root.setPadding(new Insets(20, 20, 20, 20));
			//Center each node in its respective square
			root.setAlignment(Pos.CENTER); 
			
			//Blue rectangle and color assignment
			Rectangle blueSquare= new Rectangle(0, 0, 100, 100);
			blueSquare.setFill(Color.BLUE);
			
			//Red circle and color assignment and radius
			Circle redCircle= new Circle();
			redCircle.setFill(Color.RED);
			redCircle.setRadius(50);
			
			//Green cross is made using 2 lines
			Line greenOne= new Line(-40, -20, 40, -20);
			Line greenTwo= new Line(0, -50, 0, 50);
			//Sets the size and color of the lines
			greenOne.setStrokeWidth(5);
			greenTwo.setStrokeWidth(5);
			greenOne.setStroke(Color.GREEN);
			greenTwo.setStroke(Color.GREEN);
			
			//Add nodes to gridpane
			root.add(blueSquare, 0, 0);
			root.add(redCircle, 1, 1);
			//added both lines in new group because before the alignment was centering the cross, but if they are in a group, only the group itself is centered.
			root.add(new Group(greenOne, greenTwo), 2, 2);
			
			//Create new scene
			Scene scene = new Scene(root,400,400);
			//I dont believe this line is necessary, but it was here in the default javaFX project
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
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
