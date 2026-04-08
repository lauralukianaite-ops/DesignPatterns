import shop.inventory.Inventory;
import shop.observer.CustomerNotifier;
import shop.order.BasicOrder;
import shop.order.ExpressDeliveryDecorator;
import shop.order.GiftWrapDecorator;
import shop.order.Order;
import shop.payment.CreditCardPayment;
import shop.payment.PaymentStrategy;
import shop.product.Product;
import shop.product.factory.BookFactory;
import shop.product.factory.ElectronicsFactory;

public class Main {
    public static void main(String[] args) {
        BookFactory bookFactory = new BookFactory("Harry Potter", 20, "JK Rowling");
        Product book = bookFactory.createProduct();

        Inventory inventory = Inventory.getInstance();
        inventory.addObserver(new CustomerNotifier());
        inventory.addProduct(book);

        PaymentStrategy payment = new CreditCardPayment();
        payment.pay(20);

        Order order = new BasicOrder();
        order = new GiftWrapDecorator(order);
        order = new ExpressDeliveryDecorator(order);
        System.out.println(order.getDescription());
        System.out.println(order.getCost());
    }
}