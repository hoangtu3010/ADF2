package demo.managestudent.themmoi;

import config.Connector;
import demo.managestudent.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import models.ModelSinhVien;
import models.entity.SinhVien;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;

public class themController {
    public TextField inName;
    public TextField inAge;
    public TextField inMark;
    public Text validate;

    public final static String connectString ="jdbc:mysql://localhost:3306/T2008M?useUnicode=true&characterEncoding=utf-8" ;
    public final static String user = "root";
    public final static String password = ""; // nếu dùng mamp là "root" còn xampp là ""

    ModelSinhVien modelSinhVien = new ModelSinhVien();

    public void trangChu() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../home/home.fxml"));
        Main.mainStage.setScene(new Scene(root, 600, 400));
    }

    public void btn_add() throws Exception{
        //Nap vao file student.bin
//        try {
//            FileInputStream fis = new FileInputStream("student.bin");
//            DataInputStream dis = new DataInputStream(fis);
//            String txt = dis.readLine();
//            ArrayList<String> ar = new ArrayList<>();
//            while (txt != null){
//                ar.add(txt);
//                txt = dis.readLine();
//            }
//
//            FileOutputStream fos = new FileOutputStream("student.bin");
//            DataOutputStream dos = new DataOutputStream(fos);
//            dos.writeBytes(inName.getText()+"\n");
//            dos.writeBytes(inAge.getText()+"\n");
//            dos.writeBytes(inMark.getText()+"\n");
//            for (String a:ar){
//                dos.writeBytes(a+"\n");
//            }
//            inName.setText("");
//            inAge.setText("");
//            inMark.setText("");
//            validate.setText("Thêm thành công");
//            validate.setDisable(false);
//            Parent root = FXMLLoader.load(getClass().getResource("../danhsach/ds.fxml"));
//            Main.mainStage.setScene(new Scene(root, 600, 400));
//
//        }catch (IOException io){
//            System.out.println("FILE ERROR");
//        }

        //Nap vao db
            String txtName = inName.getText();
            Integer txtAge = Integer.parseInt(inAge.getText());
            Integer txtMark = Integer.parseInt(inMark.getText());
            SinhVien sv = new SinhVien(null,txtName,txtAge,txtMark);
            if (modelSinhVien.create(sv)){
                validate.setText("Thêm thành công");
                validate.setDisable(false);
            }else {
                validate.setText("Lỗi");
                validate.setDisable(false);
            }
            inName.setText("");
            inAge.setText("");
            inMark.setText("");

            Parent root = FXMLLoader.load(getClass().getResource("../danhsach/ds.fxml"));
            Main.mainStage.setScene(new Scene(root, 600, 400));
//            try {
//                Statement stt = conn.createStatement();
//            if (!inName.getText().isEmpty()){
//                String insert = "insert into sinhvien(name,age,mark) values('"+inName.getText()+"',"+Integer.parseInt(inAge.getText())+","+Float.parseFloat(inMark.getText())+")";
//                stt.execute(insert);
//                validate.setText("Them thanh cong");
//                validate.setDisable(false);
//            }
//
//            inName.setText("");
//            inAge.setText("");
//            inMark.setText("");
//            }catch (Exception e){
//
//            }
//
    }
}
