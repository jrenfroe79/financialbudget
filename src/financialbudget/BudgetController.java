package financialbudget;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BudgetController {

    @FXML
    private TextField incomeTextField;

    @FXML
    private TextField mortgageTextField;

    @FXML
    private TextField electricTextField;

    @FXML
    private TextField carPaymentTextField;

    @FXML
    private TextField insuranceTextField;

    @FXML
    private TextField foodTextField;

    @FXML
    private TextField entertainmentTextField;

    @FXML
    private Label remainingLabel;

    private double totalIncome = 0;
    private double totalExpenses = 0;

    public void calculateRemaining() {
        totalIncome = Double.parseDouble(incomeTextField.getText());
        totalExpenses = Double.parseDouble(mortgageTextField.getText()) + Double.parseDouble(electricTextField.getText())
                + Double.parseDouble(carPaymentTextField.getText()) + Double.parseDouble(insuranceTextField.getText())
                + Double.parseDouble(foodTextField.getText()) + Double.parseDouble(entertainmentTextField.getText());

        double remaining = totalIncome - totalExpenses;
        remainingLabel.setText("Remaining Amount: $" + remaining);
    }
}
