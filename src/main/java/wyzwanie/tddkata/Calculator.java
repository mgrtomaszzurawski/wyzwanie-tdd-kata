package wyzwanie.tddkata;

import java.util.Scanner;
import java.util.stream.Stream;

public class Calculator {

    public Integer add(String input) {

        if (input.isEmpty()) {
            return 0;
        } else {
            String[] arguments = input.split(",");

            Integer sum = Integer.parseInt(arguments[0]);

            if (arguments.length == 2) {
                sum += Integer.parseInt(arguments[1]);
            }
            return sum;
        }


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
