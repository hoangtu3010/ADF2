package assignment1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField name;
    public TextField age;
    public TextField mark;
    public TableView<SinhVien> ds;
    public Text validate;
    public Button sort;
    public TableColumn<SinhVien, String> tenSV;
    public TableColumn<SinhVien, Integer> tuoiSV;
    public TableColumn<SinhVien, Integer> diemSV;

    ObservableList<SinhVien> dsSinhVien = FXCollections.observableArrayList();
    static boolean sortType = true;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tenSV.setCellValueFactory(new PropertyValueFactory<SinhVien, String>("name"));
        tuoiSV.setCellValueFactory(new PropertyValueFactory<SinhVien, Integer>("age"));
        diemSV.setCellValueFactory(new PropertyValueFactory<SinhVien, Integer>("mark"));
    }

    public void add(){
        try {
            String n = this.name.getText();
            int a = Integer.parseInt(age.getText());
            int m = Integer.parseInt(mark.getText());
            if (!n.isEmpty()) {
                SinhVien s = new SinhVien(n, a, m);
                dsSinhVien.add(s);
                String txt = "";
                for (SinhVien d : dsSinhVien) {
                    txt += d.getName() + " -- " + d.getAge() + " -- " +d.getMark() +"\n";
                }
                ds.setItems(dsSinhVien);
                validate.setText("");
                name.setText("");
                age.setText("");
                mark.setText("");
            } else {
                validate.setText("Vui lòng nhập Name, Age và Mark");
                validate.setDisable(false);
            }
        }catch (Exception e){
            validate.setText("Vui lòng nhập Name, Age và Mark");
            validate.setDisable(false);
        }
    }

    public void sort(){
        sortType = !sortType;
        if (sortType){
            Collections.sort(dsSinhVien, new Comparator<SinhVien>() {
                @Override
                public int compare(SinhVien o1, SinhVien o2) {
                    return o2.getMark() - o1.getMark();
                }
            });
            sort.setText("Cao đến thấp");
        }else {
            Collections.sort(dsSinhVien, new Comparator<SinhVien>() {
                @Override
                public int compare(SinhVien o1, SinhVien o2) {
                    return o1.getMark() - o2.getMark();
                }
            });
            sort.setText("Thấp đến cao");
        }
        String txt = "";
        for (SinhVien d : dsSinhVien) {
            txt += d.getName() + " -- " + d.getAge() + " -- " +d.getMark() +"\n";
        }
        ds.setItems(dsSinhVien);
    }
}
