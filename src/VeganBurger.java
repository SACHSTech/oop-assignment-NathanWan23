public class VeganBurger extends Burger{
    
    boolean beyondMeat;
    boolean lettuceBun;

    public VeganBurger(String Name, boolean isBeyondMeat, boolean isLettuceBun){
        super(Name, new String[] {"Ketchup", "Mayonnaise", "Lettuce", "Tomatoes", "Grilled onions", "Sauteed mushrooms"}, 7.99);
        this.bunLayers = BunLayers;
        this.beefPaties = BeefPaties; 
    }
}