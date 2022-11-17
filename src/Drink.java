/**
 * Drink class which extends food.
 * @author N. Wan.
*/
public class Drink extends Food {
    
    //declare variable
    String size;

    public Drink(String drinkName, String drinkSize){
        super(drinkName);
        if(drinkSize == "Small") setPrice(1.99);
        else if(drinkSize == "Medium") setPrice(2.99);
        else setPrice(3.99);
        this.size = drinkSize;
    }

    public String getSize(){
        return size;
    }
}
