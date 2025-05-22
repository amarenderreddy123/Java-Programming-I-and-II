package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;

import javafx.scene.transform.Rotate;

public class Emoji extends Application {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This is a javaFX program that draws a nerd emoji.
	 * Pseudo-Code:
	 * - Create pane to add nodes to
	 * - Create and style face
	 * - Create and style leftEye
	 * - Create and style rightEye
	 * - Create and style leftFrame
	 * - Create and style rightFrame
	 * - Create and style noseRest
	 * - Create and style mouth
	 * - Add all these nodes to the pane, then display using project defaults.
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			//Pane that will be added to scene
			StackPane root = new StackPane();
			
			//Drawing "head" or background to the face
			Circle face = new Circle();
			face.setFill(Color.YELLOW);
			face.setRadius(150);
			
			//Drawing left eye using an ellipse
			Ellipse leftEye = new Ellipse(-50, -30, 15, 20);
			leftEye.setFill(Color.SADDLEBROWN);
			
			//Drawing right eye using an ellipse
			Ellipse rightEye = new Ellipse(50, -30, 15, 20);
			rightEye.setFill(Color.SADDLEBROWN);
			
			//Drawing the glasses frame on the left
			Circle leftFrame = new Circle(-60, -30, 45);
			leftFrame.setFill(Color.TRANSPARENT);
			leftFrame.setStroke(Color.DIMGRAY);
			leftFrame.setStrokeWidth(10);
			
			//Drawing the glasses frame on the right
			Circle rightFrame = new Circle(60, -30, 45);
			rightFrame.setFill(Color.TRANSPARENT);
			rightFrame.setStroke(Color.DIMGRAY);
			rightFrame.setStrokeWidth(10);
			
			//Drawing the nose rest on the glasses using a line
			Line noseRest=new Line(15, -30, -15, -30);
			noseRest.setStroke(Color.DIMGRAY);
			noseRest.setStrokeWidth(10);
			
			//Drawing the mouth using arc
			Arc mouth=new Arc(0, 80, 40, 40, 0, 180);
			mouth.setType(ArcType.OPEN);
			mouth.setStroke(Color.SADDLEBROWN);
			mouth.setStrokeWidth(10);
			mouth.setFill(Color.TRANSPARENT);
			mouth.getTransforms().add(new Rotate(180, 0, 80)); //rotating so it is a smile and not a frown
			
			//Add all nodes to the pane
			root.getChildren().add(new Group(face, leftEye, rightEye, leftFrame, rightFrame, noseRest, mouth));
			
			//Create new scene
			Scene scene = new Scene(root,400,400);
			//I don't believe this line is necessary, but it was here in the default javaFX project
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
