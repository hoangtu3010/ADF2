package demo.s4;

public class Account {
    int balance;

    public void napTien(int amount){
        balance += amount;
        System.out.println("Nạp " + amount + " thành công");
        try {
            notify();
        }catch (Exception e){

        }
    }

    public void rutTien(int amount){
        while (balance < amount){
            System.out.println("Chờ tí mẹ đang gửi tiền !");
            try {
                wait();
            }catch (Exception e){

            }
        }
        balance -= amount;
        System.out.println("Rút " + amount + " thành công");
    }
}
