/**
 * ChickenBurger class file which extends Burger.
 * @author N. Wan.
*/
public class ChickenBurger extends Burger {
    
    // Declare variables
    private boolean crispy;
    private int spiceLevel;

    /**
     * Constructor - creates a new instance of a burger.
     * 
     * @param String name - the name of the chicken burger
     * @param boolean isCrispy - if the chicken is crispy or grilled
     * @param int spice - what the spice level will be  
     */
    public ChickenBurger(String name, boolean isCrispy, int spice){
        super(name, new String[] {"Lettuce", "Tomatoes", "Mayonnaise", "Pickles"}, 7.99);
        this.crispy = isCrispy;
        this.spiceLevel = spice; 
        
    }

    /**
     * Returns boolean value if the chicekn is crispy or not.
     * 
     * @return boolean variable crispy, which represents if the chicken is crispy or grilled
     */
    public boolean getCrispy(){
        return crispy;
    }

    /**
     * Returns int value for spice level.
     * 
     * @return int variable spiceLevel, which represents the spice level of the chicken
     */
    public int getSpiceLevel(){
        return spiceLevel;
    }
}

