public class StackedBurger extends Burger{
    
    int layers;
    int beefPaties;

    public StackedBurger(String Name, int Layers, int BeefPaties){
        super(Name, new String[] {"Cheese", "Ketchup", "Mayonnaise", "Bacon"}, 12.99);
        this.layers = Layers;
        this.beefPaties = BeefPaties; 
    }
}