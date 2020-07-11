import java.util.Scanner;
public class CoffeeIngredients {
    public static void main(String[] args) {
        int water = 200;
        int milk = 50;
        int coffeeBeans = 15;
        System.out.println("Hello! Tell me how many cups of coffee do you need and I will tell you what ingredients I will need to make " +
                "them and how much");
        Scanner enter = new Scanner(System.in);
        int cups = enter.nextInt();
        System.out.println("To make " + cups + " numbers of coffee I will need " + (cups*water) + " ml of water and " +
                (cups*milk) + " ml of milk and " + (cups*coffeeBeans) + " grams of coffee beans!");

    }
}
