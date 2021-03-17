package assignment1;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Controller {
    public TextField name;
    public TextField age;
    public TextField mark;
    public TextArea dsSV;
    public Text validate;
    public Button sort;

    private ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
    public boolean sortType = true;

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
                dsSV.setText(txt);
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
        dsSV.setText(txt);
    }
}
