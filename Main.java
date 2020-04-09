class Main {
  static abstract class KitchenAppliance {
    protected double weight;
    protected String location;

    protected KitchenAppliance(double weight) {
      this.weight = weight;
      this.location = "table";
    }

    public double getWeight() {
      return weight;
    }

    public void setWeight(double weight) {
      this.weight = weight;
    }

    public String getLocation() {
      return location;
    }

    public void setLocation(String location) {
      this.location = location;
    }

    public abstract void turnOn();

    public abstract void wash();
  }

  static class Microwave extends KitchenAppliance {
    public Microwave() {
      super(5000);
    }

    @Override
    public void turnOn() {
      System.out.println("turning on microwave...");
    }

    @Override
    public void wash() {
      throw new UnsupportedOperationException("cannot wash a microwave");
    }
  }

  static abstract class Tableware extends KitchenAppliance {
    protected Tableware(double weight) {
      super(weight);
    }

    @Override
    public void turnOn() {
      throw new UnsupportedOperationException("cannot turn on a tableware");
    }
  }

  static class Fork extends Tableware {
    public Fork() {
      super(150);
    }

    @Override
    public void wash() {
      System.out.println("washing a fork...");
    }
  }

  static class Dish extends Tableware {
    public Dish() {
      super(300);
    }

    @Override
    public void wash() {
      System.out.println("washing a dish...");
    }
  }

  public static void main(String[] args) {
    System.out.println("hello world");

    System.out.println();

    KitchenAppliance appliance;

    appliance = new Microwave();
    System.out.println("Microwave.getWeight() = " + appliance.getWeight());
    System.out.println("Microwave.getLocation() = " + appliance.getLocation());
    System.out.print("Microwave.turnOn() ");
    appliance.turnOn();

    System.out.println();

    appliance = new Fork();
    System.out.println("Fork.getWeight() = " + appliance.getWeight());
    System.out.println("Fork.getLocation() = " + appliance.getLocation());
    System.out.print("Fork.wash() ");
    appliance.wash();

    System.out.println();

    appliance = new Dish();
    System.out.println("Dish.getWeight() = " + appliance.getWeight());
    System.out.println("Dish.getLocation() = " + appliance.getLocation());
    System.out.print("Dish.wash() ");
    appliance.wash();
    appliance.setLocation("fridge");

    System.out.println();

    System.out.println("Dish.setLocation('fridge')");
    System.out.println("Dish.getLocation() = " + appliance.getLocation());
  }
}
