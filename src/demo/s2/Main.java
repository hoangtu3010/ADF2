package demo.s2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Generic g = new Generic();
        g.demoGeneric("");

        Generic<String, Integer> g2 = new Generic<>();
        g2.key = "Hello";
        g2.value = 20;

        Generic<Integer, Integer> g3 = new Generic<>();
        g3.key = 19;
        g3.value = 21;

        Actor<String> aVN = new Actor<>();
        Actor<Integer> aJ = new Actor<>();

        ActorUS u = new ActorUS();
        u.id = "acb";

        ArrayList<? super Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1.5);

    }
}
