package shop.order;

public class ExpressDeliveryDecorator extends OrderDecorator{
    public ExpressDeliveryDecorator(Order order){
        super(order);
    }

    public String getDescription(){
        return super.getDescription() + " + Express Delivery";
    }

    public double getCost(){
        return super.getCost() + 7.0;
    }
}
