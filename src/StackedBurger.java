/**
 * StackedBurger class file which extends Burger.
 * @author N. Wan.
*/
public class StackedBurger extends Burger{
    
    // Declare variables
    int bun;
    int paties;

    /**
     * Constructor - creates a new instance of a Stacked burger.
     * 
     * @param String name - the name of the stacked burger burger
     * @param int bunLayer - the number of buns in the burger
     * @param int beefPaties - the number of beef paties
     */
    public StackedBurger(String name, int bunLayers, int beefPaties){
        super(name, new String[] {"Cheese", "Ketchup", "Mayonnaise", "Bacon"}, 12.99);
        this.bun = bunLayers;
        this.paties = beefPaties; 
    }
    
    /**
     * Returns number of bun layers.
     * 
     * @return int variable bun, which represents number of bun layers
     */
    public int getLayers(){
        return bun;
    }

    /**
     * Returns the number of beef paties.
     * 
     * @return int variable paties, which represents number of beef paties 
     */
    public int getBeefPaties(){
        return paties;
    }
}