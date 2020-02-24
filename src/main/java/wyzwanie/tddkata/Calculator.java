package wyzwanie.tddkata;

import java.util.Scanner;
import java.util.stream.Stream;

public class Calculator {

    public Integer add(String input) {

        if (input.isEmpty()) {
            return 0;
        }
        Integer firstValue = 0;
        Integer secondValue = 0;

        String[] arguments = input.split(",");

        if (arguments.length >= 1) {
            firstValue = Integer.parseInt(arguments[0]);
        }
        if (arguments.length == 2) {
            secondValue = Integer.parseInt(arguments[1]);
        }
        System.out.println(arguments.length);
        return firstValue + secondValue;

    }


    //Do not modify code below this line. This is just a runner

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter calculation. Ctrl+d for exit.");

        Calculator calculator = new Calculator();
        System.out.print("> ");
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            System.out.println(input + " ==> " + calculator.add(input));

            System.out.print("> ");
        }

    }
}
