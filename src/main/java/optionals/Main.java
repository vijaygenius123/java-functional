package optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        String userName = (String) Optional
                .ofNullable(null)
                .orElseGet(() -> "Default Value");

        System.out.println(userName);

        Optional
                .ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending mail to " + email),
                        () -> System.out.println("Cannot send email")
                );
    }
}
