package buscasequencial;

public class BuscaSequencial {

    public int iterativa (int elemento, int array[], int tam_array) {

        for (int i = 0; i < tam_array; i++) {

            if (array[i] == elemento) {
                return i;
            }

        }

        return -1;
    }
    public int recursiva (int elemento, int array[], int tam_array) {

        if (tam_array < 0)
            return -1;
        if (elemento == array[tam_array])
            return tam_array;

        return recursiva(elemento, array, tam_array - 1);
    }
}
