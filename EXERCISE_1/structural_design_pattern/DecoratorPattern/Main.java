package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: $" + simpleCoffee.getCost() + ", Description: " + simpleCoffee.getDescription());

        // Decorate it with milk
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost: $" + milkCoffee.getCost() + ", Description: " + milkCoffee.getDescription());

        // Decorate it with another milk (double milk)
        Coffee doubleMilkCoffee = new MilkDecorator(milkCoffee);
        System.out.println("Cost: $" + doubleMilkCoffee.getCost() + ", Description: " + doubleMilkCoffee.getDescription());
    }
}