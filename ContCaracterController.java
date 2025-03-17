package org.laboratorio.br.atividadec;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ContCaracterController {
    @FXML
    private TextField textoInput;

    @FXML
    private Label resultadoLabel;

    @FXML
    private Button contarBtn;

    @FXML
    private void contarCaracteres() {
        String texto = textoInput.getText();
        int quantidade = texto.length();
        resultadoLabel.setText("Número de caracteres: " + quantidade);
    }
}