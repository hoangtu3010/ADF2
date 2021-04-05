package demo.s2;

public class Actor<E> {
    E id;
    String name;

    void run(E x){
        id = x;
    }
}
