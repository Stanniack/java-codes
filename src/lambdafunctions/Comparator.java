package lambdafunctions;

import buscasequencial.Human;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<Human> list = Arrays.asList(new Human("Vertebrate", "Mateus", 25),
                new Human("Vertebrate", "Anderson", 24));

        /** Sem lambda */
        Collections.sort(list, new java.util.Comparator<Human>() {
            @Override
            public int compare(Human human1, Human human2) {
                return human1.getAge().compareTo(human2.getAge());
            }
        });

        /** Com lambda */
        Collections.sort(list, (Human human1, Human human2) -> human1.getAge().compareTo(human2.getAge()));

        /** Com lambda mais simplificado */
        Collections.sort(list, java.util.Comparator.comparing(Human::getAge));

        list.forEach(human -> System.out.println(human.getAge()));

    }
}
