package demo.managestudent.home;

import demo.managestudent.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class homeController {
    public void danhSach() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../danhsach/ds.fxml"));
        Main.mainStage.setScene(new Scene(root, 600, 400));
    }

    public void themSv() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../themmoi/themsv.fxml"));
        Main.mainStage.setScene(new Scene(root, 600, 400));
    }
}
