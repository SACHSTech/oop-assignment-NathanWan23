public class Sides extends Food{

    String size;

    public Sides(String name, String sideSize){
        if(Size == "Small") super(name, 2.99);
        else if(Size == "Medium") super(name, 3.99);
        else super(name, 4.99);

        this.size = sideSize;
    }
}