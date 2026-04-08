package shop.payment;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount){
        System.out.println("Chosen payment method was credit card");
    }
}
