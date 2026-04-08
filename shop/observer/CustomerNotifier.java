package shop.observer;
import shop.product.Product;

public class CustomerNotifier implements Observer{
    @Override
    public void update(Product p){
        System.out.println("The new product was added: " + p.name);
    }
}
