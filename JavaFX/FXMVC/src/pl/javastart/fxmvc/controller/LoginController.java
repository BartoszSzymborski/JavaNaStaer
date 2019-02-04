

package pl.javastart.fxmvc.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private AnchorPane loginAnchorPane;

    @FXML
    private Button loginButton;

    @FXML
    private Label usernameLabel;

    @FXML
    private TextField usernameTextField;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        System.out.println(usernameLabel.getText());
        usernameTextField.setText("Wpisz swoje imię");
    }
}
