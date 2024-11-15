package viraj.com.templatePattern;

public class Main {
    public static void main(String[] args) {
        CoffeeMaker blackCoffee = new BlackCoffee();
        blackCoffee.makeCoffee();

        System.out.println("");

        CoffeeMaker coffeeWithMilkAndSugar = new CoffeeWithMilkAndSugar();
        coffeeWithMilkAndSugar.makeCoffee();
    }
}



