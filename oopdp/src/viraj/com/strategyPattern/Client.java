package viraj.com.strategyPattern;

// Client
public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay using PayPal
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(100.0); // Output: Paid 100.0 using PayPal (Email: user@example.com).

        // Pay using Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        cart.checkout(250.0); // Output: Paid 250.0 using Credit Card (Card Number: 1234-5678-9876-5432).

        // Pay using Bitcoin
        cart.setPaymentStrategy(new BitcoinPayment("1A2b3C4d5E6f7G8h9I"));
        cart.checkout(500.0); // Output: Paid 500.0 using Bitcoin (Wallet Address: 1A2b3C4d5E6f7G8h9I).
    }
}