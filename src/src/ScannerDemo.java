import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an int: ");
        int myInt = scanner.nextInt();
        System.out.println("You entered: " + myInt);

        System.out.println("Enter a float: ");
        float myFloat = scanner.nextFloat();
        System.out.println("You entered: " + myFloat);

        System.out.println("Enter a char: ");
        char myChar = scanner.next().charAt(0);
        System.out.println("You entered: " + myChar);



    }
}
