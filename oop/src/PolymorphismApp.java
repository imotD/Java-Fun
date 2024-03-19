public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Tommy");
        employee.sayHello("Racj");

        employee = new Manager("Tommy");
        employee.sayHello("Racj");

        employee = new VicePresident("Tommy");
        employee.sayHello("Racj");

        sayHello(new Employee("Eko"));
        sayHello (new Manager("Tommy"));
        sayHello (new VicePresident("Shanum"));
    }

    static void  sayHello( Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
         } else if ( employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
