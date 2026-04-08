package shop;

public class Book extends Product{
    String author;

    public Book(String name, double price, String author){
        super(name,price);
        this.author = author;
    }

    @Override
    public void getInfo(){
        System.out.println("Author: " + author + ", name: " + name + ", price" + price);
    }
}
