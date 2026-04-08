package shop.order;

public abstract class OrderDecorator implements Order{
    protected Order order;

    protected OrderDecorator(Order order){
        this.order=order;
    }

    public String getDescription(){
        return order.getDescription();
    }

    public double getCost(){
        return order.getCost();
    }
}
