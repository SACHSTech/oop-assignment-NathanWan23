public class Burger extends Food {
    
    // Declair variables
    String[] burgerToppings;

    public Burger(String Name, String[] toppings, double price){
        super(Name, price);
        this.burgerToppings = toppings;
    }

    public String[] getBurgerToppings(){
        return burgerToppings;
    }
}
