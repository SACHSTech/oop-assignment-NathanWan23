import java.util.*;
import java.io.*;
public class Menu {
 
    ArrayList<Food> foodList = new ArrayList<Food>();
    Food itemFood;
    int num = 0;

    public Menu(Food food){
        itemFood = food;
        foodList.add(itemFood);
        num++;
    }

    public ArrayList<Food> getfoodList(){
        return foodList;
    }

    public int getNumofItem(){
        return num;
    }

}
