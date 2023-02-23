package Payment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    PaymentGateway paymentGateway;
    PaymentProcessor paymentProcessor;
    @Before
    public void setUp(){
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void makePayment_correctPayment(){
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        Assert.assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void makePayment_wrongPayment(){
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        Assert.assertFalse(paymentProcessor.makePayment(1000));
    }

}