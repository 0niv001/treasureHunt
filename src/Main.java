//Treasure Hunt - If else / Cases
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Treasure Island\nYour mission is to find the treasure");
        System.out.println("You are at a cross road, where would you like to go? left or right");

        String direction = scanner.nextLine().toLowerCase();

        if(direction.equals("left")){
            System.out.println("You've come to a lake. There is ran island in the middle of the lake.");
            System.out.println("Type wait to wait for a boat, or swim to swim across");
            String wait = scanner.nextLine().toLowerCase();
            if(wait.equals("wait")) {
                System.out.println("You arrive at the island unharmed. There is a house with three doors, red, yellow and blue. Which one do you choose");
                String colour = scanner.nextLine().toLowerCase();
                switch (colour) {
                    case "blue":
                        System.out.println("You fall in a well and drown");
                        break;
                    case "red":
                        System.out.println("There is a fire and you get burnt alive");
                        break;
                    case "yellow":
                        System.out.println("You found the treasure, you are rich");
                        break;
                    default:
                        System.out.println("That's not one of the options");
                }
            }
            else {
                System.out.println("You drown");
            }
        }
        else {
            System.out.println("You picked the wrong direction and die");
        }
        }
    }