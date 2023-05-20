package Ejercicio5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_ {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Se implementa el Predicate para filtrar los números pares y mayores que 5
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        Predicate<Integer> isGreaterThan5 = (number) -> number > 5;

        List<Integer> filteredNumbers = filter(numbers, isEven.and(isGreaterThan5));

        System.out.println("Even numbers greater than 5: " + filteredNumbers);
    }

    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : list) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }
        return result;
    }
}