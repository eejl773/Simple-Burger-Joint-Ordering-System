public class Fries {
  private String size;
  private String type;

  public Fries (String size, String type) {
    this.size = size;
    this.type = type;
  }

  public String getType() {
    switch (this.type) {
      case "straight-cut":
        return "Straight-cut";
      case "curly":
        return "Curly";
      case "waffle":
        return "Waffle";
      case "kumura":
        return "Kumura";
      default:
        return "";
    }
  }

  @Override 
  public String toString() {
    return size + " " + type + " fries";
  }
}
