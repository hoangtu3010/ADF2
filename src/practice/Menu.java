package practice;

import java.util.HashMap;

public interface Menu {
    void addContact(String name, String sdt);
    void searchContact(String sdt);
    void showContact(HashMap<String, String> hashMap);
    void exit();
}
