import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String questioning = "?";
        String yelling = "!";
        String nothing = " ";
        String period = ".";

        System.out.println("Say something to Bob");
        String userInput = scanner.nextLine();

        if (userInput.equals(questioning) ){
            System.out.println("Sure");
        } else if (userInput.equals(yelling) ){
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals(nothing) ){
            System.out.println("Fine. Be that way!");
        } else if (userInput.equals(period) ){
            System.out.println("Whatever");
        } else {
            System.out.println("Whatever");
        }



    }
}
