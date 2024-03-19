public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        person1.name ="Tommy";
        person1.address ="Kadu Gajah";

        System.out.println(person1.name);
        System.out.println(person1.address);

        person1.sayHello("Tono");

        var person3 = new Person("Sisaka","Panimbang");
        person3.sayHello("Tama");

    }
}
