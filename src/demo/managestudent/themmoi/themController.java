package demo.managestudent.themmoi;

import demo.managestudent.Main;
import demo.managestudent.model.SinhVien;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.*;
import java.util.ArrayList;

public class themController {
    public TextField inName;
    public TextField inAge;
    public TextField inMark;
    public Text validate;

    public void trangChu() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../home/home.fxml"));
        Main.mainStage.setScene(new Scene(root, 600, 400));
    }



    public void btn_add(){
        try {
            FileInputStream fis = new FileInputStream("student.bin");
            DataInputStream dis = new DataInputStream(fis);
            String txt = dis.readLine();
            ArrayList<String> ar = new ArrayList<>();
            while (txt != null){
                ar.add(txt);
                txt = dis.readLine();
            }

            FileOutputStream fos = new FileOutputStream("student.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeBytes(inName.getText()+"\n");
            dos.writeBytes(inAge.getText()+"\n");
            dos.writeBytes(inMark.getText()+"\n");
            for (String a:ar){
                dos.writeBytes(a+"\n");
            }
            inName.setText("");
            inAge.setText("");
            inMark.setText("");
            validate.setText("Thêm thành công");
            validate.setDisable(false);
            Parent root = FXMLLoader.load(getClass().getResource("../danhsach/ds.fxml"));
            Main.mainStage.setScene(new Scene(root, 600, 400));

        }catch (IOException io){
            System.out.println("FILE ERROR");
        }
    }
}
