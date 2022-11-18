import java.util.*;
import java.io.*;

/**
 * order class.
 * @author N. Wan.
*/
public class Order {
 
    // Declare variables
    private ArrayList<Food> foodList = new ArrayList<Food>();
    private int num;
    private double subTotal;
    

    /**
     * Constructor - creates an order of food.
     */
    public Order(){
        subTotal = 0;
        num = 0;
    }

    /**
     * Adds food to the order
     * @param Food itemFood - the food item
     */
    public void addFoodItem(Food itemFood){
        foodList.add(itemFood);
        num++;
        subTotal = subTotal + itemFood.getPrice();
    }

    /**
     * Returns the order
     * 
     * @return ArrayList<Food> variable foodList, which represents the order 
     */
    public ArrayList<Food> getFoodList(){
        return foodList;
    }

    /* method for solution that I was working on 
    public Food getFood(int n){
        return foodList.get(n);
    }*/

    /**
     * Returns the number of items.
     * 
     * @return int variable num, which represents number of food items
     */
    public int getNumOfItem(){
        return num;
    }

    /**
     * Returns the subtotal.
     * 
     * @return double variable subTotal, which represents the sub total of the order
     */
    public double getSubTotal(){
        return subTotal;
    } 

    /**
     * Returns the tax.
     * 
     * @return tax 
     */
    public double getTax(){
        return subTotal * 0.13;
    }

    /**
     * Returns the total price.
     * 
     * @return total price
     */
    public double getTotalPrice(){
        return subTotal * 1.13;
    }

}