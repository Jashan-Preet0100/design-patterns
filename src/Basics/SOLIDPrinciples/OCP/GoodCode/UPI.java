package Basics.SOLIDPrinciples.OCP.GoodCode;

public class UPI implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Making Payment via UPI "+amount);
    }
}
