package util.function;

import org.omg.CORBA.INTERNAL;

import java.util.function.Function;

/**
 * Function:
 *
 * @version 1.0
 *          Date: 2016/6/6
 *          Time: 12:57
 * @author: XJ
 */
public class FunctionDemo {
    //API which accepts an implementation of

    //Function interface

    static void modifyTheValue(int valueToBeOperated, Function<Integer, Integer> function){

        int newValue = function.apply(valueToBeOperated);
        System.out.println(newValue);

        // 2-->2*2-->4+20
        Function<Integer, Integer> funCompose = e -> e * 2;
        newValue = function.compose(funCompose).apply(2);
        System.out.println(newValue);

        // 2-->2+20-->22*2
        Function<Integer, Integer> funAddThen = e -> e * 2;
        newValue = function.andThen(funAddThen).apply(2);
        System.out.println(newValue);
    }

    public static void main(String[] args) {

        int incr = 20;  int myNumber = 10;

        modifyTheValue(myNumber, val-> val + incr);

    }

}
