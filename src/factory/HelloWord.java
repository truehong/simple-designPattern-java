package factory;

public class HelloWord {
    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.getCoffee("Latte", 4000);
        Coffee ame = CoffeeFactory.getCoffee("Americano", 3000);
        System.out.println("Factory latte :: " + latte);
        System.out.println("Factory ame :: " + ame);
    }
}

/**
 * Factory latte :: Hi this coffee is 4000
 * Factory ame :: Hi this coffee is 3000
 * */
