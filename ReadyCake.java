class ReadyCake extends Cake {

    public ReadyCake(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}