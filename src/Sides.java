/**
 * Sides class which extends food.
 * @author N. Wan.
*/
public class Sides extends Food{

    // Declare variables
    private String size;

    /**
     * Constructor - creates a new instance of a side.
     * 
     * @param String name - the name for the side
     * @param String sideSize - the size of the side
     */
    public Sides(String name, String sideSize){
        super(name);
        if(sideSize == "Small") setPrice(2.99);
        else if(sideSize == "Medium") setPrice(3.99);
        else setPrice(4.99);
        this.size = sideSize;
    }

     /**
     * Returns string of the size
     * 
     * @return String size, which represents the size of the side
     */
    public String getSize(){
        return size;
    }

}