import java.util.*;
import java.io.*;
public class Order {
 
    ArrayList<Food> foodList = new ArrayList<Food>();
    int num;
    double subTotal;
    

    public Order(){
        subTotal = 0;
        num = 0;
    }
    public void addFoodItem(Food itemFood){
        foodList.add(itemFood);
        num++;
        subTotal = subTotal + itemFood.getPrice();
    }

    public ArrayList<Food> getFoodList(){
        return foodList;
    }

    public Food getFood(int n){
        return foodList.get(n);
    }

    public int getNumOfItem(){
        return num;
    }

    public double getSubTotal(){
        return subTotal;
    } 

    public double getTax(){
        return subTotal * 0.13;
    }

    public double getTotalPrice(){
        return subTotal * 1.13;
    }

}