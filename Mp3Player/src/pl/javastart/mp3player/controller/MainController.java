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
    private Menu fileMenu;

    @FXML
    private MenuItem fileMenuItem;

    @FXML
    private MenuItem dirMenuItem;

    @FXML
    private MenuItem closeMenuItem;

    @FXML
    private MenuItem aboutMenu;

    @FXML
    private TableView<?> contentTable;

    @FXML
    private Button prevButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider songSlider;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        configureButtons();
        configureVolume();
    }
    private void configureVolume(){
        volumeSlider.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Wciśnięto przycisk suwaku głośności");
            }
        });
    }
    private void configureButtons(){
        prevButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Poprzednia piosenka");
            }
        });
        nextButton.setOnAction(x-> System.out.println("Następna piosenka"));
        playButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (playButton.isSelected()){
                    System.out.println("Play");
                }else {
                    System.out.println("Stop");
                }
            }
        });
    }
}
