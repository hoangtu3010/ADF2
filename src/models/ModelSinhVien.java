package models;

import config.Connector;
import models.entity.SinhVien;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ModelSinhVien implements DataAccessObject<SinhVien>{

    @Override
    public ArrayList<SinhVien> getList() {
        ArrayList<SinhVien> arrayList = new ArrayList<>();
        try {
            Statement stt = Connector.getInstance().getStatement();
            String txt_sql = "select * from SinhVien";
            ResultSet rs = stt.executeQuery(txt_sql);
            while (rs.next()){
                arrayList.add(new SinhVien(rs.getInt("id"),rs.getString("name"),rs.getInt("age"),rs.getInt("mark")));
            }

        }catch (Exception e){

        }
        return arrayList;
    }

    @Override
    public boolean create(SinhVien sinhVien) {
        try {
            Statement stt = Connector.getInstance().getStatement();
            String txt_sql = "insert into SinhVien(name, age, mark) values('"+sinhVien.getName()+"',"+sinhVien.getAge()+","+sinhVien.getMark()+")";
            stt.execute(txt_sql);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public ArrayList<SinhVien> getListWithSort(String column, String type) {
        ArrayList<SinhVien> arrayList = new ArrayList<>();
        try {
            Statement stt = Connector.getInstance().getStatement();
            String txt_sql = "select * from SinhVien order by "+column+""+type;
            ResultSet rs = stt.executeQuery(txt_sql);
            while (rs.next()){
                arrayList.add(new SinhVien(rs.getInt("id"),rs.getString("name"),rs.getInt("age"),rs.getInt("mark")));
            }
        }catch (Exception e){

        }
        return arrayList;
    }

    @Override
    public SinhVien findOne(Integer id) {
        String txt_sql = "select * from SinhVien where id =" + id;
        try {
            Statement stt = Connector.getInstance().getStatement();
            ResultSet rs = stt.executeQuery(txt_sql);
            while (rs.next()){
                return new SinhVien(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getInt("mark"));
            }
        }catch (Exception e){

        }
        return null;
    }

    @Override
    public boolean update(SinhVien sinhVien) {
        String txt_sql = "update SinhVien set name= '"+sinhVien.getName()+"', age="+sinhVien.getAge()+", mark="+sinhVien.getMark()+" where id="+sinhVien.getId();
        return false;
    }

    @Override
    public boolean delete(SinhVien sinhVien) {
        String txt_sql = "select * from SinhVien where id = "+ sinhVien.getId();
        return false;
    }
}
