package Ejercicio3;

import java.util.function.Supplier;

public class Supplier_ {

    public static void main(String[] args) {

        // Utilizando Supplier para obtener un número aleatorio
        Supplier<Double> getRandomNumber = () -> Math.random();

        // Obteniendo un número aleatorio utilizando el Supplier
        double randomNumber = getRandomNumber.get();

        System.out.println("Random number: " + randomNumber);
    }
}