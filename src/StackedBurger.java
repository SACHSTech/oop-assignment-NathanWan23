public class StackedBurger extends Burger{
    
    int bunLayers;
    int beefPaties;

    public StackedBurger(String Name, int BunLayers, int BeefPaties){
        super(Name, new String[] {"Cheese", "Ketchup", "Mayonnaise", "Bacon"}, 12.99);
        this.bunLayers = BunLayers;
        this.beefPaties = BeefPaties; 
    }
    public int getLayers(){
        return bunLayers;
    }

    public int beefPaties(){
        return beefPaties;
    }
}