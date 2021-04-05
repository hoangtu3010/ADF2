package demo.managestudent.home;

import demo.managestudent.Main;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class homeController implements Initializable {
    public Button btnds;
    public Button btnthem;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ResourceBundle lang = ResourceBundle.getBundle("demo.s9.Session9_Messages");
        btnds.setText(lang.getString("list_student"));
    }

    public void danhSach() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../danhsach/ds.fxml"));
        Main.mainStage.setScene(new Scene(root, 600, 400));
    }

    public void themSv() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../themmoi/themsv.fxml"));
        Main.mainStage.setScene(new Scene(root, 600, 400));
    }
}
