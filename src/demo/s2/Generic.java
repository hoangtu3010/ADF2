package demo.s2;

public class Generic <K, V>{
    K key;
    V value;
    public <E> void demoGeneric(E ex){
        System.out.println(ex);
    }

    public <Y, N> void sayHello(Y y, N n) {

    }
}
