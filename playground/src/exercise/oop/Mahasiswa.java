package exercise.oop;

public class Mahasiswa {

  String name;
  String nim;
  String jurusan;

  public Mahasiswa(String name, String nim, String jurusan) {
    this.name = name;
    this.nim = nim;
    this.jurusan = jurusan;
  }

  public String displayInfo() {
    return "Nama : " + this.name + "\n" + "NIM : " + this.nim + "\n" + "Jurusan : " + this.jurusan;
  }
}
