package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {

        List<String> characters = new ArrayList<>();
        characters.add("Kim Dokja");
        characters.add("Yoo Joonghyuk");
        characters.add("Biyoo");
        characters.add("Shin Yoosung");
        characters.add("Lee Gilyoung");

        // La lambda se va a implementar para filtrar los nombres de los personajes que empiezan con "K"
        List<String> charactersFiltered = filterCharacters(characters, (character) -> character.startsWith("K"));

        // Se imprimen los nombres que cumplen con la característica mencionada
        charactersFiltered.forEach(System.out::println);
    }

    public static List<String> filterCharacters(List<String> list, Filter filter) {
        List<String> result = new ArrayList<>();
        for (String favcharacter : list) {
            if (filter.checks(favcharacter)) {
                result.add(favcharacter);
            }
        }
        return result;
    }

    // La interfaz Filter debe ser definida en algún lugar del código porque luego no funciona :v
    interface Filter {
        boolean checks(String favcharacter);
    }

}