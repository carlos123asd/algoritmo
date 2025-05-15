import java.util.Arrays;
import java.util.stream.IntStream;

public class extra {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(Arrays.toString(countPositivesSumNegatives(array)));
    }
    public static int[] countPositivesSumNegatives(int[] input){
        return input != null && input.length > 0 ?
                new int[]{(int)IntStream.of(input).filter(i->i>0).count(),IntStream.of(input).filter(i->i<0).sum()}
                :
                new int[0];
    }
}
