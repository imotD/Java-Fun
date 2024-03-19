package learn.java.application;

import learn.java.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();

        System.out.println(category.getId());
        System.out.println(category.isExpensive());

        System.out.println(category.setId("ID-1"));
        System.out.println(category.setExpensive(true));

        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
