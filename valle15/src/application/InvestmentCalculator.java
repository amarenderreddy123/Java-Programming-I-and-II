package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class InvestmentCalculator extends Application {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This is a javaFX program that displays the future value of an investment will return using textfields and buttons.
	 * Pseudo-Code:
	 * - Create textfields
	 * - Create gridpane and style
	 * - SetOnAction for calculate button
	 * - Using the formula, override handle to update the future value textfield
	 * - Display
	 */
	
	//creating textfields for program
	private TextField tfInvestmentAmount = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tfFutureValue = new TextField();
	private Button btCalculate = new Button("Calculate");
	@Override
	public void start(Stage primaryStage) {
		try {
			//Create and style pane, giving it labels, and textfields
			GridPane gridPane = new GridPane();
			gridPane.setHgap(5);
			gridPane.setVgap(5);
			gridPane.add(new Label("Investment Amount:"), 0, 0);
			gridPane.add(tfInvestmentAmount, 1, 0);
			gridPane.add(new Label("Number of Years:"), 0, 1);
			gridPane.add(tfNumberOfYears, 1, 1);
			gridPane.add(new Label("Annual Interest Rate:"), 0, 2);
			gridPane.add(tfAnnualInterestRate, 1, 2);
			gridPane.add(new Label("Future Value:"), 0, 3);
			gridPane.add(tfFutureValue, 1, 3);
			gridPane.add(btCalculate, 1, 4);
			
			//setting the alignment for all the nodes
			gridPane.setAlignment(Pos.CENTER);
			tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
			tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
			tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
			tfFutureValue.setAlignment(Pos.BOTTOM_RIGHT);
			tfFutureValue.setEditable(false); //disables typing in the "results" textfield
			GridPane.setHalignment(btCalculate, HPos.RIGHT);
			
			//Calculate button
			btCalculate.setOnAction(new EventHandler<ActionEvent>() {
				@Override
		        public void handle(ActionEvent e) {
					//Variables - need to convert them all from type String and doing it all in the futureInvestmentValue method call made my code harder to understand
					int years  =Integer.parseInt(tfNumberOfYears.getText());
					double investmentAmount = Double.parseDouble(tfInvestmentAmount.getText());
					double monthlyInterestRate = (Double.parseDouble(tfAnnualInterestRate.getText()) / 12); //tfAnnualInterestRate textfield provides annual interest rate, divide by 12 for monthly interest rate
					monthlyInterestRate *= 0.01; //convert for calculations
					double futureValue=futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
					
					//setting the text field to display the formatted value
					tfFutureValue.setText(String.format("$%.2f", futureValue));
				}
				//method that returns futureInvestValue using the provided formula
				public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
					return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
				}
			});
			
			//Output
			Scene scene = new Scene(gridPane, 400, 400);
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
