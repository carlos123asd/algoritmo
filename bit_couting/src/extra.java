public class extra {
    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }
    public static int countBits(int n){
        return n > 0 ? Integer.bitCount(n) : 0;
    }
}
