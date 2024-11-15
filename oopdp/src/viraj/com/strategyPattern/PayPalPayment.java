package viraj.com.strategyPattern;

// Concrete Strategy 1: PayPal
class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal (Email: " + email + ").");
    }
}
