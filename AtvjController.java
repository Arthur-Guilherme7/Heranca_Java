package com.atv_j.atv_j;

import javafx.fxml.FXML;
import javafx.scene.control.*;


public class AtvjController {
    @FXML
    private TextField valorReaisField;

    @FXML
    private TextArea resultadoArea;

    @FXML
    private Button converterButton;


    private final double dolarCotacao = 6.12;
    private final double euroCotacao = 6.21;
    private final double libraCotacao = 7.57;


    @FXML
    private void converterMoeda() {
        try {

            double valorReais = Double.parseDouble(valorReaisField.getText());

            if (valorReais <= 0) {

                showAlert("Erro", "Por favor, insira um valor positivo.");
                return;
            }


            double valorEmDolar = valorReais / dolarCotacao;
            double valorEmEuro = valorReais / euroCotacao;
            double valorEmLibra = valorReais / libraCotacao;


            String resultado = String.format("Com R$ %.2f, você pode converter para:\n", valorReais) +
                    String.format("Dólar: %.2f\n", valorEmDolar) +
                    String.format("Euro: %.2f\n", valorEmEuro) +
                    String.format("Libra: %.2f\n", valorEmLibra);
            resultadoArea.setText(resultado);

        } catch (NumberFormatException e) {

            showAlert("Erro", "Por favor, insira um valor numérico válido.");
        }
    }


    private void showAlert(String titulo, String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}