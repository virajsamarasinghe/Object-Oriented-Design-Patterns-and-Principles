package viraj.com.strategyPattern;

// Context
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Set the payment strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Perform payment
    public void checkout(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method before checkout.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}