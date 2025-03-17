package org.laboratorio.br.atividadeb;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppVerifController {

    @FXML
    private TextField numeroInput;

    @FXML
    private Label resultadoLabel;

    @FXML
    private void verificarNumero() {
        String inputTexto = numeroInput.getText();

        try {
            int numero = Integer.parseInt(inputTexto);
            if (numero % 2 == 0) {
                resultadoLabel.setText("O número digitado é Par.");
            } else {
                resultadoLabel.setText("O número digitado é Ímpar.");
            }
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro de Entrada");
            alert.setHeaderText("Entrada Inválida");
            alert.setContentText("Por favor, digite um número inteiro válido.");
            alert.showAndWait();
        }
    }
}