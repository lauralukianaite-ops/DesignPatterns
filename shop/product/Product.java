package shop;

public class Product {
    String name;
    double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void getInfo(){
        System.out.println("shop.Product: " + name + ", price: " +  price);
    }
}
