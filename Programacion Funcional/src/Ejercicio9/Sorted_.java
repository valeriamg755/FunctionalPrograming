package Ejercicio9;

import java.util.Arrays;
import java.util.List;

public class Sorted_ {
        public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(5, 2, 8, 1, 3);

            // Utilizando sorted para ordenar los números de forma ascendente
            List<Integer> numerosOrdenados = numeros.stream()
                    .sorted()
                    .toList();

            System.out.println("Números originales: " + numeros);
            System.out.println("Números ordenados: " + numerosOrdenados);
        }
}