package org.laboratorio.br.atividadee;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usuarioInput;

    @FXML
    private PasswordField senhaInput;

    @FXML
    private Label mensagemLabel;

    @FXML
    private void verificarLogin() {
        String usuario = usuarioInput.getText();
        String senha = senhaInput.getText();

        if ("admin".equals(usuario) && "1234".equals(senha)) {
            mensagemLabel.setText("Login bem-sucedido");
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro de Login");
            alert.setHeaderText("Usuário ou senha incorretos");
            alert.setContentText("Tente novamente.");
            alert.showAndWait();
        }
    }
}