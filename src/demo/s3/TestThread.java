package demo.s3;

public class TestThread extends Thread{
    public void start(){
//        for (int i = 9; i > 0; i--){
//            for (int j = 59; j > 0; j--){
//                System.out.println(i + " phút " + j + " giây ");
//                try {
//                    Thread.sleep(1000);
//                }catch (Exception e){
//
//                }
//            }
//        }

        int min = 10;
        int sec = 0;
        while (min >= 0){
            while (sec >= 0){
                System.out.println((min >= 10?min:"0"+min)+":"+(sec >= 10?sec:"0"+sec));
                sec--;
                if (sec < 0){
                    sec = 59;
                    min--;
                }
                try {
                    Thread.sleep(1000);
                }catch (Exception e){

                }
            }
        }
    }
}
