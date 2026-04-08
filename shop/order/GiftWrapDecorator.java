package shop.order;

public class GiftWrapDecorator extends OrderDecorator{
    public GiftWrapDecorator(Order order){
        super(order);
    }

    public String getDescription(){
        return super.getDescription() + " + Gift Wrap";
    }

    public double getCost(){
        return super.getCost() + 5.0;
    }
}
