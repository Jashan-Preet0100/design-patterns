package Basics.SOLIDPrinciples.SRP.GoodCode;

public class SendEmailNotification {

    public void sendEmailToUser(String userName, Invoice invoice){
        System.out.println("Invoice email notification genrated for user "+userName+" of amount: "+invoice.amount);
    }
}
