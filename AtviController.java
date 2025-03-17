package com.atv_i.atv_i;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AtviController {
    @FXML
    private TextField celcius;


    @FXML
    private Label resultado;

    @FXML
    protected void ClickBotao() {

        try {

            double temp = Double.parseDouble(celcius.getText());

            double result = (temp * 1.8) + 32;

            Alert msg = new Alert(Alert.AlertType.INFORMATION);
            msg.setTitle("Conversão de Temperatura");
            msg.setContentText(" Conversão para Farehneint: " + result);
            msg.showAndWait();

            resultado.setText("Resultado: "+ result );



        } catch (NumberFormatException e ) {

            Alert msg = new Alert(Alert.AlertType.ERROR);
            msg.setTitle("ERROR!");
            msg.setHeaderText("ERROR!");
            msg.setContentText("Digite apenas números");
            msg.showAndWait();

            celcius.setText("");


        }
    }
}