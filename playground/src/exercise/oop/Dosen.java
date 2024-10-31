package exercise.oop;

public class Dosen extends Person{
  String nip;
  String mataKuliah;

  public Dosen(String name, int age, String nip, String mataKuliah) {
    super(name, age);
    this.nip = nip;
    this.mataKuliah = mataKuliah;
  }

  public String display(){
    return "Name: " + super.name + "\n" +
            "Age: " + super.age + "\n" +
            "Nip: " + this.nip + "\n" +
            "Mata Kuliah: " + this.mataKuliah + "\n";
  }
}
