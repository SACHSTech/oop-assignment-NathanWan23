/**
 * Burger class file which extends food.
 * @author N. Wan.
*/
public class Burger extends Food {
    
    // Declare variables
    private String[] burgerToppings;

    /**
     * Constructor - creates a new instance of a burger.
     * 
     * @param String name - the name of the burger
     * @param String[] toppings - toppings on the burger
     * @param double price - price of the burger
     */
    public Burger(String name, String[] toppings, double price){
        super(name, price);
        this.burgerToppings = toppings;
    }

    /**
     * Returns array of the burger's toppings.
     * 
     * @return String array variable burgerToppings, which represents the burger's toppings
     */
    public String[] getBurgerToppings(){
        return burgerToppings;
    }
}
