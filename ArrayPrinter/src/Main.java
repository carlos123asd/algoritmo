public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[] { 2, 4, 5, 2 };
        String[] arrayS = new String[] {"a","b","c"};
        int[][] matriz = {{2,3},{1},{1,4,67}};
        String[][] matrizS = {{"2","3"},{"1"},{"1","4","67"}};
        boolean[] boolArray = {true, false, true};
        System.out.println(printArray(array));
        System.out.println(printArray(boolArray));
        System.out.println(printArray(arrayS));
        System.out.println(printArray(matriz));
        System.out.println(printArray(matrizS));
    }
    public static String printArray(Object[] array) {
        return java.util.Arrays.stream(array).map(Object::toString).collect(java.util.stream.Collectors.joining(","));
    }
    public static String printArray(boolean[] array){
        StringBuilder sb = new StringBuilder();
        for (boolean val:array){
            sb.append(val);
        }
        return String.join(",",sb.toString().split(""));
    }
    public static String printArray(int[][] array){
        StringBuilder sb = new StringBuilder();
        for (int[] val: array){
            for (int val2: val){
                sb.append(val2);
            }
        }
        return String.join(",",sb.toString().split(""));
    }
    public static String printArray(String[][] array){
        StringBuilder sb = new StringBuilder();
        for (String[] val: array){
            for (String val2: val){
                sb.append(val2);
            }
        }
        return String.join(",",sb.toString().split(""));
    }
}