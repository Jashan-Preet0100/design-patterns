package Basics.OOPS;

public class Wallet implements PaymentMethod{

    // Using default constructor

    @Override
    public void pay() {
        System.out.println("Making payment via Wallet");
    }
}
