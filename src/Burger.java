public class Burger {

  private String bun;
  private int patties;
  private boolean cheese;
  private boolean bacon;
  private boolean lettuce;
  private boolean tomato;
  private boolean onion;
  private boolean ketchup;
  private boolean mustard;
  private boolean mayo;

  private Burger(Builder builder) {
    this.bun = builder.bun;
    this.patties = builder.patties;
    this.cheese = builder.cheese;
    this.bacon = builder.bacon;
    this.lettuce = builder.lettuce;
    this.tomato = builder.tomato;
    this.onion = builder.onion;
    this.ketchup = builder.ketchup;
    this.mustard = builder.mustard;
    this.mayo = builder.mayo;
  }

  public static class Builder {
    private String bun;
    private int patties;
    private boolean cheese = false;
    private boolean bacon = false;
    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean onion = false;
    private boolean ketchup = false;
    private boolean mustard = false;
    private boolean mayo = false;

    public Builder(String bun, int patties) {
      this.bun = bun;
      this.patties = patties;
    }

    public Builder addCheese() {
      this.cheese = true;
      return this;
    }

    public Builder addBacon() {
      this.bacon = true;
      return this;
    }

    public Builder addLettuce() {
      this.lettuce = true;
      return this;
    }

    public Builder addTomato() {
      this.tomato = true;
      return this;
    }

    public Builder addOnion() {
      this.onion = true;
      return this;
    }

    public Builder addKetchup() {
      this.ketchup = true;
      return this;
    }

    public Builder addMustard() {
      this.mustard = true;
      return this;
    }

    public Builder addMayo() {
      this.mayo = true;
      return this;
    }

    public Burger build() {
      return new Burger(this);
    }

  }

  @Override
  public String toString() {
    String burger = "";
    String toppings = "";
    burger += "A delicious " + bun + " bun ";
    if (patties == 2) burger += "double ";
    if (patties == 3) burger += "triple ";
    if (cheese) {
      burger += "cheese";
    }
    else {
      burger += "ham";
    }
    burger += "burger with ";
    
    if (bacon) toppings += "bacon, ";
    if (lettuce) toppings += "lettuce, ";
    if (tomato) toppings += "tomato, ";
    if (onion) toppings += "onion, ";
    if (ketchup) toppings += "ketchup, ";
    if (mustard) toppings += "mustard, ";
    if (mayo) toppings += "mayo, ";
    if (toppings.length() > 0) toppings += "and ";
    toppings += "nothing else.";
    
   
    return burger + toppings;
  }

  
}
