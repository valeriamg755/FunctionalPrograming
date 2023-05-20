package Ejercicio6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_ {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Utilizando map para duplicar cada número
        List<Integer> duplicatedNumbers = numbers.stream()
                .map(numero -> numero * 2)
                .collect(Collectors.toList());

        System.out.println("Original numbers: " + numbers);
        System.out.println("Duplicated numbers: " + duplicatedNumbers);
    }
}