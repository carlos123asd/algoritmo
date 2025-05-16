import java.util.Arrays;
import java.util.Comparator;

/*
* Recibirá una lista de cadenas. Debe ordenarla alfabéticamente (distinguiendo entre mayúsculas y minúsculas y basándose en los valores ASCII de los caracteres)
*  y luego devolver el primer valor.
El valor devuelto debe ser una cadena con "***" entre cada letra.
No debe eliminar ni añadir elementos de la matriz.
* */
public class Main {
    public static void main(String[] args) {
        String[] words = new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"};
        System.out.println(twoSort(words));
    }
    public static String twoSort(String[] input){
        Arrays.sort(input, Comparator.naturalOrder());
        String word = input[0];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if(i > 0){
                result.append("***");
            }
            result.append(word.charAt(i));
        }
        return result.toString();
    }
}