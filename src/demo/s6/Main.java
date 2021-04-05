package demo.s6;

import java.sql.*;

public class Main {
    public final static String connectString ="jdbc:mysql://localhost:3306/T2008M?useUnicode=true&characterEncoding=utf-8" ;
    public final static String user = "root";
    public final static String password = ""; // nếu dùng mamp là "root" còn xampp là ""

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectString,user,password);
            Statement stt = conn.createStatement();
//            liet ke sinh vien
            String txt_sql = "select * from SinhVien";

            ResultSet rs = stt.executeQuery(txt_sql);
            while (rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getInt("age"));
                System.out.println(rs.getInt("mark"));
            }

//            String insert_into = "insert into SinhVien(name, age, mark) values('Phạm Minh Nhật', 17, 8)";
//            stt.execute(insert_into);

        }catch (ClassNotFoundException e){
            System.out.println("CLASS NOT FOUND!!!");
        }catch (SQLException e){
            System.out.println("SQL ERROR");
        }

    }
}
