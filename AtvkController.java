package com.atv_k.atv_k;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Duration;
import java.util.Optional;


public class AtvkController {


    @FXML
    private TextField TaxaJuros;
    @FXML
    private TextField Capital;

    @FXML
    private TextField TempoMes;

    @FXML
    private Label resultado;




    @FXML
    protected void CalcJurosComp() {


        if (Capital.getText().isEmpty() || TaxaJuros.getText().isEmpty() || TempoMes.getText().isEmpty()) {
            Alert mensag = new Alert(Alert.AlertType.ERROR);
            mensag.setTitle("ERROR!");
            mensag.setHeaderText("Erro de Entrada");
            mensag.setContentText("Por favor, preencha todos os campos.");
            mensag.showAndWait();
            return;

        }

            try {


            double Capi1 = Double.parseDouble(Capital.getText());
            double TaxaJ = Double.parseDouble(TaxaJuros.getText());
            double Temp = Double.parseDouble(TempoMes.getText());

            double montante =  Capi1 * Math.pow((1 + TaxaJ / 100), Temp);


            Alert msg = new Alert(Alert.AlertType.INFORMATION);
            msg.setTitle("Consulta");
            msg.setHeaderText("Resultado da Consulta");
            msg.setContentText("Resultado: " + montante);
            msg.showAndWait();




            PauseTransition pause = new PauseTransition(Duration.seconds(3));
            pause.setOnFinished( e -> resultado.setText(""));
            pause.play();

        } catch (NumberFormatException e){
            Alert msg = new Alert(Alert.AlertType.ERROR);
            msg.setTitle("ERROR!");
            msg.setHeaderText("ERROR!");
            msg.setContentText("O valor informado é invalido!");
            msg.showAndWait();

            Capital.setText("");
            TaxaJuros.setText("");
            TempoMes.setText("");

        }

    }
}