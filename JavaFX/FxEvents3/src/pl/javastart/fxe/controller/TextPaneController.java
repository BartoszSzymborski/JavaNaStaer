package pl.javastart.fxe.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class TextPaneController {

    @FXML
    private TextArea inputTextArea;

    @FXML
    private TextArea outputTextArea;

    public TextArea getInputTextArea() {
        return inputTextArea;
    }

    public void setInputTextArea(TextArea inputTextArea) {
        this.inputTextArea = inputTextArea;
    }

    public TextArea getOutputTextArea() {
        return outputTextArea;
    }

    public void setOutputTextArea(TextArea outputTextArea) {
        this.outputTextArea = outputTextArea;
    }
}
