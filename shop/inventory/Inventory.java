package shop.inventory;
import shop.observer.Observer;
import shop.observer.Subject;
import shop.product.Product;
import java.util.ArrayList;
import java.util.List;

public class Inventory implements Subject {
    private static Inventory instance;
    private List<Product> products = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    private Inventory(){}

    public static Inventory getInstance(){
        if(instance == null){
            instance = new Inventory();
        }
        return instance;
    }

    public void addProduct(Product p){
        products.add(p);
        notifyObservers(p);
    }

    public List<Product> getProducts(){
        return products;
    }

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void notifyObservers(Product p){
        for(Observer o : observers){
            o.update(p);
        }
    }
}
