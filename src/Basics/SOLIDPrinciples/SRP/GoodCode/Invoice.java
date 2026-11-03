package Basics.SOLIDPrinciples.SRP.GoodCode;

public class Invoice {

    protected double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    public void genrateInvoice(){
        System.out.println("Generating invoice in Invoice class good code "+amount);
    }
}
