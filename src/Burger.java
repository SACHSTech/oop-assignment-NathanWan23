public class Burger extends Food {
    
    private String chickenBurger = "Chicken Burger";
    private String MorningBurger = "Morning Burger";
    private String StackedBurger = "Stacked Burger";
    private String VeganBurger = "Vegan Burger";

    
    String[] burgerToppings;
    public Burger(String Name, String[] toppings, double price){
        super(Name, price);
        /*super(Name, 5.99);
        super(Name,10.99);
        (Name, 8.99);*/
        this.burgerToppings = toppings;
    }
}
