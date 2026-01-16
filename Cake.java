abstract class Cake {
    protected String name;
    protected double price;

    public Cake(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double calculatePrice();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " - $" + calculatePrice();
    }
}