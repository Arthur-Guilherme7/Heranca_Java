package org.laboratorio.br.atividadeh;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ContVogaisController {

    @FXML
    private TextField entradaTexto;

    @FXML
    private Label resultadoLabel;

    @FXML
    private void contarVogais() {
        String texto = entradaTexto.getText().toLowerCase();
        int contador = 0;

        for (char c : texto.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }

        resultadoLabel.setText("Quantidade de vogais: " + contador);
    }
}