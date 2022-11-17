/**
 * Burger class file which extends food.
 * @author N. Wan.
*/
public class Burger extends Food {
    
    // Declair variables
    String[] burgerToppings;

    /**
     * Constructor - creates a new instance of a burger.
     * 
     * @param name
     */
    public Burger(String name, String[] toppings, double price){
        super(name, price);
        this.burgerToppings = toppings;
    }

    public String[] getBurgerToppings(){
        return burgerToppings;
    }
}
