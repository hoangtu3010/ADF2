package assignment3;

import assignment2.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class modelController {
    public TextField name;
    public TextField age;
    public TextField mark;

    public void screenDS() throws Exception{
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../assignment2/ass2.fxml"));
        Main.mainStage.setTitle("Danh sách sinh viên");
        Main.mainStage.setScene(new Scene(root, 800, 600));
        Main.mainStage.show();
    }

    public void screenAdd() throws Exception{
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../assignment3/add.fxml"));
        Main.mainStage.setTitle("Thêm sinh viên");
        Main.mainStage.setScene(new Scene(root, 600, 400));
        Main.mainStage.show();
    }

    public void screenEdit() throws Exception{
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../assignment3/edit.fxml"));
        Main.mainStage.setTitle("Sửa sinh viên");
        Main.mainStage.setScene(new Scene(root, 600, 400));
        Main.mainStage.show();
    }

    public void back() throws Exception {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.mainStage.setTitle("Home");
        Main.mainStage.setScene(new Scene(root, 800, 400));
        Main.mainStage.show();
    }

    public void changeSceneAdd() throws Exception{
        screenDS();
    }

    public void changeSceneEdit() throws Exception{
        screenDS();
    }

}
