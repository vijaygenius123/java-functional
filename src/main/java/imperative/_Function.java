package imperative;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int num = 1;
        int numByNormalFunc = increment(num);
        int numByNormalAfterMultiplyFunc = multiply(numByNormalFunc);
        System.out.println(numByNormalAfterMultiplyFunc);


        int numByFunc = incrementFunction.apply(num);
        int numByFuncAfterMultiplyFunc = multiplyFunction.apply(numByFunc);
        int numByCombinedFunc = incrementAndMultiplyFunction.apply(num);

        System.out.println(numByFuncAfterMultiplyFunc);
        System.out.println(numByCombinedFunc);


    }

    static Function<Integer, Integer>  incrementFunction = number -> number + 1;
    static Function<Integer, Integer>  multiplyFunction = number -> number * 10;
    static Function<Integer, Integer> incrementAndMultiplyFunction = incrementFunction.andThen(multiplyFunction);
    static int increment(int num){
        return num + 1;
    }
    static int multiply(int num){
        return num * 10;
    }

}
