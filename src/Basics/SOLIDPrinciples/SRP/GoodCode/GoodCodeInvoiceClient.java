package Basics.SOLIDPrinciples.SRP.GoodCode;

public class GoodCodeInvoiceClient {

    public static void main(String[] args) {
        Invoice invoice = new Invoice(100.01);
        invoice.genrateInvoice();
        SaveInvoiceInDb saveInvoiceInDb = new SaveInvoiceInDb();
        saveInvoiceInDb.saveInvoice(invoice);
        SendEmailNotification sendEmailNotification = new SendEmailNotification();
        sendEmailNotification.sendEmailToUser("Jashanpriit Siingh", invoice);
    }
}
