package learn.java.data;

public class Bus  implements Car{
    public void drive() {
        System.out.println("Bus driven");
    }

    public int getTier() {
        return 8;
    }

    public String getBrand() {
        return "Hino";
    }

    public boolean isMaintenance() {
        return false;
    }

    public  boolean isBig() {
        return true;
    }
}
