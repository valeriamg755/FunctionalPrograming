package Ejercicio4;

import java.util.function.Function;

public class Function_ {

        public static void main(String[] args){

            //Implementamos Function para encontrar el valor absoluto de un número
            Function<Integer, Integer> obtainAbsoluteValor = Math::abs;
            int absoluteValor = obtainAbsoluteValor.apply(-777);

            System.out.println("Absolute Valor:" + absoluteValor);
        }
}