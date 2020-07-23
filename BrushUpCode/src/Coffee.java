import java.util.Scanner;

public class Coffee {
    private int coffeeBeans = 120;
    private int water = 400;
    private int milk = 540;
    private int cups = 9;
    private int dollar = 550;

    private int espressoWater = 250;
    private int espressoCoffee = 16;
    private int espressoMoney = 4;

    int latteWater = 350;
    int latteCoffee = 20;
    int latteMilk = 75;
    int latteMoney = 7;

    int cappuccinoWater = 200;
    int cappuccinoMilk = 100;
    int cappuccinoCoffee = 12;
    int cappuccinoMoney = 6;

    State coffeeMachineState = State.NONE;
    Scanner enter = new Scanner(System.in);


    /**
     * constructor
     */

    protected Coffee() {
    }

    /**
     * getters
     *
     * @return
     */
    private int getCoffeeBeans() {
        return coffeeBeans;
    }

    private int getCups() {
        return cups;
    }

    private int getDollar() {
        return dollar;
    }

    private int getMilk() {
        return milk;
    }

    private int getWater() {
        return water;
    }

    /**
     * setters
     *
     * @param coffeeBeans
     */
    private void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    private void setCups(int cups) {
        this.cups = cups;
    }

    private void setDollar(int dollar) {
        this.dollar = dollar;
    }

    private void setMilk(int milk) {
        this.milk = milk;
    }

    private void setWater(int water) {
        this.water = water;
    }


    /**
     * method that will be used in main (the only method), it contains methods fill take buy remaining in it
     *
     * @param input
     */
    public void instruction(String input) {
        this.coffeeMachineState = State.ACTION;
        String take = "take";
        String fill = "fill";
        String buy = "buy";
        String exit = "exit";
        String remaining = "remaining";
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
        this.coffeeMachineState = State.OFF;
        System.exit(0);
    }


    /**
     * method for instruction take
     *
     * @param dollar
     */
    private void take(int dollar) {
        System.out.println("I gave you " + dollar + "$");
        dollar -= dollar;
        setDollar(dollar);

    }


    /**
     * method for instruction fill
     *
     * @param water
     * @param milk
     * @param coffeeBeans
     * @param cups
     */
    private void fill(int water, int milk, int coffeeBeans, int cups) {
        this.coffeeMachineState = State.FILLING;
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


    /**
     * method for instruction buy, consists of three different methods to buy espresso latte and cappuccino
     *
     * @param dollar
     * @param water
     * @param milk
     * @param coffeeBeans
     * @param cups
     */
    private void buy(int dollar, int water, int milk, int coffeeBeans, int cups) {
        Scanner enter = new Scanner(System.in);
        System.out.println("What do you want to buy? 1) espresso 2) latte 3) cappuccino ? If mistaken you can go back by instruction  4) back");
        int choice = enter.nextInt();
        this.coffeeMachineState = State.MAKINGCOFFE;
        switch (choice) {
            case 1: {
                System.out.println("Good Choice! ");
                buyEspresso(dollar, water, milk, coffeeBeans, cups);
                break;
            }

            case 2: {
                System.out.println("Yummy Latte!");
                buyLatte(dollar, water, milk, coffeeBeans, cups);
                break;
            }

            case 3: {
                System.out.println("Great choice!");
                buyCappuccino(dollar, water, milk, coffeeBeans, cups);
                break;
            }
            case 4: {
                break;
            }
        }
    }


    /**
     * method for buying espresso(used in method buy)
     *
     * @param dollar
     * @param water
     * @param milk
     * @param coffeeBeans
     * @param cups
     */
    private void buyEspresso(int dollar, int water, int milk, int coffeeBeans, int cups) {
        enoughForEspresso();
        water -= espressoWater;
        setWater(water);
        coffeeBeans -= espressoCoffee;
        setCoffeeBeans(coffeeBeans);
        dollar += espressoMoney;
        setDollar(dollar);
        cups -= 1;
        setCups(cups);
    }


    /**
     * method for buying Latte(used in method buy)
     *
     * @param dollar
     * @param water
     * @param milk
     * @param coffeeBeans
     * @param cups
     */
    private void buyLatte(int dollar, int water, int milk, int coffeeBeans, int cups) {
        enoughForLatte();
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

    }


    /**
     * method for buying Cappuccino(used in method buy)
     *
     * @param dollar
     * @param water
     * @param milk
     * @param coffeeBeans
     * @param cups
     */
    private void buyCappuccino(int dollar, int water, int milk, int coffeeBeans, int cups) {
        enoughForCappuccino();
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

    }

    private void enoughForEspresso() {
        if (water >= espressoWater && coffeeBeans >= espressoCoffee && cups >= 1)
            System.out.println("I have enough ingredients to make your espresso! \n Here is your coffee");
        else {
            if (water < espressoWater)
                System.out.println("not enough water");
            else if (coffeeBeans < espressoCoffee)
                System.out.println("not enough coffee");
            else if (cups == 0)
                System.out.println("not enough cups");
        }
    }

    private void enoughForLatte() {
        if (water >= latteWater && coffeeBeans >= latteCoffee && cups >= 1 && milk >= latteMilk)
            System.out.println("I have enough ingredients to make your latte! \n Here is your coffee");
        else {
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

    private void enoughForCappuccino() {
        if (water >= cappuccinoWater && coffeeBeans >= cappuccinoCoffee && cups >= 1 && milk >= cappuccinoMilk)
            System.out.println("I have enough ingredients to make your cappuccino! \n Here is your coffee");
        else {
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


    /**
     * method for instruction remaining
     *
     * @param dollar
     * @param water
     * @param milk
     * @param coffeeBeans
     * @param cups
     */
    private void remaining(int dollar, int water, int milk, int coffeeBeans, int cups) {
        System.out.println("At this moment the coffee" +
                "machine has " + coffeeBeans + " grams of coffee beans, " + milk + " ml of milk, " + water +
                " ml of water, " + cups + " cups and " + dollar + "$  ");
    }


}




