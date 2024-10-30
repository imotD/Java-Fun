public class ManagerApp {
    public static void main(String[] args) {
//        var manager = new Manager();
//        manager.name = "Tommy Alhamra";
//        manager.sayHello("Otnile");
//
        var vp = new VicePresident("tommy");
//        vp.name = "Syahra";
        vp.sayHello("Irfan");
        vp.sayHelloParent("Irfan");
    }
}
