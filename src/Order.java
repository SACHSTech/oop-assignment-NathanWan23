import java.util.*;
import java.io.*;
public class Order {
 
    ArrayList<Food> foodList = new ArrayList<Food>();
    Food itemFood;
    int num = 0;
    double totalPrice = 0;
    double subTotal = 0;
    double tax = 0;

    public Order(Food food){
        itemFood = food;
        foodList.add(itemFood);
        num++;
        subTotal = subTotal + food.getPrice();
    }

    public ArrayList<Food> getfoodList(){
        return foodList;
    }

    public int getNumOfItem(){
        return num;
    }

    public double getSubTotal(){
        return subTotal;
    } 

}