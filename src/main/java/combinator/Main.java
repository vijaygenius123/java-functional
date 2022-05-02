package combinator;

import java.time.LocalDate;

import static combinator.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customerValid = new Customer(
                "Vijay",
                "vijay@gmail.com",
                "+0123456789",
                LocalDate.of(2000, 1, 1)
        );
        Customer customerInvalid = new Customer(
                "Vijay",
                "vijaygmail.com",
                "+0123456789",
                LocalDate.of(2000, 1, 1)
        );

        CustomerValidatorService customerValidatorService = new CustomerValidatorService();
        System.out.println(customerValidatorService.isValidCustomer(customerValid));
        System.out.println(customerValidatorService.isValidCustomer(customerInvalid));

        System.out.println(isEmailValid().and(isPhoneNumberValid()).and(isAnAdult()).apply(customerValid));
        System.out.println(isEmailValid().and(isPhoneNumberValid()).and(isAnAdult()).apply(customerInvalid));

    }
}
