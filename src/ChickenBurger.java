public class ChickenBurger extends Burger {
    
    boolean crispy;
    int spiceLevel;

    public ChickenBurger(String Name, boolean isCrispy, int spice){
        super(Name, new String[] {"lettuce", "Tomatoes", "Mayonnaise", "Pickles"}, 7.99);
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

