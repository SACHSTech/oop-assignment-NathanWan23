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
     * @param foodName - the name of the food item
     * @param foodPrice - the price of the food item
     */
    public Food(String foodName, Double foodPrice){
        name = foodName;
        price = foodPrice;
    }

    public Food(String foodName){
        name = foodName;
    }

    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }

    public void setPrice(double foodPrice){
        this.price = foodPrice;
    }
}
