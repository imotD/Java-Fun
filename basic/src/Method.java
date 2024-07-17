public class Method {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHelloWorldName("Tommy", "Alhamra");
    }

   // command

    static void sayHelloWorld() {
        System.out.println("hello sobat");
    }

    static void sayHelloWorldName(String name, String lastname) {
        System.out.println("Hello " + name + " " + lastname);
    }
}
