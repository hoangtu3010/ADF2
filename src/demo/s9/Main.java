package demo.s9;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
        ResourceBundle us = ResourceBundle.getBundle("demo.s9.Session9_Messages", Locale.US);
        Locale vi = new Locale("vi", "VN");
        Locale.setDefault(vi);
        ResourceBundle vn = ResourceBundle.getBundle("demo.s9.Session9_Messages");
        System.out.println("Xin chao bang tieng anh: " + us.getString("hello"));
        System.out.println("Xin chao bang tieng viet: " + vn.getString("hello"));
    }
}
