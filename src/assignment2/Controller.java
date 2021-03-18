package assignment2;

import assignment1.SinhVien;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.text.Text;
import javafx.util.converter.IntegerStringConverter;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField name;
    public TextField age;
    public TextField mark;
    public TableView<SinhVien> ds;
    public Text validate;
    public Button edit;
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

        ds.setEditable(true);
        tenSV.setCellFactory(TextFieldTableCell.forTableColumn());
        tuoiSV.setCellFactory(TextFieldTableCell.<SinhVien, Integer>forTableColumn(new IntegerStringConverter()));
        diemSV.setCellFactory(TextFieldTableCell.<SinhVien, Integer>forTableColumn(new IntegerStringConverter()));
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

    public void onEditName(TableColumn.CellEditEvent<SinhVien, String> sinhVienStringCellEditEvent) {
        SinhVien sv = ds.getSelectionModel().getSelectedItem();
        sv.setName(sinhVienStringCellEditEvent.getNewValue());
    }

    public void onEditAge(TableColumn.CellEditEvent<SinhVien, Integer> sinhVienIntegerCellEditEvent) {
        SinhVien sv = ds.getSelectionModel().getSelectedItem();
        sv.setAge(sinhVienIntegerCellEditEvent.getNewValue());
    }

    public void onEditMark(TableColumn.CellEditEvent<SinhVien, Integer> sinhVienIntegerCellEditEvent) {
        SinhVien sv = ds.getSelectionModel().getSelectedItem();
        sv.setMark(sinhVienIntegerCellEditEvent.getNewValue());
    }
}
