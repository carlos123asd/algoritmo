import java.util.Arrays;
/*
* La raíz digital es la suma recursiva de todos los dígitos de un número.
Dado n, se calcula la suma de los dígitos de n. Si ese valor tiene más de un dígito, se continúa reduciendo de esta manera hasta obtener un número de un solo dígito.
* El valor de entrada será un entero no negativo.
* */
public class Main {
    public static void main(String[] args) {
        System.out.println(digital_root(94627));
    }
    public static int digital_root(int n) {
        while(n >= 10){
            n = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
        }
        return n;
    }
}