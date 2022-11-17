/**
 * Abstract food class
 * @author N. Wan.
*/
public abstract class Food {
    
    // Declare variables
    private String name;
    private double price;

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
