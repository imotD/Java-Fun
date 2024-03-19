 class VicePresident extends Manager {

     VicePresident(String name){
          super(name);
     }
     void  sayHello(String name){
          System.out.println("Hi " + name + ". My name is Vice President " + this.name);
     }

     void  sayHelloParent(String name){
          //method overiding mengambil fungsi parent yang nama metodnya sama
          super.sayHello(name);
     }
}
