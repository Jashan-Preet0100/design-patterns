package Basics.SOLIDPrinciples.SRP.BadCode;

public class Invoice {

    private double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    // Expected Functionality
    public void generateInvoice(){
        System.out.println("Generating invoice in Invoice class "+amount);
    }

    // Additional Functionalities Saving in DB, Sending Notification
    public void saveInvoiceToDb(){
        System.out.println("Saving into DB in Invoice class "+amount);
    }

    public void sendEmailNotification(){
        System.out.println("Sending notification to user in Invoice class");
    }

}
