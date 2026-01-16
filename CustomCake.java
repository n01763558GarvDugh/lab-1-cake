class CustomCake extends Cake {
    private double weight; // kg
    private double customFee;

    public CustomCake(String name, double pricePerKg, double weight, double customFee) {
        super(name, pricePerKg);
        this.weight = weight;
        this.customFee = customFee;
    }

    @Override
    public double calculatePrice() {
        return (price * weight) + customFee;
    }
}