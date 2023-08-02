package strategyPattern.shoppingCart;

import java.time.LocalDate;

public class CreditCard implements Payment{
    private String name;
    private String cardNumber;
    private String cvv;
    private LocalDate expiryDate;
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card.");
    }
}
