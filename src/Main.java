import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declaring & initializing int count to 0
        int count = 0;
        // Creating array of type TradingCard called cards
        TradingCard[] cards = new TradingCard[10];
        int choice;
        Scanner keyboard = new Scanner(System.in);

        String name, rarity, energyType, cardClass;
        double price;
        int hitPoints;
        boolean golden;
        // Created boolean variable run initialized to true
        boolean run = true;

        // While loop with run as the condition
        while(run) {
            // Asking for Choice as an input of 1, 2, or 3
            System.out.println("\n~~~Welcome to Trading Card Central~~~");
            System.out.println("Enter (1) to enter a Pokemon card");
            System.out.println("Enter (2) to enter a Hearthstone card");
            System.out.println("Enter (3) to exit");
            choice = keyboard.nextInt();
            // Making a switch statement.
            switch (choice) {
                case 1: // Pokemon
                    // keyboard.nextLine();
                    System.out.print("What is card's name? ");
                    keyboard.nextLine();
                    name = keyboard.nextLine();
                    System.out.print("What is it's price?  $");
                    price = keyboard.nextDouble();
                    System.out.print("What is it's rarity? ");
                    keyboard.nextLine();
                    rarity = keyboard.nextLine();
                    System.out.print("Pokemon energy type? ");
                    energyType = keyboard.nextLine();
                    System.out.print("How many hit points? ");
                    hitPoints = keyboard.nextInt();
                    // Create new Pokemon object
                    // Add it to cards array
                    // Increase count
                    cards[count++] = new Pokemon(name, price, rarity, energyType, hitPoints);
                    break;
                case 2: // Hearthstone
                    System.out.print("What is card's name? ");
                    keyboard.nextLine();
                    name = keyboard.nextLine();
                    System.out.print("What is it's price?  $");
                    price = keyboard.nextDouble();
                    System.out.print("What is it's rarity? ");
                    keyboard.nextLine();
                    rarity = keyboard.nextLine();
                    System.out.print("Hearthstone class?   ");
                    cardClass = keyboard.nextLine();
                    System.out.print("Is it a golden card? ");
                    golden = keyboard.nextBoolean();
                    // Create new Hearthstone object
                    // Add it to cards array
                    // Increase count
                    cards[count++] = new Hearthstone(name, price, rarity, cardClass, golden);
                    break;
                case 3: // Exit
                    // Set run = false to exit while loop
                    run = false;
                    break;
                default: // everything else
                    System.out.println("Please enter a valid choice (1-3).");
            }
        }
        // Calling printCards
        printCards(cards, count);

        // Calling averagePrice
        double averagePrice = averagePrice(cards, count);
        // Getting currency format in main
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        // Printing Average price
        System.out.println("Average card price = " + currency.format(averagePrice));
        // Exit message
        System.out.println("Hope we 'trade' again in a future CS course together soon!");
    }

    // Create averagePrice method
    public static double averagePrice(TradingCard[] cards, int count) {
        // Add the prices of each beverage up
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += cards[i].getPrice();
        }
        // Divide by the count
        return total/count;
    }

    public static void printCards(TradingCard[] cards, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(cards[i]);
        }
    }
}