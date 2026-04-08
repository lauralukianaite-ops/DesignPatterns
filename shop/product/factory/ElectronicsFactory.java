package shop.product.factory;
import shop.product.Electronics;
import shop.product.Product;

public class ElectronicsFactory extends ProductFactory{
    private String brand, name;
    private double price;

    public ElectronicsFactory(String brand, String name, double price){
        this.brand=brand;
        this.name=name;
        this.price=price;
    }

    @Override
    public Product createProduct(){
        return new Electronics(brand,name,price);
    }
}
