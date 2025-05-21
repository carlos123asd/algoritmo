public class Main {
    public static final int n = 7;
    public static void main(String[] args) {
        String resultado = "";
        for (int i = n; i >= 1; i--){
            resultado = printLinea(i);
            System.out.println(resultado);
        }
    }
    public static String printLinea(int number){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= number; i++){
            sb.append(String.format("[%03d]",i));
        }
        for (int k = 1; k <= (n - number + 1) * 2; k++) {
            sb.append(String.format("%03d-", k * 3));
        }
        return sb.toString();
    }
}