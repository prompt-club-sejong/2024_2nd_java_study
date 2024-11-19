package payment;

public class CreditCard implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.println("You paid " + price + " by Credit Card.");
        return true;
    }
}
