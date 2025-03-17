package com.atv_l.atv_l;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

import java.security.SecureRandom;

public class AtvlController {

    @FXML
    private TextField senha;
    @FXML
    private TextField SenhaGerador;
    @FXML
    private Button botaoGerador;

    @FXML
    private void GeradorSenha() {
        String lengthText = senha.getText();
        try {
            int length = Integer.parseInt(lengthText);
            if (length < 4) {
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Tamanho inválido");
                alert.setHeaderText(null);
                alert.setContentText("A senha deve ter no mínimo 4 caracteres.");
                alert.showAndWait();
            } else {
                String password = GeradorAleatorioSenha(length);
                SenhaGerador.setText(password);
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, insira um número válido.");
            alert.showAndWait();
        }
    }

    private String GeradorAleatorioSenha(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }
}