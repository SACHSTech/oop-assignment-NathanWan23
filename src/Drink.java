/**
 * Drink class which extends food.
 * @author N. Wan.
*/
public class Drink extends Food {
    
    //Declare variable
    String size;

    /**
     * Constructor - creates a new instance of a drink.
     * 
     * @param rinkName - the name for the drink
     * @param drinkSize - the size of the drink
     */
    public Drink(String drinkName, String drinkSize){
        super(drinkName);

        // Determine price with given size
        if(drinkSize == "Small") setPrice(1.99);
        else if(drinkSize == "Medium") setPrice(2.99);
        else setPrice(3.99);
        this.size = drinkSize;
    }

    /**
     * Returns string of the size
     * 
     * @return String size, which represents the size of the drink
     */
    public String getSize(){
        return size;
    }
}
