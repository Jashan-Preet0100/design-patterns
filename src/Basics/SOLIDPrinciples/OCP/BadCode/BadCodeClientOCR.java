package Basics.SOLIDPrinciples.OCP.BadCode;

public class BadCodeClientOCR {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("CreditCard", 100.01);
        paymentProcessor.processPayment("DebitCard", 500.01);
        paymentProcessor.processPayment("UPI", 1000.01);
    }
}
