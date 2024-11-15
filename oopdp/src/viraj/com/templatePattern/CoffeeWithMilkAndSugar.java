package viraj.com.templatePattern;

public class CoffeeWithMilkAndSugar extends CoffeeMaker {
    @Override
    protected void addCondiments() {
        System.out.println("Adding milk and sugar");
    }
}
