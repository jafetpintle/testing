package Payment;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}
