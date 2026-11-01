package Basics.OOPS;

public class CreditCard extends Card{

    public CreditCard(String cardNo, String userName) {
        super(cardNo, userName);
    }

    @Override
    public void pay() {
        System.out.println("Made Payment via Credit Card for card number "+getCardNo()+" , user name "+getUserName());
    }
}
