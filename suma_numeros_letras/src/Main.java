import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumav1(args));
        System.out.println(sumav2(args));
    }
    public static int sumav1(String[] args){
        int suma = 0;
        for (String value: args){
            String limpio = value.replaceAll("[^0-9]", "");
            suma += limpio.isEmpty() ? 0 : Integer.parseInt(limpio);
        }
        return suma;
    }

    public static int sumav2(String[] args){
        int suma = 0;
        for (String value: args){
            String limpio = value.replaceAll("[^0-9]","");
            suma += limpio.isEmpty() ? 0 : Arrays.stream(
                                                Arrays.stream(limpio.split("")).mapToInt(Integer::parseInt).toArray()
                                            ).sum();
        }
        return suma;
    }
}