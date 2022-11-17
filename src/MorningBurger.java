/**
 * MorningBurger class file which extends Burger.
 * @author N. Wan.
*/
public class MorningBurger extends Burger{
    
    // Declare variables
    boolean bagelBun;
    boolean sausageMeat;

    public MorningBurger(String Name, boolean isBagelBun, boolean isSausageMeat){
        super(Name, new String[] {"Cheese", "Egg", "Mayonnaise", "Hash brown", "Bacon"}, 5.99);
        this.bagelBun = isBagelBun;
        this.sausageMeat = isSausageMeat; 
    }

    public boolean getBagelBun(){
        return bagelBun;
    }

    public boolean getSausageMeat(){
        return sausageMeat;
    }

}
