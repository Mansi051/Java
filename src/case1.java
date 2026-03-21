
abstract class Payment {
    protected String transactionId;
    protected double amount;

    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }
    abstract void processPayment();
}
class CreditCardPayment extends Payment {

    public CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }
    @Override
    void processPayment() {
        double fee = amount * 0.02;
        double total = amount + fee;

        System.out.println("Credit Card Payment");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: " + amount);
        System.out.println("Fee (2%): " + fee);
        System.out.println("Total: " + total);
    }
}
class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(String transactionId, double amount, String upiId) {
        super(transactionId, amount);
        this.upiId = upiId;
    }

    @Override
    void processPayment() {
        System.out.println("UPI Payment");
        System.out.println("Transaction ID: " + transactionId);

        if (upiId.contains("@")) {
            System.out.println("UPI ID: " + upiId);
            System.out.println("Amount: " + amount);
            System.out.println("Payment Successful");
        } else {
            System.out.println("Invalid UPI ID. Payment Failed");
        }
    }
}
class PaymentProcessor {
    void pay(Payment p) {
        p.processPayment(); 
    }
}
public class case1 {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        Payment p1 = new CreditCardPayment("TXN101", 1000);
        Payment p2 = new UPIPayment("TXN102", 500, "user@upi");
        Payment p3 = new UPIPayment("TXN103", 700, "invalidupi");
        processor.pay(p1);
        processor.pay(p2);
        processor.pay(p3);
    }
}