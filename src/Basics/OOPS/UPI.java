package Basics.OOPS;

public class UPI implements PaymentMethod{

    String upiId;

    public UPI(String upiId){
        this.upiId = upiId;
    }


    @Override
    public void pay() {
        System.out.println("Making Payment via UPI for id "+upiId);
    }
}
