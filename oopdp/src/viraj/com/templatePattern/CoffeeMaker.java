package viraj.com.templatePattern;

public abstract class CoffeeMaker {
    // Template method
    public final void makeCoffee() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Brewing coffee grinds");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Subclasses will implement this method to add specific condiments
    protected abstract void addCondiments();
}
