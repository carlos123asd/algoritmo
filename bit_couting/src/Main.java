import java.util.stream.Collector;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(countBits(-2));
    }
    public static int countBits(int n){
        return n > 0 ?
                (int)Integer.toBinaryString(n).chars().filter(i -> i == '1').count()
                :
                0;
    }
}