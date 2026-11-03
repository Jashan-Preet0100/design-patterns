package Basics.SOLIDPrinciples.OCP.GoodCode;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Payment Via Credit Card in Good Code "+amount);
    }
}
