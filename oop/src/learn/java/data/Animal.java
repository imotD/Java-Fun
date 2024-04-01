package learn.java.data;

import learn.java.annotation.Fancy;

@Fancy(name = "AnimalApp", tags = {"application", "java"})
public abstract class Animal {
    public String name;
    public abstract void run();
}
