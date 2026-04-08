package shop.payment;

public class BankTransferPayment implements PaymentStrategy{
    @Override
    public void pay(double amount){
        System.out.println("Chosen payment method was bank transfer");
    }
}
