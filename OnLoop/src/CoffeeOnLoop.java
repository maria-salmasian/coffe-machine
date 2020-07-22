import java.util.Scanner;

public class CoffeeOnLoop {
    private static int coffeeBeans = 120;
    private static int water = 400;
    private static int milk = 540;
    private static int cups = 9;
    private static int dollar = 550;

    public static void setCoffeeBeans(int coffeeBeans) {
        CoffeeOnLoop.coffeeBeans = coffeeBeans;
    }

    public static void setCups(int cups) {
        CoffeeOnLoop.cups = cups;
    }

    public static void setDollar(int dollar) {
        CoffeeOnLoop.dollar = dollar;
    }

    public static void setMilk(int milk) {
        CoffeeOnLoop.milk = milk;
    }

    public static void setWater(int water) {
        CoffeeOnLoop.water = water;
    }

    public static void main(String[] args) {
        String take = "take";
        String fill = "fill";
        String buy = "buy";
        String exit = "exit";
        String remaining = "remaining";
        Scanner enter = new Scanner(System.in);
        System.out.println("Hello! Welcome to the Coffee Machine!  PLease enter an instruction: take, fill, buy, remaining, exit");
        String input = enter.nextLine();

        while (!input.equalsIgnoreCase(exit)) {
            if (input.equalsIgnoreCase(take)) {
                take(dollar);
                System.out.println("PLease enter an instruction: take, fill, buy, remaining, exit");
                input = enter.nextLine();
            } else if (input.equalsIgnoreCase(fill)) {
                fill(water, milk, coffeeBeans, cups);
                System.out.println("PLease enter an instruction: take, fill, buy, remaining, exit");
                input = enter.nextLine();
            } else if (input.equalsIgnoreCase(buy)) {
                buy(dollar, water, milk, coffeeBeans, cups);
                System.out.println("PLease enter an instruction: take, fill, buy, remaining, exit");
                input = enter.nextLine();

            } else if (input.equalsIgnoreCase(remaining)) {
                remaining(dollar, water, milk, coffeeBeans, cups);
                System.out.println("PLease enter an instruction: take, fill, buy, remaining, exit");
                input = enter.nextLine();
            }
        }
        System.out.println("thank you for using our services!");
        System.exit(0);
    }


    public static void take(int dollar) {
        System.out.println("I gave you " + dollar + "$");
        dollar -= dollar;
        setDollar(dollar);

    }

    public static void fill(int water, int milk, int coffeeBeans, int cups) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        int addedWater = enter.nextInt();
        water += addedWater;
        setWater(water);
        System.out.println("Write how many ml of milk do you want to add:");
        int addedMilk = enter.nextInt();
        milk += addedMilk;
        setMilk(milk);
        System.out.println("Write how many grams of coffee beans do you want to add");
        int addedCoffee = enter.nextInt();
        coffeeBeans += addedCoffee;
        setCoffeeBeans(coffeeBeans);
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int addedCups = enter.nextInt();
        cups += addedCups;
        setCups(cups);

    }

    public static void buy(int dollar, int water, int milk, int coffeeBeans, int cups) {
        Scanner enter = new Scanner(System.in);
        System.out.println("What do you want to buy? 1) espresso 2) latte 3) cappuccino ? If mistaken you can go back by instruction  4) back");
        int choice = enter.nextInt();
        System.out.println("Good Choice!");
        switch (choice) {
            case 1: {
                buyEspresso(dollar, water, milk, coffeeBeans, cups);
                break;
            }

            case 2: {
                buyLatte(dollar, water, milk, coffeeBeans, cups);
                break;
            }

            case 3: {
                buyCappuccino(dollar, water, milk, coffeeBeans, cups);
                break;
            }
            case 4: {
                continue;
            }
        }
    }

    public static void buyEspresso(int dollar, int water, int milk, int coffeeBeans, int cups) {
        int espressoWater = 250;
        int espressoCoffee = 16;
        int espressoMoney = 4;
        if (water >= espressoWater && coffeeBeans >= espressoCoffee && cups >= 1) {
            System.out.println("I have enough ingredients to make your coffee! \n Here is your coffee");
            water -= espressoWater;
            setWater(water);
            coffeeBeans -= espressoCoffee;
            setCoffeeBeans(coffeeBeans);
            dollar += espressoMoney;
            setDollar(dollar);
            cups -= 1;
            setCups(cups);


        } else {
            if (water < espressoWater)
                System.out.println("not enough water");
            else if (coffeeBeans < espressoCoffee)
                System.out.println("not enough coffee");
            else if (cups == 0)
                System.out.println("not enough cups");
        }

    }

    public static void buyLatte(int dollar, int water, int milk, int coffeeBeans, int cups) {
        int latteWater = 350;
        int latteCoffee = 20;
        int latteMilk = 75;
        int latteMoney = 7;
        if (water >= latteWater && coffeeBeans >= latteCoffee && cups >= 1 && milk >= latteMilk) {
            System.out.println("I have enough ingredients to make your coffee! \n Here is your coffee");
            water -= latteWater;
            setWater(water);
            milk -= latteMilk;
            setMilk(milk);
            coffeeBeans -= latteCoffee;
            setCoffeeBeans(coffeeBeans);
            dollar += latteMoney;
            setDollar(dollar);
            cups -= 1;
            setCups(cups);
        } else {
            if (water < latteWater)
                System.out.println("not enough water");
            else if (coffeeBeans < latteCoffee)
                System.out.println("not enough coffee");
            else if (milk < latteMilk)
                System.out.println("not enough milk");
            else if (cups == 0)
                System.out.println("not enough cups");

        }
    }

    public static void buyCappuccino(int dollar, int water, int milk, int coffeeBeans, int cups) {
        int cappuccinoWater = 200;
        int cappuccinoMilk = 100;
        int cappuccinoCoffee = 12;
        int cappuccinoMoney = 6;
        if (water >= cappuccinoWater && coffeeBeans >= cappuccinoCoffee && cups >= 1 && milk >= cappuccinoMilk) {
            System.out.println("I have enough ingredients to make your coffee! \n Here is your coffee");
            water -= cappuccinoWater;
            setWater(water);
            milk -= cappuccinoMilk;
            setMilk(milk);
            coffeeBeans -= cappuccinoCoffee;
            setCoffeeBeans(coffeeBeans);
            dollar += cappuccinoMoney;
            setDollar(dollar);
            cups -= 1;
            setCups(cups);
        } else {
            if (water < cappuccinoWater)
                System.out.println("not enough water");
            else if (coffeeBeans < cappuccinoCoffee)
                System.out.println("not enough coffee");
            else if (milk < cappuccinoMilk)
                System.out.println("not enough milk");
            else if (cups == 0)
                System.out.println("not enough cups");

        }
    }

    public static void remaining(int dollar, int water, int milk, int coffeeBeans, int cups) {
        System.out.println("At this moment the coffee" +
                "machine has " + coffeeBeans + " grams of coffee beans, " + milk + " ml of milk, " + water +
                " ml of water, " + cups + " cups and " + dollar + "$  ");
    }

}
