package shop.inventory;
import shop.product.Product;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private static Inventory instance;
    private List<Product> products = new ArrayList<>();

    private Inventory(){}

    public static Inventory getInstance(){
        if(instance == null){
            instance = new Inventory();
        }
        return instance;
    }

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getProducts(){
        return products;
    }
}
