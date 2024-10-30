package learn.java.data;

public class Bus  implements Car{
    public boolean drive() {
        System.out.println("Bus driven");
      return false;
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
