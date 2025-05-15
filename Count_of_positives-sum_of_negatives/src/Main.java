import java.util.Arrays;

/**
 * Dada una matriz de números enteros.
 * Devuelve una matriz, donde el primer elemento es el recuento de números positivos y el segundo elemento es la suma de números negativos. 0 no es ni positivo ni negativo.
 * Si la entrada es una matriz vacía o es nula, devuelve una matriz vacía.
 * Ejemplo
 * Para ingresar [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], debes devolver [10, -65].
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = null;
        countPositivesSumNegatives(numbers);
    }


    public static int[] countPositivesSumNegatives(int[] input){
        int[] count = new int[2];
        if(input != null && input.length > 0){
            for(int number : input){
                if(number > 0){
                    count[0] += 1;
                }else{
                    count[1] += number;
                }
            }
            return count;
        }
        return new int[0];
    }
}

