package Basics.OOPS;

public class PaymentClient {

    public static void main(String[] args){
        PaymentService paymentService = new PaymentService();
        // Add different payment methods
        paymentService.addPaymentMethod("JashanpriitCreditCard", new CreditCard("555", "Jashanpriit Siingh"));
        paymentService.addPaymentMethod("JashanpriitDebitCard", new DebitCard("111", "Jashanpriit Siingh"));
        paymentService.addPaymentMethod("JashanpriitUPI", new UPI("666"));
        paymentService.addPaymentMethod("JashanpriitWallet", new Wallet());


        // Make Payments using different Methods
        System.out.println("Start making Payment via different methods");
        paymentService.makePayment("JashanpriitCreditCard");
        paymentService.makePayment("JashanpriitDebitCard");
        paymentService.makePayment("JashanpriitUPI");
        paymentService.makePayment("JashanpriitWallet");
        System.out.println("Payemnt via all the methods are completedgiwhere ");
    }
}
