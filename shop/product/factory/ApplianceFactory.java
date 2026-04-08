package shop.product.factory;

import shop.product.Appliance;
import shop.product.Product;

public class ApplianceFactory extends ProductFactory{
    private String name;
    private int warranty;
    private double price;

    public ApplianceFactory(int warranty, String name, double price){
        this.warranty=warranty;
        this.name=name;
        this.price=price;
    }

    @Override
    public Product createProduct(){
        return new Appliance(warranty,name,price);
    }
}
