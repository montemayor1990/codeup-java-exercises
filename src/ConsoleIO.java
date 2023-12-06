import java.util.Scanner;
public class ConsoleIO {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);


        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter phone digits only");
//        int userNum = scanner.nextInt();

//
//        System.out.println("please enter three words seperated by spaces");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        System.out.printf("your three words are %s, %s, and %s", word1, word2, word3);

//        System.out.println("enter a sentence");
//        String sentence = scanner.nextLine();
//        System.out.printf("your sentence is %s", sentence);
//        System.out.println("enter the length and width of the classroom as numbers seperated by space");
        String length = scanner.nextLine();

        System.out.println("enter the width of the classroom");
        String width = scanner.nextLine();

        int lengthInt = Integer.parseInt(length);
        int widthInt = Integer.parseInt(width);

        System.out.printf("length: %s%nWidth: %s",lengthInt, widthInt);

        double area = lengthInt * widthInt;
        double perimeter = (lengthInt * 2) + (widthInt * 2);
        System.out.printf("the area of the classroom is %s%nthe perimeter of the classroom is %s", area, perimeter);
    }

}
