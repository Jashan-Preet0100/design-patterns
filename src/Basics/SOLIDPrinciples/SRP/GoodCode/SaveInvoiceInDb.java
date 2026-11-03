package Basics.SOLIDPrinciples.SRP.GoodCode;

public class SaveInvoiceInDb {

    public void saveInvoice(Invoice invoice){
        System.out.println("Saving in DB in saveInvoiceInDb class good code "+invoice.amount);
    }
}
