package learn.java.data;

public enum Level {
  STANDART("Standard Level"),
  PREMIUM("Premium Level"),
  VIP("VIP Level");

  private String description;

  Level(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
