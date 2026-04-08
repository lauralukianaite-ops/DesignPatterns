package shop;

public class Appliance extends Product{
    int warranty;

    public Appliance(int warranty, String name, double price){
        super(name,price);
        this.warranty=warranty;
    }

    @Override
    public void getInfo(){
        System.out.println("Warranty: " + warranty + " years , name: " + name + ", price" + price);
    }
}
