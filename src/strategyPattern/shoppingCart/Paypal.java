package strategyPattern.shoppingCart;

public class Paypal implements Payment{
    private String email;
    private String password;
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Paypal.");
    }
}
