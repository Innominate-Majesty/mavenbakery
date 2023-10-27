package sjcc;

import java.util.List;

public class Cupcake {
    
    private int id;
    private String name;
    private double price;
    private List<String> frosting;

    //constructor
    public Cupcake() {

    }
    
    //constructor
    public Cupcake(int id, String name, double price, List<String> frosting) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.frosting = frosting;
    }
    
    //Name
    public String getName() {
        return name;
    }

    //ID
    public int getId() {
        return id;
    }

    //Price
    public double getPrice() {
        return price;
    }

    //Frosting
    public List<String> getFrosting() {
        return frosting;
    }

    //Name
    public void setName (String name) {
        this.name = name;
    }

    //ID
    public void setId(int id) {
        this.id = id;
    }

    //Price
    public void setPrice(double price) {
        this.price = price;
    }

    //Frosting
    public void setFrosting(List<String> frosting) {
        this.frosting = frosting;
    }

    @Override
    public String toString() {
        return "Cupcake{" + "id=" + id + ", name=' " + name +
        '\'' + ",price=" + price + ", frosting=" + frosting + '}';
    }
}
