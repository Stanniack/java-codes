package lambdafunctions;

import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 11, 100, 1, 5, 6, 7, 25, 0, -5, 2, -50);

        /** Programação mais funcional
         * stream é uma api q suporta condições lambda;
         *  filter: condição lambda (Pode receber qualquer coisa que tem retorno boolean);
         *  foreach: para mostrar os números que estão na condição */
        list.stream().filter(number -> number > 10).forEach(System.out::println);

    }
}
