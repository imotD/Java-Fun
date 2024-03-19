public class PersonApp {
    public static void main(String[] args) {
        var person = new Person("Tommy is my name", "jamuju dong");
        var person1 = new Person("Tommy 1");
//        person.name = "Tommy Alhamra";
//        person.address = "Jamuju";
        person.sayHello("Daniel");

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person1.name);
    }
}
