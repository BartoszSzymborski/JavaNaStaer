package pl.javastart.mp3player.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;


import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private ContentPaneController contentPaneController;

    @FXML
    private ControlPaneController controlPaneController;

    @FXML
    private MenuPaneController menuPaneController;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(contentPaneController);
        System.out.println(controlPaneController);
        System.out.println(menuPaneController);
    }
}
