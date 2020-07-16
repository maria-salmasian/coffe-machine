import java.util.Scanner;

public class EnoughCoffee {
    public static void main(String[] args) {
        int water = 200;
        int milk = 50;
        int coffeeBeans = 15;
        System.out.println("Hi! I will tell you how many cups of coffee can I make, if you answer these questions");
        System.out.println("how much water do I have?");
        Scanner enter = new Scanner(System.in);
        int myWater = enter.nextInt();
        System.out.println("how much milk do I have?");
        int myMilk = enter.nextInt();
        System.out.println("how many grams of coffee beans do I have?");
        int myCoffeeBeans = enter.nextInt();
        System.out.println("How many cups of coffee do you want?");
        int cups = enter.nextInt();
        int enoughWater = myWater / water;
        int enoughMilk = myMilk / milk;
        int enoughCoffeeBeans = myCoffeeBeans / coffeeBeans;
        int smallest;
        if (enoughWater <= enoughCoffeeBeans && enoughWater <= enoughMilk) {
            smallest = enoughWater;
        }
        else if (enoughCoffeeBeans <= enoughMilk && enoughCoffeeBeans <= enoughWater) {
            smallest = enoughCoffeeBeans;
        }
        else {
            smallest = enoughMilk;
        }
         if( cups == smallest ) {
             System.out.println("Yes I will make you " +cups + " number of cups of coffee");
         }
         else if (cups < smallest ){
             int more = smallest - cups;
             System.out.println(" yes! I can make you even " + more + " more if you want");
         }
         else if (cups > smallest){
             System.out.println("No I cannot make you that many cups of coffee I can only make " + smallest +" cups");
         }

    }
}
