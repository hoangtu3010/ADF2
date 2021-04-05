package demo.s3;

public class DemoThread extends Thread{
    public void run(){
        for (int i = 0; i < 20; i++){
            System.out.println(Thread.currentThread().getName()+"i = " + i);
            try{
                Thread.sleep(500);
            }catch (Exception e){

            }
        }
    }
}
