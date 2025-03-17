package com.atv_m.atv_m;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AtvmController {
    @FXML
    private TextField NomeSorteio;

    @FXML
    private Label Resultado;

    @FXML
    protected void SimuladorSorteio() {

        String input = NomeSorteio.getText();
        String[] namesArray = input.split(",");
        List<String> namesList = new ArrayList<>();


        for (String name : namesArray) {
            if (!name.trim().isEmpty()) {
                namesList.add(name.trim());
            }
        }

        if (namesList.size() <= 1) {

            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Nome insuficiente");
            alert.setHeaderText(null);
            alert.setContentText("É necessário inserir mais de um nome.");
            alert.showAndWait();
        } else {

            Random random = new Random();
            String sorteado = namesList.get(random.nextInt(namesList.size()));
            Resultado.setText("Nome sorteado: " + sorteado);
        }
    }
}
