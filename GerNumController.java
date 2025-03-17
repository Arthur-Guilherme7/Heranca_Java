package org.laboratorio.br.atividadef;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Random;

public class GerNumController {

    @FXML
    private TextField minimoInput;

    @FXML
    private TextField maximoInput;

    @FXML
    private Label resultadoLabel;

    private final Random random = new Random();

    @FXML
    private void gerarNumeroAleatorio() {
        try {
            int minimo = Integer.parseInt(minimoInput.getText());
            int maximo = Integer.parseInt(maximoInput.getText());

            if (minimo > maximo) {
                mostrarAlerta("Intervalo inválido", "O número mínimo não pode ser maior que o máximo.");
                return;
            }

            int numeroAleatorio = random.nextInt((maximo - minimo) + 1) + minimo;
            resultadoLabel.setText("Número gerado: " + numeroAleatorio);
        } catch (NumberFormatException e) {
            mostrarAlerta("Entrada inválida", "Por favor, insira números inteiros válidos.");
        }
    }

    private void mostrarAlerta(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
