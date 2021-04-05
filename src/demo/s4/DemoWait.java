package demo.s4;

public class DemoWait {
    public static void main(String[] args) {
        Account a = new Account();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                a.rutTien(200000);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                a.napTien(40000);
            }
        });
        Runnable r = new Runnable() {
            @Override
            public void run() {
                a.napTien(40000);
            }
        };

        t1.start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
    }
}
