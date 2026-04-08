package shop.product.factory;
import shop.product.Book;
import shop.product.Product;

public class BookFactory extends ProductFactory{
    private String name, author;
    private double price;

    public BookFactory(String name, double price, String author){
        this.name=name;
        this.price=price;
        this.author=author;
    }

    @Override
    public Product createProduct() {
        return new Book(name,price,author);
    }
}
