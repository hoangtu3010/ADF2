package practice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ListContact implements Menu{
    java.util.HashMap<String, String> hashMap = new HashMap<>();

    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add contact");
        System.out.println("2. Search contact");
        System.out.println("3. Show list contact");
        System.out.println("0. Exit");
        System.out.println("Nhập lựa chọn của bạn: ");
        int n = sc.nextInt();
        if (n >= 0 && n < 4){
            if (n == 1){
                System.out.println("Nhập tên: ");
                String name = sc.nextLine();
                sc.nextLine();
                System.out.println("Nhập sđt: ");
                String sdt = sc.nextLine();
                hashMap.put(name, sdt);
                menu();
            }else if (n == 2){
                searchContact(sc.nextLine());
                menu();
            }else if (n == 3){
                showContact(hashMap);
                menu();
            }else if (n == 0){
                exit();
            }
        }
    }

    @Override
    public void addContact(String name, String sdt) {

    }

    @Override
    public void searchContact(String sdt) {
        Set<String> keySet = hashMap.keySet();
        for (String key : keySet){
            if (key.equalsIgnoreCase(sdt));
        }
    }

    @Override
    public void showContact(HashMap<String, String> hashMap) {
        Set<String> keySet = hashMap.keySet();
        for (String key : keySet){
            System.out.println(key + "-" + hashMap.get(key));
        }
    }

    @Override
    public void exit() {
        System.out.println("End");
        return;
    }
}
