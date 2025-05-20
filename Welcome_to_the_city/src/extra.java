public class extra {
    public static void main(String[] args) {
        String[] name = {"John", "Smith"};
        System.out.println(sayHello(name,"Phoenix", "Arizona"));
    }
    public static String sayHello(String [] name, String city, String state){
        return String.format("Hello, %s! Welcome to %s, %s!",String.join(" ",name),city,state);
    }
}
