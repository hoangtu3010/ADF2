package demo.s3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("clock.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
//        DemoThread dt = new DemoThread();
//        dt.setName("Demo Thread ");
//        dt.start();
//        for (int i = 0; i < 20; i++){
//            System.out.println(Thread.currentThread().getName()+" i = " + i);
//            try{
//                Thread.sleep(500);
//            }catch (Exception e){
//
//            }
//        }
//        Tạo 1 thread dem nguoc thoi gian ve 0
//        Gia su ban dau chay tu 10phut
//        TestThread ts = new TestThread();
//        ts.start();
    }
}
