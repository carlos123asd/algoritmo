public class Main {
    public static void main(String[] args) {
        String[] name = {"John", "Smith"};
        System.out.println(sayHello(name,"Phoenix", "Arizona"));
    }
    public static String sayHello(String [] name, String city, String state){
        return "Hello, "+String.join(" ",name)+"! Welcome to "+city+", "+state+"!";
    }
}