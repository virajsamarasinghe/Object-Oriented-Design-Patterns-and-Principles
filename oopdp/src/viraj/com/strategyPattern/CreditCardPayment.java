package viraj.com.strategyPattern;

// Concrete Strategy 2: Credit Card
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card (Card Number: " + cardNumber + ").");
    }
}
