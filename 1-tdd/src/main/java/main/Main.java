package main;

import fizzbuzz.PrintFizzBuzz;
import output.Terminal;

import java.util.List;

public class Main {

    public static void main(String [] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        PrintFizzBuzz printer = new PrintFizzBuzz(new Terminal());
        printer.printFizzBuzz(numbers);
    }


}
