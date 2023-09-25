package org.myapp.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Choose a payment strategy (Credit Card)
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-8765-4321", "John Doe");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);

        // Choose another payment strategy (PayPal)
        PaymentStrategy payPalPayment = new PayPalPayment("john@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(50);
    }
}
