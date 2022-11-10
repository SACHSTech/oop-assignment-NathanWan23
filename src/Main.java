import java.util.*;
import java.io.*;
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; 
    public static void main(String[] args) throws IOException{

        int itemNum;
        System.out.println("BURGERS");
        System.out.println("1| Morning Burger");
        System.out.println("2| Stacked Burger");
        System.out.println("3| Vegan Burger");
        System.out.println("4| Chicken Burger");
        System.out.println("SIDES");
        System.out.println("5| Fries");
        System.out.println("6| Waffle Fries"); 
        System.out.println("7| Poutine");
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