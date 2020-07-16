import java.util.Scanner;

public class Action {
    public static void main(String[] args) {
        int coffeeBeans = 120;
        int water = 400;
        int milk = 540;
        int cups = 9;
        int dollar = 550;
        int espressoWater = 250;
        int espressoCoffee = 16;
        int espressoMoney = 4;
        int latteWater = 350;
        int latteCoffee = 20;
        int latteMilk = 75;
        int latteMoney = 7;
        int cappuccinoWater = 200;
        int cappuccinoMilk = 100;
        int cappuccinoCoffee = 12;
        int cappuccinoMoney = 6;
        String take = "take";
        String fill = "fill";
        String buy = "buy";


        System.out.println("Hello! At this moment the coffee" +
                "machine has " + coffeeBeans + " grams of coffee beans, " + milk + " ml of milk, " + water +
                " ml of water, " + cups + " cups and " + dollar + "$  " +
                " \n PLease enter an instruction: take, fill, buy");
        Scanner enter = new Scanner(System.in);
        String input = enter.nextLine();


        if (input.equalsIgnoreCase(take)) {
            dollar = dollar - dollar;
            System.out.println("At this moment the coffee" +
                    "machine has " + coffeeBeans + " grams of coffee beans, " + milk + " ml of milk, " + water +
                    " ml of water, " + cups + " cups and " + dollar + "$  ");
        } else if (input.equalsIgnoreCase(fill)) {
            System.out.println("Write how many ml of water do you want to add:");
            int addedWater = enter.nextInt();
            water += addedWater;
            System.out.println("Write how many ml of milk do you want to add:");
            int addedMilk = enter.nextInt();
            milk += addedMilk;
            System.out.println("Write how many grams of coffee beans do you want to add");
            int addedCoffee = enter.nextInt();
            coffeeBeans += addedCoffee;
            System.out.println("Write how many disposable cups of coffee do you want to add: ");
            int addedCups = enter.nextInt();
            cups += addedCups;

            System.out.println("At this moment the coffee" +
                    "machine has " + coffeeBeans + " grams of coffee beans, " + milk + " ml of milk, " + water +
                    " ml of water, " + cups + " cups and " + dollar + "$  ");
        } else if (input.equalsIgnoreCase(buy)) {
            System.out.println("What do you want to buy? 1) espresso 2) latte 3) cappuccino");
            int choice = enter.nextInt();
            System.out.println("Good Choice!");
            switch (choice) {
                case 1: {
                    water -= espressoWater;
                    coffeeBeans -= espressoCoffee;
                    dollar += espressoMoney;
                    cups -= 1;
                    System.out.println("At this moment the coffee" +
                            "machine has " + coffeeBeans + " grams of coffee beans, " + milk + " ml of milk, " + water +
                            " ml of water, " + cups + " cups and " + dollar + "$  ");
                    break;

                }

                case 2: {
                    water -= latteWater;
                    milk -= latteMilk;
                    coffeeBeans -= latteCoffee;
                    dollar += latteMoney;
                    cups -= 1;
                    System.out.println("At this moment the coffee" +
                            "machine has " + coffeeBeans + " grams of coffee beans, " + milk + " ml of milk, " + water +
                            " ml of water, " + cups + " cups and " + dollar + "$  ");
                    break;

                }

                case 3: {
                    water -= cappuccinoWater;
                    milk -= cappuccinoMilk;
                    coffeeBeans -= cappuccinoCoffee;
                    dollar += cappuccinoMoney;
                    cups -= 1;
                    System.out.println("At this moment the coffee" +
                            "machine has " + coffeeBeans + " grams of coffee beans, " + milk + " ml of milk, " + water +
                            " ml of water, " + cups + " cups and " + dollar + "$  ");
                    break;

                }


            }

        }
        else {

            System.out.println("Sorry! Wrong Input!");
        }

    }

}
