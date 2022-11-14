public class ChickenBurger extends Burger {
    
    private String chickenBurger = "Chicken Burger";
    private String MorningBurger = "Morning Burger";
    private String StackedBurger = "Stacked Burger";
    private String VeganBurger = "Vegan Burger";

    
    String[] burgerToppings = {"lettuce", "Tomatoes", "Mayonnaise", "Pickles"};
    double burgerPrice = 7.99;
    boolean crispy;
    int spiceLevel;

    public ChickenBurger(String Name, boolean isCrispy, int spice){
        super(Name, burgerToppings, burgerPrice);
        this.crispy = isCrispy;
        this.spiceLevel = spice; 
        
    }

    public boolean getCrispy(){
        return crispy;
    }

    
}

