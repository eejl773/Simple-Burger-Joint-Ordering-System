public class Milkshake extends Drink {
  private int flavour;
  public Milkshake(String size, int flavour) {
    super(size);
    this.flavour = flavour;
  }

  public String getFlavour() {
    switch (this.flavour) {
      case 1:
        return "Chocolate";
      case 2:
        return "Vanilla";
      case 3:
        return "Strawberry";
      default:
        return "Unknown";
    }
  }

  @Override
  public String toString() {
    return size + " " + getFlavour() + " milkshake";
  }
  
}
