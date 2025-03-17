package com.atv_n.atv_n;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AtvnController {

    @FXML
    private TextField TempoInput;

    @FXML
    private Label TempoLabel;

    @FXML
    private Button Botao;


    @FXML
    public void TemporizadorSimples() {
        try {

            int time = Integer.parseInt(TempoInput.getText());


            if (time < 0) {
                showAlert(AlertType.ERROR, "Erro", "O tempo não pode ser negativo!");
                return;
            }


            Botao.setDisable(true);


            new Thread(() -> {

                int finalTime = time;
                while (finalTime >= 0) {
                    final int currentTime = finalTime;


                    Platform.runLater(() -> TempoLabel.setText(String.valueOf(currentTime)));

                    try {

                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    finalTime--;
                }


                Platform.runLater(() -> {
                    showAlert(AlertType.INFORMATION, "Tempo Esgotado", "O tempo acabou!");
                    Botao.setDisable(false);
                });
            }).start();

        } catch (NumberFormatException e) {

            showAlert(AlertType.ERROR, "Erro", "Por favor, insira um número válido!");
        }
    }


    private void showAlert(AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}