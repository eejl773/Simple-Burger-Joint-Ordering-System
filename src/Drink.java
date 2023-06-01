public abstract class Drink {
  protected String size;

  public Drink (String size) {
    this.size = size;
  }

  @Override 
  public abstract String toString();
}
