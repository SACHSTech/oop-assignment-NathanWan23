/**
 * VeganBurger class file which extends Burger.
 * @author N. Wan.
*/
public class VeganBurger extends Burger{
    
    // Declare variables
    private boolean beyondMeat;
    private boolean lettuceBun;

    /**
     * Constructor - creates a new instance of a vegan burger.
     * 
     * @param String name - the name of the stacked burger burger
     * @param boolean isBeyondMeat - if the meat is beyond meat
     * @param boolean isLettuceBun - if the bun is lettuce or poptato bun
     */
    public VeganBurger(String name, boolean isBeyondMeat, boolean isLettuceBun){
        super(name, new String[] {"Ketchup", "Mayonnaise", "Lettuce", "Tomatoes", "Grilled onions", "Sauteed mushrooms"}, 7.99);
        this.beyondMeat = isBeyondMeat;
        this.lettuceBun = isLettuceBun; 
    }

    /**
     * Returns if it is beyond meat.
     * 
     * @return boolean beyondMeat - which represents if it is beyond meat
     */
    public boolean getBeyondMeat(){
        return beyondMeat;
    }
    
    /**
     * Returns if it is lettuce bun.
     * 
     * @return boolean variable lettuceBun, which represents if it a lettuce bun
     */
    public boolean getLettuceBun(){
        return lettuceBun;
    }

}