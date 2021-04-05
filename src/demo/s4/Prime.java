package demo.s4;

public class Prime {
    int x = 1;
    int y = 1;
    int z = 0;

    public void tanngXY(){
        x++;
        y++;
    }

    public void inKetQua(){
        System.out.println(Thread.currentThread().getName()+"-----");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public synchronized void thayDoiXY(){
        tanngXY();
        inKetQua();
    }

    public synchronized void thayDoiZ(){
        System.out.println(Thread.currentThread().getName()+"-----");
        z++;
        System.out.println("z = " + z);
    }
}
