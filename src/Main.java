import java.util.*;
import java.io.*;
/**
 * Main run method that takes your order and outputs the subtotal, tax, and total.
 * @author N. Wan.
*/
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; 
    public static void main(String[] args) throws IOException{

        //ArrayList<String> foodType = new ArrayList<String>();

        // Declare variables
        int itemNum;
        boolean going = true; 
        char addToCart;
        boolean isCrispy = true;
        int spice = 0;
        int buns = 0; 
        int beef = 1; 
        boolean isBeyondMeat = true;
        boolean isLettuceBun = true;
        boolean isBagelBun = true;
        boolean isSausageMeat = true; 
        char yOrN;
        int numOption;
        Order order = new Order();
        String size = "Small";

        while(going == true){
            // Menu
            System.out.println("-------------------");
            System.out.println("BURGERS");
            System.out.println("1 | Morning Burger");
            System.out.println("2 | Stacked Burger");
            System.out.println("3 | Vegan Burger");
            System.out.println("4 | Chicken Burger");
            System.out.println("SIDES");
            System.out.println("5 | Fries");
            System.out.println("6 | Waffle Fries"); 
            System.out.println("7 | Poutine");
            System.out.println("Drinks");
            System.out.println("8 | Fruitopia");
            System.out.println("9 | Dr. Pepper"); 
            System.out.println("10| Coca-Cola");
            System.out.println("11| Root Beer");
            System.out.println("-------------------");

            System.out.print("Enter the item you would like to view: ");
            itemNum = readInt();

        
            if(itemNum > 0 && itemNum < 5){

                // Interface for Morning Burger
                if (itemNum == 1) {
                    System.out.println("Morning Burger: ");
                    System.out.println("- Toppings: Cheese, Egg, Mayonnaise, Hash brown, bacon" );
                    System.out.println("- Choice of either bagel bun or potato bun");
                    System.out.println("- Choice of either sausge meat or beef meat");
                    System.out.println("Price: $5.99");

                    // Asks to add to cart
                    while(going == true){
                        System.out.println("Would you like to this add item your order? (Y or N)");
                        addToCart = readCharacter();
                        if(addToCart == 'Y'){

                            // What the user wants
                            while(going == true){
                                System.out.println("Would you like the bagel bun? (Y or N)");
                                yOrN = readCharacter();
                                if(yOrN == 'Y'){
                                    isBagelBun = true; 
                                    break;
                                } 
                                else if (yOrN == 'N') {
                                    isBagelBun = false; 
                                    break;
                                } else error();
                            }
                            while(going == true){
                                System.out.println("Would you like the sausage meat? (Y or N)");
                                yOrN = readCharacter();
                                if(yOrN == 'Y'){
                                    isSausageMeat = true; 
                                    break;
                                } 
                                else if (yOrN == 'N') {
                                    isSausageMeat = false; 
                                    break;
                                } else error();
                            } 

                            // Asks for name and creates the object and adds it to the order
                            System.out.println("Name for burger: ");
                            Burger morningBurger = new MorningBurger(readLine(), isBagelBun, isSausageMeat);
                            order.addFoodItem(morningBurger);
                            //foodType.add("Morning Burger");
                            break;

                        } else if(addToCart == 'N'){
                            break;
                        } else error();
                    }

                // Interface for Stacked Burger
                } else if(itemNum == 2){
                    System.out.println("Stacked Burger: ");
                    System.out.println("- Toppings: Cheese, Ketchup, Mayonnaise, Bacon" );
                    System.out.println("- Can be up to 5 beef paties");
                    System.out.println("- Can be up to 4 bun layers");
                    System.out.println("Price: $12.99");

                    // Asks to add to cart
                    while(going == true){
                        System.out.println("Would you like to this add item your order? (Y or N)");
                        addToCart = readCharacter();
                        if(addToCart == 'Y'){

                            // What the user wants
                            while(going == true){
                                System.out.println("How many beef paties would you like (1-5)");
                                numOption = readInt();
                                if(numOption > 0 && numOption < 6){
                                    beef = numOption;
                                    break;
                                } else error();
                            }
                            while(going == true){
                                System.out.println("How many buns would you like? (0-4)");
                                numOption = readInt();
                                if(numOption > -1 && numOption < 5){
                                    buns = numOption;
                                    break;
                                } else error();
                            }

                            // Asks for name and creates the object and adds it to the order
                            System.out.println("Name for burger: ");
                            Burger stackedBurger = new StackedBurger(readLine(), buns, beef);
                            order.addFoodItem(stackedBurger);
                            //foodType.add("Stacked Burger");
                            break;

                        } else if(addToCart == 'N'){
                            break;
                        } else error();
                    }

                // Interface for Vegan Burger
                } else if (itemNum == 3) {
                    System.out.println("Vegan Burger: ");
                    System.out.println("- Toppings: Ketchup, Mayonnaise, Lettuce, Tomatoes, Grilled onions, Sauted Mushrooms");
                    System.out.println("- Choice of either beyond meat or non-beyond meat");
                    System.out.println("- Choice of either lettuce bun or potato bun");
                    System.out.println("Price: $7.99");

                    // Asks to add to cart
                    while(going == true){
                        System.out.println("Would you like to this add item your order? (Y or N)");
                        addToCart = readCharacter();
                        if(addToCart == 'Y'){

                            // What the user wants
                            while(going == true){
                                System.out.println("Would you like beyond meat or non-beyond meat? (Y or N)");
                                yOrN = readCharacter();
                                if(yOrN == 'Y'){
                                    isBeyondMeat = true; 
                                    break;
                                } 
                                else if (yOrN == 'N') {
                                    isBeyondMeat = false; 
                                    break;
                                } else error();
                            }
                            while(going == true){
                                System.out.println("Would you like lettuce bun? (Y or N)");
                                yOrN = readCharacter();
                                if(yOrN == 'Y'){
                                    isLettuceBun = true; 
                                    break;
                                } 
                                else if (yOrN == 'N') {
                                    isLettuceBun = false; 
                                    break;
                                } else error();
                            }
                       
                            // Asks for name and creates the object and adds it to the order
                            System.out.println("Name for burger: ");
                            Burger veganBurger = new VeganBurger(readLine(), isBeyondMeat, isLettuceBun);
                            order.addFoodItem(veganBurger);
                            //foodType.add("Vegan Burger");
                            break;

                        } else if(addToCart == 'N'){
                            break;
                        } else error();
                    }
                    // Interface for Chicken Burger
                } else if (itemNum == 4) {
                    System.out.println("Chicken Burger: ");
                    System.out.println("- Toppings: Lettuce, Tomatoes, Mayonnaise, Pickels" );
                    System.out.println("- Choice of either crispy or non-crispy");
                    System.out.println("- Can be spicy up to 3 levels");
                    System.out.println("Price: $7.99");

                    // Asks to add to cart
                    while(going == true){
                        System.out.println("Would you like to this add item your order? (Y or N)");
                        addToCart = readCharacter();
                        if(addToCart == 'Y'){

                            // What the user wants
                            while(going == true){
                                System.out.println("Would you like crispy or non-crispy? (Y or N)");
                                yOrN = readCharacter();
                                if(yOrN == 'Y'){
                                    isCrispy = true; 
                                    break;
                                } 
                                else if (yOrN == 'N') {
                                    isCrispy = false; 
                                    break;
                                } else error();
                            }
                            while(going == true){
                                System.out.println("What spice level would you like? (0-3)");
                                numOption = readInt();
                                if(numOption > -1 && numOption < 4){
                                    spice = numOption;
                                    break;
                                } else error();
                            }
                             
                            // Asks for name and creates the object and adds it to the order
                            System.out.println("Name for burger: ");
                            Burger chickenBurger = new ChickenBurger(readLine(), isCrispy, spice);
                            order.addFoodItem(chickenBurger);
                            //foodType.add("Chicken Burger");
                            break;

                        } else if(addToCart == 'N'){
                            break;
                        } else error();
                    }
                }
            } else if(itemNum > 4 && itemNum < 8){

                // Interface for Fries
                if(itemNum == 5){
                    System.out.println("French Fries");
                    System.out.println(" - Can be size Small, Medium, or Large");
                    System.out.println("Price: Small = $2.99, Medium = $3.99, Large = $4.99");

                    // Asks to add to cart
                    while(going == true){
                        System.out.println("Would you like to this add item your order? (Y or N)");
                        addToCart = readCharacter();
                        
                        if(addToCart == 'Y'){

                            // What the user wants
                            while(going == true){
                                System.out.println("What size would you like (Small or Medium or Large)");
                                size = readLine();
                                if(size.equals("Small")) break;
                                else if (size.equals("Medium")) break;
                                else if(size.equals("Large")) break;
                                else error();
                            }

                            // Asks for name and creates the object and adds it to the order
                            System.out.println("Name for fries: ");
                            Sides fries = new Sides(readLine(), size);
                            order.addFoodItem(fries);   
                            //foodType.add("Fries");
                            break;

                        } else if(addToCart == 'N'){
                            break;
                        } else error();
                            
                    }
                // Interface for Waffle fries
                } else if (itemNum == 6){
                    System.out.println("Waffle Fries");
                    System.out.println(" - Can be size Small, Medium, or Large");
                    System.out.println("Price: Small = $2.99, Medium = $3.99, Large = $4.99");

                    // Asks to add to cart
                    while(going == true){
                        System.out.println("Would you like to this add item your order? (Y or N)");
                        addToCart = readCharacter();
                        
                        if(addToCart == 'Y'){

                            // What the user wants
                            while(going == true){
                                System.out.println("What size would you like (Small or Medium or Large)");
                                size = readLine();
                                if(size.equals("Small")) break;
                                else if (size.equals("Medium")) break;
                                else if(size.equals("Large")) break;
                                else error();
                            }

                            // Asks for name and creates the object and adds it to the order
                            System.out.println("Name for waffle fries: ");
                            Sides waffleFries = new Sides(readLine(), size);
                            order.addFoodItem(waffleFries);   
                            //foodType.add("Waffle Fries");
                            break;

                        } else if(addToCart == 'N'){
                            break;
                        } else error();
                            
                    }

                } else {
                    // Interface for poutine
                    System.out.println("Poutine");
                    System.out.println(" - Fries, Gravy, and Cheese curds");
                    System.out.println(" - Can be size Small, Medium, or Large");
                    System.out.println("Price: Small = $2.99, Medium = $3.99, Large = $4.99");

                    // Asks to add to cart
                    while(going == true){
                        System.out.println("Would you like to this add item your order? (Y or N)");
                        addToCart = readCharacter();
                        
                        if(addToCart == 'Y'){

                            // What the user wants
                            while(going == true){
                                System.out.println("What size would you like (Small or Medium or Large)");
                                size = readLine();
                                if(size.equals("Small")) break;
                                else if (size.equals("Medium")) break;
                                else if(size.equals("Large")) break;
                                else error();
                            }

                            // Asks for name and creates the object and adds it to the order
                            System.out.println("Name for poutine: ");
                            Sides poutine = new Sides(readLine(), size);
                            order.addFoodItem(poutine);   
                            //foodType.add("Poutine");
                            break;

                        } else if(addToCart == 'N'){
                            break;
                        } else error();
                            
                    }
                }

            } else if(itemNum > 7 && itemNum < 12){

                // Interface for Fruitopea
                if(itemNum == 8){
                    System.out.println("Fruitopea");
                    System.out.println(" - Can be size Small, Medium, or Large");
                    System.out.println("Price: Small = $1.99, Medium = $2.99, Large = $3.99");

                    // Asks to add to cart
                    while(going == true){
                        System.out.println("Would you like to this add item your order? (Y or N)");
                        addToCart = readCharacter();
                        
                        if(addToCart == 'Y'){

                            // What the user wants
                            while(going == true){
                                System.out.println("What size would you like (Small or Medium or Large)");
                                size = readLine();
                                if(size.equals("Small")) break;
                                else if (size.equals("Medium")) break;
                                else if(size.equals("Large")) break;
                                else error();
                            }

                            // Asks for name and creates the object and adds it to the order
                            System.out.println("Name for Fuitopia: ");
                            Drink fruitopia = new Drink(readLine(), size);
                            order.addFoodItem(fruitopia);   
                            //foodType.add("Fruitopia");
                            break;

                        } else if(addToCart == 'N'){
                            break;
                        } else error();
                            
                    }
                } else if(itemNum == 9){

                    // Interface for Dr. Pepper
                    System.out.println("Dr. Pepper");
                    System.out.println(" - Can be size Small, Medium, or Large");
                    System.out.println("Price: Small = $1.99, Medium = $2.99, Large = $3.99");

                    // Asks to add to cart
                    while(going == true){
                        System.out.println("Would you like to this add item your order? (Y or N)");
                        addToCart = readCharacter();
                        
                        if(addToCart == 'Y'){

                            // What the user wants
                            while(going == true){
                                System.out.println("What size would you like (Small or Medium or Large)");
                                size = readLine();
                                if(size.equals("Small")) break;
                                else if (size.equals("Medium")) break;
                                else if(size.equals("Large")) break;
                                else error();
                            }

                            // Asks for name and creates the object and adds it to the order
                            System.out.println("Name for Dr. Pepper: ");
                            Drink drPepper = new Drink(readLine(), size);
                            order.addFoodItem(drPepper);   
                            //foodType.add("Dr Pepper");
                            break;

                        } else if(addToCart == 'N'){
                            break;
                        } else error();
                            
                    }
                } else if(itemNum == 10){
                    // Interface for Coca-Cola
                    System.out.println("Coca-Cola");
                    System.out.println(" - Can be size Small, Medium, or Large");
                    System.out.println("Price: Small = $1.99, Medium = $2.99, Large = $3.99");

                    // Asks to add to cart
                    while(going == true){
                        System.out.println("Would you like to this add item your order? (Y or N)");
                        addToCart = readCharacter();
                        
                        if(addToCart == 'Y'){

                            // What the user wants
                            while(going == true){
                                System.out.println("What size would you like (Small or Medium or Large)");
                                size = readLine();
                                if(size.equals("Small")) break;
                                else if (size.equals("Medium")) break;
                                else if(size.equals("Large")) break;
                                else error();
                            }

                            // Asks for name and creates the object and adds it to the order
                            System.out.println("Name for Coca-Cola: ");
                            Drink cocaCola = new Drink(readLine(), size);
                            order.addFoodItem(cocaCola);   
                            //foodType.add("Coca Cola");
                            break;

                        } else if(addToCart == 'N'){
                            break;
                        } else error();
                            
                    }
                } else if(itemNum == 11){
                    // Interface for Morning Burger
                    System.out.println("Root Beer");
                    System.out.println(" - Can be size Small, Medium, or Large");
                    System.out.println("Price: Small = $1.99, Medium = $2.99, Large = $3.99");

                    // Asks to add to cart
                    while(going == true){
                        System.out.println("Would you like to this add item your order? (Y or N)");
                        addToCart = readCharacter();
                        
                        if(addToCart == 'Y'){

                            // What the user wants
                            while(going == true){
                                System.out.println("What size would you like (Small or Medium or Large)");
                                size = readLine();
                                if(size.equals("Small")) break;
                                else if (size.equals("Medium")) break;
                                else if(size.equals("Large")) break;
                                else error();
                            }

                            // Asks for name and creates the object and adds it to the order
                            System.out.println("Name for Root Beer: ");
                            Drink rootBeer = new Drink(readLine(), size);
                            order.addFoodItem(rootBeer);   
                            //foodType.add("Root Beer");
                            break;

                        } else if(addToCart == 'N'){
                            break;
                        } else error();
                            
                    }
                }

        } else error();
        
        // Ask if they want to proceed to checkout or still order
        while(going  == true){
            System.out.println("Would you like to keep ordering / browsing? (Y or N)");
            yOrN = readCharacter();
            if (yOrN == 'Y'){
                break;
            } else if (yOrN == 'N'){
                going = false;
                break;
            } else error();
        } 
    }

    ArrayList<Food> foodList = order.getFoodList(); 

    // Output all items, their names, thier prices, then subtotal, tax, and total.
    for(int i = 0; i < foodList.size(); i++){
        System.out.println("---------");
        /*if(foodType.get(i).equals("MorningBurger")){
            System.out.println(foodList.get(i).getBagelBun()? "Yes":"No");
        }  */
        System.out.println(foodList.get(i));
        System.out.println(foodList.get(i).getName());
        System.out.println("$ " + foodList.get(i).getPrice());
    }
    System.out.println("----------");
    System.out.println("Sub-Total: $" + String.format("%.2f",order.getSubTotal()));
    System.out.println("Tax: $" + String.format("%.2f",order.getTax()));
    System.out.println("Total: $" + String.format("%.2f",order.getTotalPrice()));
    }

    /**
     * Used to create readInt, readCharacter, and readLine
     * 
     * @return st, the next token from the st
     */
    static String next () throws IOException {
        while (st == null || ! st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    /**
     * Used to read number
     * 
     * @return int number
     */
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }

    /**
     * Used to read character
     * 
     * @return char character
     */
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }  

    /**
     * Used to read Line
     * 
     * @return String line
     */
    static String readLine () throws IOException {
        return br.readLine().trim();
    }

    /**
     * Used to write error message when the user inputs a value that its not supposed to input
     */
    static void error(){
        System.out.println("Error. Please enter again.");
    }
}