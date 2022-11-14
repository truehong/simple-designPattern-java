package strategy;

public class Helloword {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item A = new Item("KundolA" , 100);
        Item B = new Item("KundolB", 300);

        cart.addItem(A);
        cart.addItem(B);

        // pay by LUNACard
        cart.pay(new LUNACardStrategy("Kundol@exaple.com", "pukubababo"));
        cart.pay(new KAKAOCardStrategy("Ju hongchul", "123456789", "123", "12/10"));
    }
}

/**
 * 400 paid using LUNACard
 * 400 paid using KAKAOCard
 * */
