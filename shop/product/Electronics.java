package shop;

public class Electronics extends Product{
    String brand;

    public Electronics(String brand, String name, double price){
        super(name,price);
        this.brand=brand;
    }

    @Override
    public void getInfo(){
        System.out.println("Brand: " + brand + ", name: " + name + ", price" + price);
    }
}
