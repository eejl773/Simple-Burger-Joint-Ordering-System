public class Water extends Drink {
  public Water(String size) {
    super(size);
  }

  @Override
  public String toString() {
    return size + " water";
  }
}
