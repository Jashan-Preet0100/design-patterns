package Basics.SOLIDPrinciples.SRP.BadCode;

public class BadCodeInvoiceClient {

    public static void main(String[] args) {
        Invoice invoice = new Invoice(100.01);
        invoice.generateInvoice();
        invoice.saveInvoiceToDb();
        invoice.sendEmailNotification();
    }
}
