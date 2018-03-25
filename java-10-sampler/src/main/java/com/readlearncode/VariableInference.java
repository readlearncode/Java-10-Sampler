package com.readlearncode;

import java.awt.print.Book;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class VariableInference {


    public static void main(String... args) throws IOException {

        // Simple inference from type
        var value = 1;
        System.out.print(value);

        // Inference from return type
        var name = getName();
        System.out.print(name);

        // Infer type from parameterised type
        var books = new ArrayList<Book>();

        // Use var with loops
        for (var book : books) {
            System.out.print(book.getNumberOfPages());
        }
        for (var i = 0; i < 10; i++) {
            System.out.print(i);
        }

        // Example use
        {
            String message = "Incy wincy spider...";
            StringReader reader = new StringReader(message);
            StreamTokenizer tokenizer = new StreamTokenizer(reader);
        }

        {
            var message = "Incy wincy spider...";
            var reader = new StringReader(message);
            var tokenizer = new StreamTokenizer(reader);
        }


        // Illegal or impractical use

        // Lambdas must always declare an explicit type
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        //var add = (x, y) -> x + y;
        String message = "May the force be with you";
        Function<String, String> quotify = m -> "'" + message + "'";
        // var quotify = m -> "'" + message + "'";

        // Diamond Operator
        List<Book> myBooks = new ArrayList<>();
        var myFavBooks = new ArrayList<String>(); // myFavBooks<Object>

    }

    static String getName() {
        return "Alex";
    }
}