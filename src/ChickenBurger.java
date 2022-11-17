/**
 * ChickenBurger class file which extends Burger.
 * @author N. Wan.
*/
public class ChickenBurger extends Burger {
    
    // Declair variables
    boolean crispy;
    int spiceLevel;

    /**
     * Constructor - creates a new instance of a burger.
     * 
     * @param name - the name of the chicken burger
     * @param isCrispy - if the chicken is crispy or grilled
     * @param spice - what the spice level will be  
     */
    public ChickenBurger(String name, boolean isCrispy, int spice){
        super(name, new String[] {"Lettuce", "Tomatoes", "Mayonnaise", "Pickles"}, 7.99);
        this.crispy = isCrispy;
        this.spiceLevel = spice; 
        
    }

    public boolean getCrispy(){
        return crispy;
    }

    public int getSpiceLevel(){
        return spiceLevel;
    }
}

