import java.util.*;
import java.io.*;
public class Menu {
 
    ArrayList<Food> foodList = new ArrayList<Food>();
    Food itemFood;
    
    public Menu(Food food){
        itemFood = food;
        foodList.add(itemFood);
        
    }

    public ArrayList<Food> getfoodList(){
        return foodList;
    }


}
