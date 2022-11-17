/**
 * MorningBurger class file which extends Burger.
 * @author N. Wan.
*/
public class MorningBurger extends Burger{
    
    // Declare variables
    boolean bagelBun;
    boolean sausageMeat;

    /**
     * Constructor - creates a new instance of a burger.
     * 
     * @param String name - the name of the chicken burger
     * @param boolean isCrispy - if the chicken is crispy or grilled
     * @param int spice - what the spice level will be  
     */
    public MorningBurger(String Name, boolean isBagelBun, boolean isSausageMeat){
        super(Name, new String[] {"Cheese", "Egg", "Mayonnaise", "Hash brown", "Bacon"}, 5.99);
        this.bagelBun = isBagelBun;
        this.sausageMeat = isSausageMeat; 
    }

    /**
     * Returns true or false if it is bagel bun.
     * 
     * @return boolean variable bagelBun, which represents if the bun is a bagel
     */
    public boolean getBagelBun(){
        return bagelBun;
    }

    /**
     * Returns true or false if it is sausage meat instead of beef.
     * 
     * @return boolean variable sausageMeat, which represents if the meat is sauage or not. 
     */
    public boolean getSausageMeat(){
        return sausageMeat;
    }

}
