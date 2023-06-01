public abstract class Item implements OrderSystemElement {
  @Override 
  public void display() {
    System.out.println(this.toString());
  }

  @Override
  public int getSize() {
    return 1;
  }
}
