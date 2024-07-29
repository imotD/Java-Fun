package my.learn.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ProppertiesApp {
  public static void main(String[] args) {
    try {
      Properties prop = new Properties();
      prop.load(new FileInputStream("application.properties"));

      String host = prop.getProperty("database.host");
      String port = prop.getProperty("database.port");
      String username = prop.getProperty("database.username");
      String password = prop.getProperty("database.password");

      System.out.println(host);
      System.out.println(port);
      System.out.println(username);
      System.out.println(password);

    } catch (FileNotFoundException e) {
      System.out.println("File Tidak Ketemu");
    } catch (IOException e) {
      System.out.println("Gagal Load Data");
    }

    try {
      Properties prop = new Properties();
      prop.put("name.first", "tommy");
      prop.put("name.last", "alhamra");

      prop.store(new FileOutputStream("name.properties"), null);

    }catch (FileNotFoundException e){
      System.out.println("Error File");
    }catch (IOException e){
      System.out.println("Error Load Data");
    }
  }
}
