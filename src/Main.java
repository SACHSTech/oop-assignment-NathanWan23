import java.util.*;
import java.io.*;
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; 
    public static void main(String[] args) throws IOException{

        int itemNum;
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

        System.out.print("Enter the item you would like to view: ");
        itemNum = readInt();

        if(itemNum > 0 && itemNum < 5){

            if (itemNum == 1) {
                System.out.println("Chicken Burger: ");
                System.out.println("Toppings: " + get.);
                Food ChickenBurger = new ChickenBurger()
            }
        } else if(itemNum > 4 && itemNum < 8){

        } else if(itemNum > 7 && itemNum < 12){

        } else {
            System.out.println("Error. Enter item number agian.");
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
}