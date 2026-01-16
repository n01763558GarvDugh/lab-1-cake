public class BakeryApp {
    public static void main(String[] args) {
        Cake[] cakes = new Cake[20];

        // Ready-made cakes
        cakes[0] = new ReadyCake("Carrot Cake", 30);
        cakes[1] = new ReadyCake("Chocolate Cake", 35);
        cakes[2] = new ReadyCake("Vanilla Cake", 25);

        // Custom-order cakes
        cakes[3] = new CustomCake("Bob's BD Cake", 40, 1.5, 15);
        cakes[4] = new CustomCake("Alice's Wedding Cake", 50, 2.0, 25);

        // Dummy data for the rest
        for (int i = 5; i < 20; i++) {
            if (i % 2 == 0) {
                cakes[i] = new ReadyCake("ReadyCake" + i, 20 + i);
            } else {
                cakes[i] = new CustomCake("CustomCake" + i, 30 + i, 1 + i * 0.1, 10 + i);
            }
        }

        // Print all cakes
        System.out.println("All cakes and their prices:");
        for (Cake cake : cakes) {
            System.out.println(cake);
        }

        // Total price
        double totalPrice = 0;
        for (Cake cake : cakes) {
            totalPrice += cake.calculatePrice();
        }

        System.out.println("\nTotal price for all cakes: $" + totalPrice);
    }
}