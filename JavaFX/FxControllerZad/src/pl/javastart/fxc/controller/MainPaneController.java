package pl.javastart.fxc.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPaneController implements Initializable {
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        label1.setText("Etykieta 1");
        label2.setText("Etykieta 2");
        button1.setText("Przycisk 1");
        button2.setText("Przycisk 2");
    }
    @FXML
    private Label label1;

    @FXML
    private Button button1;

    @FXML
    private Label label2;

    @FXML
    private Button button2;

}
