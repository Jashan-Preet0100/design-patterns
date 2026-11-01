package Basics.OOPS;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {

    // Using in memory data with HashMap
    Map<String, PaymentMethod> paymentMethodMap;

    PaymentService(){
        paymentMethodMap = new HashMap<>();
    }

    // Add Payment Method
    public void addPaymentMethod(String name, PaymentMethod paymentMethod){
        paymentMethodMap.put(name, paymentMethod);
    }

    // Make Payment Method
    public void makePayment(String name){
        PaymentMethod paymentMethod = paymentMethodMap.get(name);
        paymentMethod.pay();
    }
}
