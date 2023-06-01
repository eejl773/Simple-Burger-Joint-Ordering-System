import java.util.ArrayList;
import java.util.List;

public class Order implements OrderSystemElement {
  private int orderNumber;
  private List<OrderSystemElement> orders = new ArrayList<>();
  
  public Order() {
    this.orderNumber = 0;
  }

  public void addOrder(OrderSystemElement order) {
    orders.add(order);
    orderNumber++;
  }

  public void serveOrder(OrderSystemElement order) {
    orders.remove(order);
  }
  
  @Override
  public void display() {
    System.out.println("Order #" + orderNumber);
    for (OrderSystemElement order : orders) {
      order.display();
    }
  }
  
  @Override
  public int getSize() {
    int size = 0;
    for (OrderSystemElement order : orders) {
      size += order.getSize();
    }
    return size;
  }

}
