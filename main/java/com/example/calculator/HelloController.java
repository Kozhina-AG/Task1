package com.example.calculator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.skin.RadioButtonSkin;
import model.Calculator;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

// связь модели и вьюшки
public class HelloController {

    Calculator calculator = new Calculator();

    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;
    @FXML
    private RadioButton rb1 = new RadioButton();
    @FXML
    private RadioButton rb2 = new RadioButton();
    @FXML
    private RadioButton rb3 = new RadioButton();

    @FXML
    protected void percent() {
        if(rb1.isSelected()){
            calculator.setPercent(3.0);
        }else if(rb2.isSelected()){
            calculator.setPercent(10.0);
        }else if(rb3.isSelected()){
            calculator.setPercent(15.0);
        }
    }

    @FXML
    protected void onHelloButtonClick() {
        calculator.setNumber(Double.valueOf(textField1.getText()));

        textField2.setText(String.valueOf(calculator.calc()));
    }
}