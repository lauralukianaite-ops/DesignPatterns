package shop.order;

public class BasicOrder implements Order{
    @Override
    public String getDescription(){
        return "Basic order";
    }

    @Override
    public double getCost(){
        return 10.0;
    }
}
