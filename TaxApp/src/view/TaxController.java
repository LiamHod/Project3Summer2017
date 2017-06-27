package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.TaxModel;
import java.math.BigDecimal;

public class TaxController {

    @FXML
    private TextField nameTextBox;

    @FXML
    private TextField incomeTextBox;

    @FXML
    private TextField percentTextBox;

    @FXML
    private TextField totalTextBox;

    @FXML
    private Label titleLabel;


    @FXML
    void handleCalculate(ActionEvent event) {
        BigDecimal income = new BigDecimal(incomeTextBox.getText());
        BigDecimal percent = new BigDecimal(percentTextBox.getText());
        TaxModel newTax = new TaxModel(nameTextBox.getText(),income,percent);
        BigDecimal total = newTax.getTax();
        titleLabel.setText(newTax.getName()+"'s "+"Tax Calculator");
        totalTextBox.setText(total.toString());
    }

    @FXML
    void handleClear(ActionEvent event) {
        incomeTextBox.clear();
        percentTextBox.clear();
        nameTextBox.clear();
        totalTextBox.clear();
        titleLabel.setText("Tax Calculator");
    }
}


