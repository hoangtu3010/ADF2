package models;

import java.util.ArrayList;

public interface DataAccessObject<S> {
    ArrayList<S> getList();

    ArrayList<S> getListWithSort(String column,String type);
    S findOne(Integer id);
    boolean create(S s);
    boolean update(S s);
    boolean delete(S s);
}
