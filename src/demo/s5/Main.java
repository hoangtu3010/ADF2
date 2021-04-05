package demo.s5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // write file
            FileOutputStream fos = new FileOutputStream("data.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeBytes("Hello World\n");
            dos.writeBytes("Day la mon ADF2");

            // read file
            FileInputStream fis = new FileInputStream("data.bin");
            DataInputStream dis = new DataInputStream(fis);
            String txt = "";
            while (txt != null){
                System.out.println(txt);
                txt = dis.readLine();
            }
        }catch (FileNotFoundException f){
            System.out.println("FILE NOT FOUND!");
        }catch (IOException io){
            System.out.println("FILE ERROR");
        }



    }
}
