package Ejercicio7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect_ {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("casa", "perro", "gato");

        // Utilizando collect para recopilar las palabras en una lista
        List<String> palabrasRecopiladas = palabras.stream()
                .collect(Collectors.toList());

        System.out.println("Palabras originales: " + palabras);
        System.out.println("Palabras recopiladas: " + palabrasRecopiladas);
    }
}