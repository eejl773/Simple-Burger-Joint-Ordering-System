public class Soda extends Drink {
  private int flavour;
  private boolean ice;

  public Soda(String size, int flavour, boolean ice) {
    super(size);
    this.flavour = flavour;
    this.ice = ice;
  }

  private String getFlavour() {
    switch (this.flavour) {
      case 1:
        return "Coke";
      case 2:
        return "Coke Zero Sugar";
      case 3:
        return "Sprite";
      case 4:
        return "L&P";
      case 5:
        return "Fanta";
      default:
        return "Unknown";
    }
  }

  private String getIce() {
    if (this.ice) {
      return " with ice";
    } else {
      return " with no ice";
    }
  }

  @Override
  public String toString() {
    return size + " " + getFlavour() + getIce();
  }

  
}
