package ninja.bladh;

import ninja.bladh.tools.MathTool;
import ninja.bladh.tools.StringTool;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String entered_name = scanner.next();
        String name = StringTool.beautify(entered_name);
        System.out.println("Hello " + name + "!");
        run(scanner);
        System.out.println("Good bye!");
    }

    /**
     * The previous engineer implemented this method to read
     * the users command and execute accordingly. However, he
     * never quite learned what a loop is...
     */
    public static void run(Scanner scanner) {
        System.out.println("Enter command (addition/subtraction/floor/ceiling/quit):");
        String command = scanner.next();
        if (StringTool.match(command, "addition")) {
            System.out.println("Operation chosen: Addition");
            System.out.println("Enter the first number:");
            String input1 = scanner.next();
            System.out.println("Enter the second number:");
            String input2 = scanner.next();
            int integer1 = StringTool.toInteger(input1);
            int integer2 = StringTool.toInteger(input2);
            int result = MathTool.addition(integer1,integer2);
            System.out.println("The result is " + result);
        } else if (StringTool.match(command, "subtraction")) {
            System.out.println("Operation chosen: Subtraction");
            System.out.println("Enter the first number:");
            String input1 = scanner.next();
            System.out.println("Enter the second number:");
            String input2 = scanner.next();
            int integer1 = StringTool.toInteger(input1);
            int integer2 = StringTool.toInteger(input2);
            int result = MathTool.subtraction(integer1, integer2);
            System.out.println("The result is " + result);
        } else if (StringTool.match(command, "floor")) {
            System.out.println("Operation chosen: Floor");
            System.out.println("Enter the first number:");
            String input1 = scanner.next();
            System.out.println("Enter the second number:");
            String input2 = scanner.next();
            int integer1 = StringTool.toInteger(input1);
            int integer2 = StringTool.toInteger(input2);
            int result = MathTool.floor(integer1, integer2);
            System.out.println("The result is " + result);
        } else if (StringTool.match(command, "ceiling")) {
            System.out.println("Operation chosen: Ceiling");
            System.out.println("Enter the first number:");
            String input1 = scanner.next();
            System.out.println("Enter the second number:");
            String input2 = scanner.next();
            int integer1 = StringTool.toInteger(input1);
            int integer2 = StringTool.toInteger(input2);
            int result = MathTool.ceiling(integer1, integer2);
            System.out.println("The result is " + result);
        } else if (StringTool.match(command, "quit")) {
            return;
        }
    }
}
