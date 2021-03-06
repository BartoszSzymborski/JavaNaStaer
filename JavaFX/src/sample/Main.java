package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public Main(){
        System.out.println("Constructor");
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("Start");
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception{
        System.out.println("init");
    }
    @Override
    public void stop() throws Exception {
        System.out.println("stop");
    }
}
