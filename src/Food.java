/**
 * Abstract food class
 * @author N. Wan.
*/
public abstract class Food {
    
    // Declare variables
    private String name;
    private double price;

    /**
     * Constructor - creates a new instance of a food item.
     * 
     * @param String foodName - the name of the food item
     * @param Double foodPrice - the price of the food item
     */
    public Food(String foodName, Double foodPrice){
        name = foodName;
        price = foodPrice;
    }

    /**
     * Constructor - creates a new instance of a food item without price.
     * 
     * @param String foodName - the name of the food item
     */
    public Food(String foodName){
        name = foodName;
    }

    /**
     * Returns string of the name
     * 
     * @return String name, which represents the name of the food
     */
    public String getName(){
        return name;
    }

    /**
     * Returns a double value of the price of the food item 
     * 
     * @return double price, which represents the price of the food item
     */
    public double getPrice(){
        return price;
    }

    /**
     * Sets the price of the food
     * @param double foodPrice - the price of the food item
     */
    public void setPrice(double foodPrice){
        this.price = foodPrice;
    }
}
