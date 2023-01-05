package com.example.c111118233_final_project;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.stream.Stream;

public class HelloController {
    @FXML
    private ComboBox<String> from;
    @FXML
    private ComboBox<String> to;
    @FXML
    private TextField input;
    @FXML
    private TextField output;
    @FXML
    private Hyperlink link;
    String[] money_name = {"USD", "TWD", "JPY", "CNY", "CAD", "EUR", "HKD", "GBP"};
    public void initialize(){
        from.setItems(FXCollections.observableArrayList(money_name));
        to.setItems(FXCollections.observableArrayList(money_name));
        from.setValue("USD");
        to.setValue("TWD");
    }
    public void get_ans(ActionEvent event) throws IOException, InterruptedException {
        Double ans = Double.parseDouble(input.getText()) * http.get_exchange_rate(from.getSelectionModel().getSelectedItem(), to.getSelectionModel().getSelectedItem());
        output.setText(String.format("%.2f", ans));
    }
    public void swap(){
        String temp = from.getValue();
        from.setValue(to.getValue());
        to.setValue(temp);
    }




}