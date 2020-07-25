import java.util.Scanner;

public class CoffeeDemo {
    public static void main(String[] args) {
        Coffee coffeeMachine = new Coffee();
        System.out.println("Hello! Welcome to the Coffee Machine!  PLease enter an instruction: take, fill, buy, remaining, exit");
        String input = coffeeMachine.enter.nextLine();
        coffeeMachine.instruction(input);

    }
}
