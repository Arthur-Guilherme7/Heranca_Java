package com.atv_o.atv_o;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.HashMap;
import java.util.Map;

public class AtvoController {


    private final Map<String, String> dictionary = new HashMap<>();

    @FXML
    private TextField inputWord;

    @FXML
    private TextField outputWord;

    @FXML
    private Button translateButton;

    public AtvoController() {

        dictionary.put("olá", "hello");
        dictionary.put("mundo", "world");
        dictionary.put("cachorro", "dog");
        dictionary.put("gato", "cat");
        dictionary.put("livro", "book");
        dictionary.put("carro", "car");
    }


    @FXML
    public void Tradutor() {
        String wordInPortuguese = inputWord.getText().trim().toLowerCase();

        if (dictionary.containsKey(wordInPortuguese)) {
            String translatedWord = dictionary.get(wordInPortuguese);
            outputWord.setText(translatedWord);
        } else {
            showAlert(AlertType.ERROR, "Erro", "Tradução não disponível para a palavra '" + wordInPortuguese + "'.");
            outputWord.clear();
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
