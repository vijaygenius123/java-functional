package Consumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        helloName("Vijay", "S", System.out::println);

        hello("Vijay", () -> System.out.println("Hello World"));

    }

    static void helloName(String firstName, String lastName, Consumer<String> callback){
        // System.out.println(firstName);
        // System.out.println(lastName);
        callback.accept(firstName + " " + lastName);
    }

    static void hello(String firstName, Runnable runnable){
        System.out.println(firstName);
        runnable.run();
    }
}
