public class MorningBurger extends Burger{
    
    boolean bagelBun;
    boolean sausageMeat;

    public MorningBurger(String Name, boolean isBagelBun, boolean isSausageMeat){
        super(Name, new String[] {"Cheese", "Egg", "Mayonnaise", "Hash Brown", "Bacon"}, 5.99);
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
