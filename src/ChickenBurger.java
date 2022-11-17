/**
 * ChickenBurger class file which extends Burger.
 * @author N. Wan.
*/
public class ChickenBurger extends Burger {
    
    // Declair variables
    boolean crispy;
    int spiceLevel;

    public ChickenBurger(String Name, boolean isCrispy, int spice){
        super(Name, new String[] {"Lettuce", "Tomatoes", "Mayonnaise", "Pickles"}, 7.99);
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

