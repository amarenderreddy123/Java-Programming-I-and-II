package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class MoveTheBall extends Application {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This is a javaFX program that uses EventHandlers and buttons to add control to the ball on screen.  Also implements screen boundaries.
	 * Pseudo-Code:
	 * - Create pane
	 * - Create circle and style
	 * - Create hBox and style
	 * - Create buttons and add them to the hBox
	 * - Add both hBox and circle to the pane
	 * - Create new scene using the pane
	 * - Override handle methods for each of the buttons in order to move circle
	 * - Display primaryStage
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			//Create pane, I chose borderpane so I could center the hBox using .setBottom()
			BorderPane root = new BorderPane();
			//Create circle that will be moving
			Circle circle = new Circle(40);
			circle.setFill(Color.TRANSPARENT);
			circle.setStroke(Color.BLACK);
			
			//Create hBox to store buttons
			HBox hBox = new HBox();
			hBox.setSpacing(10);
			hBox.setAlignment(Pos.BOTTOM_CENTER);
			Button btLeft = new Button("Left");
		    Button btRight = new Button("Right");
		    Button btUp = new Button("Up");
		    Button btDown = new Button("Down");
		    hBox.getChildren().addAll(btLeft, btRight, btUp, btDown);
		    
		    //Adding circle and hBox to the pane
			root.setCenter(circle);
			root.setBottom(hBox);
			
			//Needed to create the scene after root, but before the override methods
			Scene scene = new Scene(root, 400, 400);
			
			//Override the handle methods for each of the buttons
			btLeft.setOnAction(new EventHandler<ActionEvent>() {
		        @Override
		        public void handle(ActionEvent e) {
		        	//Each if statement takes the radius into consideration because I set the center of the shape, however I dont want any part of the shape off screen.
		        	if((circle.getCenterX() - 10) - (circle.getRadius()) < 0) {
		        		System.out.println("Reached Left Side");
		        	}
		        	else {
		        		circle.setCenterX(circle.getCenterX() - 10);
		        	}
		        }
		      });
			//Each method is the same except a variation of +/- operators and CenterX/CenterY
			btRight.setOnAction(new EventHandler<ActionEvent>() {
		        @Override
		        public void handle(ActionEvent e) {
		        	if((circle.getCenterX() + 10) + (circle.getRadius()) > scene.getWidth()) { //scene.getWidth() gives right border
		        		System.out.println("Reached Right Side");
		        	}
		        	else {
		        		circle.setCenterX(circle.getCenterX() + 10);
		        	}
		        }
		      });
			
			btUp.setOnAction(new EventHandler<ActionEvent>() {
		        @Override
		        public void handle(ActionEvent e) {
		        	if((circle.getCenterY() - 10) - (circle.getRadius()) < 0) {
		        		System.out.println("Reached Top Side");
		        	}
		        	else {
		        		circle.setCenterY(circle.getCenterY() - 10);
		        	}
		        }
		      });
			
			btDown.setOnAction(new EventHandler<ActionEvent>() {
		        @Override
		        public void handle(ActionEvent e) {
		        	if((circle.getCenterY() + 10) + (circle.getRadius()) > scene.getHeight()) { //scene.getHeight() gives bottom border
		        		System.out.println("Reached Bottom Side");
		        	}
		        	else {
		        		circle.setCenterY(circle.getCenterY() + 10);
		        	}
		        }
		      });
			
			//Show scene on primaryStage
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
