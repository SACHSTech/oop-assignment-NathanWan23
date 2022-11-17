import java.util.*;
import java.io.*;
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; 
    public static void main(String[] args) throws IOException{

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
        System.out.println("8 | Fruitopea");
        System.out.println("9 | Dr. Pepper"); 
        System.out.println("10| Coca-Cola");
        System.out.println("11| Root Beer");
        System.out.println("-------------------");

        while(going == true){
        System.out.print("Enter the item you would like to view: ");
        itemNum = readInt();

        if(itemNum > 0 && itemNum < 5){

            if (itemNum == 1) {
                System.out.println("Morning Burger: ");
                System.out.println("- Toppings: Cheese, Egg, Mayonnaise, Hash brown, bacon" );
                System.out.println("- Choice of either bagel bun or potato bun");
                System.out.println("- Choice of either sausge meat or beef meat");
                System.out.println("Price: $5.99");

                while(going == true){
                    System.out.println("Would you like to this add item your order? (Y or N)");
                    addToCart = readCharacter();
                    if(addToCart == 'Y'){

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
                            /*if(readCharacter() == 'Y'){
                                isSausageMeat = true; 
                                break;
                            } 
                            else if (readCharacter() == 'N') {
                                isSausageMeat = false; 
                                break;
                            } else error();*/
                        } 

                        System.out.println("Name for burger: ");
                        Burger MorningBurger = new MorningBurger(readLine(), isBagelBun, isSausageMeat);
                        order.addFoodItem(MorningBurger);
                        break;

                    } else if(addToCart == 'N'){
                        break;
                    } else error();
                }
            } else if(itemNum == 2){
                System.out.println("Stacked Burger: ");
                System.out.println("- Toppings: Cheese, Ketchup, Mayonnaise, Bacon" );
                System.out.println("- Can be up to 5 beef paties");
                System.out.println("- Can be up to 4 bun layers");
                System.out.println("Price: $12.99");

                while(going == true){
                    System.out.println("Would you like to this add item your order? (Y or N)");
                    addToCart = readCharacter();
                    if(addToCart == 'Y'){

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

                        System.out.println("Name for burger: ");
                        Burger StackedBurger = new StackedBurger(readLine(), buns, beef);
                        order.addFoodItem(StackedBurger);
                        break;

                    } else if(addToCart == 'N'){
                        break;
                    } else error();
                }
            } else if (itemNum == 3) {
                System.out.println("Vegan Burger: ");
                System.out.println("- Toppings: Ketchup, Mayonnaise, Lettuce, Tomatoes, Grilled onions, Sauted Mushrooms");
                System.out.println("- Choice of either beyond meat or non-beyond meat");
                System.out.println("- Choice of either lettuce bun or potato bun");
                System.out.println("Price: $7.99");

                while(going == true){
                    System.out.println("Would you like to this add item your order? (Y or N)");
                    addToCart = readCharacter();
                    if(addToCart == 'Y'){

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

                        System.out.println("Name for burger: ");
                        Burger VeganBurger = new VeganBurger(readLine(), isBeyondMeat, isLettuceBun);
                        order.addFoodItem(VeganBurger);
                        break;

                    } else if(addToCart == 'N'){
                        break;
                    } else error();
                }
            } else if (itemNum == 4) {
                System.out.println("Chicken Burger: ");
                System.out.println("- Toppings: Lettuce, Tomatoes, Mayonnaise, Pickels" );
                System.out.println("- Choice of either crispy or non-crispy");
                System.out.println("- Can be spicy up to 3 levels");
                System.out.println("Price: $7.99");

                while(going == true){
                    System.out.println("Would you like to this add item your order? (Y or N)");
                    addToCart = readCharacter();
                    if(addToCart == 'Y'){

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

                        System.out.println("Name for burger: ");
                        Burger ChickenBurger = new ChickenBurger(readLine(), isCrispy, spice);
                        order.addFoodItem(ChickenBurger);
                        break;

                    } else if(addToCart == 'N'){
                        break;
                    } else error();
                }
            }
        } else if(itemNum > 4 && itemNum < 8){

            if(itemNum == 5){
                System.out.println("French Fries");
                System.out.println(" - Can be size Small, Medium, or Large");
                System.out.println("Price: Small = $2.99, Medium = $3.99, Large = $4.99");

                while(going == true){
                    System.out.println("Would you like to this add item your order? (Y or N)");
                    addToCart = readCharacter();
                    
                    if(addToCart == 'Y'){

                        while(going == true){
                            System.out.println("What size would you like (Small or Medium or Large)");
                            size = readLine();
                            if(size.equals("Small")) break;
                            else if (size.equals("Medium")) break;
                            else if(size.equals("Large")) break;
                            else error();
                        }
                        System.out.println("Name for fries: ");
                        Sides fries = new Sides(readLine(), size);
                        order.addFoodItem(fries);   
                        break;

                    } else if(addToCart == 'N'){
                        break;
                    } else error();
                          
                }
            } else if (itemNum == 6){
                System.out.println("Waffle Fries");
                System.out.println(" - Can be size Small, Medium, or Large");
                System.out.println("Price: Small = $2.99, Medium = $3.99, Large = $4.99");

                while(going == true){
                    System.out.println("Would you like to this add item your order? (Y or N)");
                    addToCart = readCharacter();
                    
                    if(addToCart == 'Y'){

                        while(going == true){
                            System.out.println("What size would you like (Small or Medium or Large)");
                            size = readLine();
                            if(size.equals("Small")) break;
                            else if (size.equals("Medium")) break;
                            else if(size.equals("Large")) break;
                            else error();
                        }
                        System.out.println("Name for waffle fries: ");
                        Sides waffleFries = new Sides(readLine(), size);
                        order.addFoodItem(waffleFries);   
                        break;

                    } else if(addToCart == 'N'){
                        break;
                    } else error();
                          
                }

            } else {
                System.out.println("Poutine");
                System.out.println(" - Fries, Gravy, and Cheese curds");
                System.out.println(" - Can be size Small, Medium, or Large");
                System.out.println("Price: Small = $2.99, Medium = $3.99, Large = $4.99");

                while(going == true){
                    System.out.println("Would you like to this add item your order? (Y or N)");
                    addToCart = readCharacter();
                    
                    if(addToCart == 'Y'){

                        while(going == true){
                            System.out.println("What size would you like (Small or Medium or Large)");
                            size = readLine();
                            if(size.equals("Small")) break;
                            else if (size.equals("Medium")) break;
                            else if(size.equals("Large")) break;
                            else error();
                        }
                        System.out.println("Name for poutine: ");
                        Sides poutine = new Sides(readLine(), size);
                        order.addFoodItem(poutine);   
                        break;

                    } else if(addToCart == 'N'){
                        break;
                    } else error();
                          
                }
            }

        } else if(itemNum > 7 && itemNum < 12){

            if(itemNum == 8){
                System.out.println("Fruitopea");
                System.out.println(" - Can be size Small, Medium, or Large");
                System.out.println("Price: Small = $1.99, Medium = $2.99, Large = $3.99");

                while(going == true){
                    System.out.println("Would you like to this add item your order? (Y or N)");
                    addToCart = readCharacter();
                    
                    if(addToCart == 'Y'){

                        while(going == true){
                            System.out.println("What size would you like (Small or Medium or Large)");
                            size = readLine();
                            if(size.equals("Small")) break;
                            else if (size.equals("Medium")) break;
                            else if(size.equals("Large")) break;
                            else error();
                        }
                        System.out.println("Name for Fuitopea: ");
                        Drink fuitopea = new Drink(readLine(), size);
                        order.addFoodItem(fuitopea);   
                        break;

                    } else if(addToCart == 'N'){
                        break;
                    } else error();
                          
                }
            } else if(itemNum == 9){
                System.out.println("Dr. Pepper");
                System.out.println(" - Can be size Small, Medium, or Large");
                System.out.println("Price: Small = $1.99, Medium = $2.99, Large = $3.99");

                while(going == true){
                    System.out.println("Would you like to this add item your order? (Y or N)");
                    addToCart = readCharacter();
                    
                    if(addToCart == 'Y'){

                        while(going == true){
                            System.out.println("What size would you like (Small or Medium or Large)");
                            size = readLine();
                            if(size.equals("Small")) break;
                            else if (size.equals("Medium")) break;
                            else if(size.equals("Large")) break;
                            else error();
                        }
                        System.out.println("Name for Dr. Pepper: ");
                        Drink drPepper = new Drink(readLine(), size);
                        order.addFoodItem(drPepper);   
                        break;

                    } else if(addToCart == 'N'){
                        break;
                    } else error();
                          
                }
            } else if(itemNum == 10){
                System.out.println("Coca-Cola");
                System.out.println(" - Can be size Small, Medium, or Large");
                System.out.println("Price: Small = $1.99, Medium = $2.99, Large = $3.99");

                while(going == true){
                    System.out.println("Would you like to this add item your order? (Y or N)");
                    addToCart = readCharacter();
                    
                    if(addToCart == 'Y'){

                        while(going == true){
                            System.out.println("What size would you like (Small or Medium or Large)");
                            size = readLine();
                            if(size.equals("Small")) break;
                            else if (size.equals("Medium")) break;
                            else if(size.equals("Large")) break;
                            else error();
                        }
                        System.out.println("Name for Coca-Cola: ");
                        Drink cocaCola = new Drink(readLine(), size);
                        order.addFoodItem(cocaCola);   
                        break;

                    } else if(addToCart == 'N'){
                        break;
                    } else error();
                          
                }
            } else if(itemNum == 9){
                System.out.println("Root Beer");
                System.out.println(" - Can be size Small, Medium, or Large");
                System.out.println("Price: Small = $1.99, Medium = $2.99, Large = $3.99");

                while(going == true){
                    System.out.println("Would you like to this add item your order? (Y or N)");
                    addToCart = readCharacter();
                    
                    if(addToCart == 'Y'){

                        while(going == true){
                            System.out.println("What size would you like (Small or Medium or Large)");
                            size = readLine();
                            if(size.equals("Small")) break;
                            else if (size.equals("Medium")) break;
                            else if(size.equals("Large")) break;
                            else error();
                        }
                        System.out.println("Name for Root Beer: ");
                        Drink rootBeer = new Drink(readLine(), size);
                        order.addFoodItem(rootBeer);   
                        break;

                    } else if(addToCart == 'N'){
                        break;
                    } else error();
                          
                }
            }

        } else error();
        while(going  == true){
            System.out.println("Would you like to keep ordering / browsing? (yOrN)");
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
    System.out.println(foodList);
    }

    static String next () throws IOException {
        while (st == null || ! st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong () throws IOException {
        return Long.parseLong(next());
    }
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }  
    static String readLine () throws IOException {
        return br.readLine().trim();
    }

    static void error(){
        System.out.println("Error. Please enter again.");
    }
}