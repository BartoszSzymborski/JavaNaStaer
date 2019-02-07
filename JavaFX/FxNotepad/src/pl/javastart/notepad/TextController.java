package pl.javastart.notepad;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class TextController implements Initializable {

    @FXML
    private TextArea textArea;

    @FXML
    private Button button;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button.setOnAction(x->textArea.clear());
    }
}
