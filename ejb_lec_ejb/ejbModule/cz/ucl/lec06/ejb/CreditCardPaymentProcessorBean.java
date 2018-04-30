package cz.ucl.lec06.ejb;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

@Stateless
public class CreditCardPaymentProcessorBean implements CreditCardPaymentProcessor {

	@PostConstruct
	public void init() {
		int a = 7; //initialization would happen here
	}

	@Override
	public String processPayment(Double ticketPrice, String customerName,
			String creditCardNumber, String creditCardValidity)
			throws PaymentFailedException {	
		return "PMTN" + (new Random()).nextInt();
	}
	
}
