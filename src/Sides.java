public class Sides extends Food{

    String size;

    public Sides(String name, String sideSize){
        super(name);
        if(sideSize == "Small") setPrice(2.99);
        else if(sideSize == "Medium") setPrice(3.99);
        else setPrice(4.99);
        this.size = sideSize;
    }

    public String getSize(){
        return size;
    }

}