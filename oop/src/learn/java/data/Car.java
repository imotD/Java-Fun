package learn.java.data;

public interface Car extends HasBrand, IsMaintenance {

    boolean drive();
    int getTier();

    default boolean isBig() {
        return false;
    }
}
