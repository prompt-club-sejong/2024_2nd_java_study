package payment;

public interface Payment {
    boolean pay(double price);
}

public class CreditCard implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.println("You paid " + price + " by Credit Card.");
        return true;
    }
}

public class TestMain{
    public static void main(String[] args) {
        Payment payment = new CreditCard();
        payment.pay(123.32);
        
    }
}