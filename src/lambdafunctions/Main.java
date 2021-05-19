package lambdafunctions;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Mateus");
        list.add("João");
        list.add("Anderson");

        list.forEach(nome -> System.out.println(nome));
    }
}
