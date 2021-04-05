package assignment3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static Stage mainStage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("../assignment3/home.fxml"));
        primaryStage.setTitle("Home");
        primaryStage.setScene(new Scene(root, 800, 400));
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}
