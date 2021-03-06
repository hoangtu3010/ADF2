package demo.managestudent.danhsach;

import config.Connector;
import demo.managestudent.Main;
import models.entity.SinhVien;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import models.ModelSinhVien;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class dsController implements Initializable {
    public void trangChu() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../home/home.fxml"));
        Main.mainStage.setScene(new Scene(root, 600, 400));
    }

    public TableView<SinhVien> tbview;
    public TableColumn<SinhVien,String> txtName;
    public TableColumn<SinhVien,Integer> txtAge;
    public TableColumn<SinhVien,Integer> txtMark;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtName.setCellValueFactory(new PropertyValueFactory<SinhVien, String>("name"));
        txtAge.setCellValueFactory(new PropertyValueFactory<SinhVien, Integer>("age"));
        txtMark.setCellValueFactory(new PropertyValueFactory<SinhVien, Integer>("mark"));

        ObservableList<SinhVien> ds = FXCollections.observableArrayList();
        //lay tu db cach2
        ModelSinhVien modelSinhVien = new ModelSinhVien();
        ds.addAll(modelSinhVien.getList());
        tbview.setItems(ds);

        // lay sinh vien tu file studen.bin de nap vao danh sach
//        try {
//            FileInputStream fis = new FileInputStream("student.bin");
//            DataInputStream dis = new DataInputStream(fis);
//            int line = 0;
//            String txt =  dis.readLine();
//            String[] str = new String[3];
//            while (txt != null){
//                str[line] = txt;
//                line++;
//                txt = dis.readLine();
//                if (line >= 3){
//                    SinhVien sv = new SinhVien(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]));
//                    ds.add(sv);
//                    line = 0;
//                }
//            }
//            tbview.setItems(ds);
//        }catch (IOException io){
//            System.out.println("ERROR");
//        }

        //lay tu db
//        try {
//            Statement stt = Connector.getInstance().getStatement();
//            //liet ke sinh vien
//            String txt_sql = "select * from SinhVien";
//
//            ResultSet rs = stt.executeQuery(txt_sql);
//            while (rs.next()){
////                System.out.println(rs.getInt("id"));
//                String name = rs.getString("name");
//                int age = rs.getInt("age");
//                int mark = rs.getInt("mark");
//                SinhVien sv = new SinhVien(name, age, mark);
//                ds.add(sv);
//            }
//            tbview.setItems(ds);
////            String insert_into = "insert into SinhVien(name, age, mark) values('Ph???m Minh Nh???t', 17, 8)";
////            stt.execute(insert_into);
//
//        }catch (SQLException e){
//
//        }
    }
}
