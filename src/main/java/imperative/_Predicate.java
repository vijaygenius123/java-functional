package imperative;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println("Normal Function");
        System.out.println(isPhoneNumberValid("07123456789"));
        System.out.println(isPhoneNumberValid("09123456789"));

        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07123456789"));
        System.out.println(isPhoneNumberValidPredicate.test("09123456789"));
    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;


}
