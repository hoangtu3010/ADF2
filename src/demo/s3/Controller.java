package demo.s3;

import javafx.application.Platform;
import javafx.scene.text.Text;

public class Controller{
    public Text txtMin;
    public Text txtSec;

    public Integer min = 0;
    public Integer sec = 10;

    public void btn(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (; min >= 0 ;){
                    for (; sec >= 0 ;){
                        if (sec < 10){

                        }
                        txtMin.setText(min.toString());
                        txtSec.setText(sec.toString());
                        sec--;
                        if (sec < 0){
                            min--;
                        }
                        try {
                            Thread.sleep(1000);
                        }catch (Exception e){

                        }
                    }
                }
//                while (min >= 0){
//                    while (sec >= 0){
//                        try {
//                            txtMin.setText(min.toString());
//                            txtSec.setText(sec.toString());
//                            sec--;
//                            if (sec < 0){
//                                sec = 59;
//                                min--;
//                            }
//                            System.out.println(min);
//                            System.out.println(sec);
//                            Thread.sleep(1000);
//                        }catch (Exception e){ }
//                    }
//                }
//                try{
//                    Thread.sleep(3000);
//                    Platform.exit();
//                }catch (Exception e){
//
//                }
            }
        }).start();
    }

    public void btn_pause(){
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }

    public void btn_stop(){

    }


}
