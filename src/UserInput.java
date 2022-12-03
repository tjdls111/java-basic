import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("How old are you?");

        try {
            int age = Integer.parseInt(scanner.next());
            System.out.println(age);
        } catch (NumberFormatException e){
            System.out.println("Please write number");
        }

    }
}
