package learn.java.data;

public class  Avanza implements Car {
    public boolean drive() {
        System.out.println("Avanza drive");
        return false;
    }
    public int getTier() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }
}
