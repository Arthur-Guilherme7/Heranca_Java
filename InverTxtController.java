package org.laboratorio.br.atividaded;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class InverTxtController {
    @FXML
    private TextField textoInput;

    @FXML
    private TextField textoInvertido;

    @FXML
    private Button inverterBtn;

    @FXML
    private void inverterTexto() {
        String texto = textoInput.getText();

        if (texto.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Entrada Inválida");
            alert.setHeaderText("Nenhum texto digitado");
            alert.setContentText("Por favor, insira um texto antes de inverter.");
            alert.showAndWait();
            return;
        }

        String textoReverso = new StringBuilder(texto).reverse().toString();
        textoInvertido.setText(textoReverso);
    }
}