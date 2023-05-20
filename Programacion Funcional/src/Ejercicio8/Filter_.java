package Ejercicio8;

import java.util.Arrays;
import java.util.List;

public class Filter_ {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using filter to select even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        System.out.println("Original numbers: " + numbers);
        System.out.println("Even numbers: " + evenNumbers);
    }
}