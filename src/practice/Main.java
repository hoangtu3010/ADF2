package practice;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ListContact lc = new ListContact();
        java.util.HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Tú", "0123456789");
        hashMap.put("Nam", "0999888777");
        lc.menu();
    }
}
