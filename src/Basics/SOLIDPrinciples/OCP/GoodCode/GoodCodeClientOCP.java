package Basics.SOLIDPrinciples.OCP.GoodCode;

public class GoodCodeClientOCP {
    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        PaymentMethod creditCardMethod = new CreditCard();
        paymentProcessor.processPayment(creditCardMethod,100.01);
        PaymentMethod debitCardMethod = new DebitCard();
        paymentProcessor.processPayment(debitCardMethod,500.05);

        //Extending functionality with adding one more Payment method Adding one more method UPI
        // No existing code is touched in this UPI implementation
        paymentProcessor.processPayment(new UPI(),1000.01);
    }
}
