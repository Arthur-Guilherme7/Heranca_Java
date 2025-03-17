package org.laboratorio.br.atividadeg;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class PalindromoController {

    @FXML
    private TextField entradaTexto;

    @FXML
    private void verificarPalindromo() {
        String texto = entradaTexto.getText().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (texto.isEmpty()) {
            mostrarAlerta("Entrada Inválida", "Por favor, insira um texto para verificar.");
            return;
        }

        String textoInvertido = new StringBuilder(texto).reverse().toString();
        boolean ehPalindromo = texto.equals(textoInvertido);

        String mensagem = ehPalindromo ? "É um palíndromo!" : "Não é um palíndromo.";
        mostrarAlerta("Resultado", mensagem);
    }

    private void mostrarAlerta(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}