package Ejercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_ {
    public static void main(String[] args){

        List<String> characters = Arrays.asList("Kim Dokja", "Yoo Joonghyuk", "Yoo Sangah", "Lee Jihye", "Lee Hyunsung");

        // Consumer se implementa para convertir cada nombre de personaje a mayúsculas
        Consumer<String> printInCapitals = character -> System.out.println(character.toUpperCase());

        // Se itera la lista y se aplica el Consumer
        characters.forEach(printInCapitals);

    }
}