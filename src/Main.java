import java.util.*;
import java.io.*;
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; 
    public static void main(String[] args) throws IOException{

        int itemNum;
        boolean going = true; 
        char addToCart;

        boolean isCrispy;
        int spice;
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
                System.out.println("Chicken Burger: ");
                System.out.println("- Toppings: Lettuce, Tomatoes, Mayonnaise, Pickels" );
                System.out.println("- Choice of either crispy or non-crispy");
                System.out.println("- Can be spicy up to 3 levels");
                System.out.println("Price: $7.99");

                while(going == true){
                    System.out.println("Would you like to add item to order? (Y or N)");
                    addToCart = readCharacter();
                    if(addToCart == 'Y'){
                        while(going == true){
                            System.out.println("Would you like crispy or non-crispy? (Y or N)");
                            if(readCharacter() == 'Y') isCrispy = true;
                            else if (readCharacter() == 'N') isCrispy = false;
                            else System.out.println("Error Please enter again.")
                        }
                        

                    } else if(addToCart == 'N'){
                        break;
                    } else error();
                }
                
                
            }
        } else if(itemNum > 4 && itemNum < 8){

        } else if(itemNum > 7 && itemNum < 12){

        } else {
            System.out.println("Error. Enter item number again.");
        }
    }
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