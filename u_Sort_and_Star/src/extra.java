public class extra {
    public static void main(String[] args) {
        String[] words = new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"};
        System.out.println(twoSort(words));
        System.out.println(twoSortV2(words));
    }
    public static String twoSort(String[] input) {
        java.util.Arrays.sort(input);
        return String.join("***",input[0].split(""));
    }
    public static String twoSortV2(String[] input) {
        return String.join("***",java.util.Arrays.stream(input).sorted().findFirst().orElse("").split(""));
    }
}
