 class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // constructor
    Person (String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    // constructor overloading
     // this untuk memanggil constrator lain
     Person ( String paramName){
        this(paramName, null);
     }

     Person (){
        this(null);
     }



    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}
