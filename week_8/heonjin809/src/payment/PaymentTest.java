package payment;

public class PaymentTest{
    public static void main(String[] args) {
        Payment payment = new CreditCard();
        payment.pay(123.32);
    }
}
