package imperative;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        //Normal Java Function
        greetCustomer(new Customer("Vijay", "12345"));

        Customer jarvis = new Customer("Jarvis", "12345");

        // Consumer
        greetCustomerConsumer.accept(jarvis);

    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello, " + customer.name + " Your number is " + customer.number);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello, " + customer.name);
    }

    static class Customer {
        private final String name;
        private final String number;

        Customer(String name, String number) {
            this.name = name;
            this.number = number;
        }
    }
}
