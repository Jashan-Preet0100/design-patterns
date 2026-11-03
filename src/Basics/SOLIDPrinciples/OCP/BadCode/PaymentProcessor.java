package Basics.SOLIDPrinciples.OCP.BadCode;

public class PaymentProcessor {

    /*In this Bad Code whenever you need to add any new Payment Method you will modify in processPayment method
    and this will violate OCR principle by modifying the existing code.
    OCR states that code should be open for extension and close for modification.
    * */
    public void processPayment(String paymentMethod, double amount){
        switch (paymentMethod) {
            case "CreditCard" -> System.out.println("Payment is done via Credit Card in Bad Code");
            case "DebitCard" -> System.out.println("Payment is done via Debit Card in Bad Code");
            case "PayPal" -> System.out.println("Payment is done via Paypal in Bad Code");
            default -> throw new IllegalArgumentException("Unsupported Payment Method");
        }
    }
}
