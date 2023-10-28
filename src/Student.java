import java.util.Scanner;

public class Student
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wypisz dane o studencie: ");

        System.out.println("Imie: ");
        String firstName = scanner.nextLine();
        System.out.println("Nazwisko: ");
        String lastname = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Nr_albumu: ");
        String studentId = scanner.nextLine();

        System.out.println("Imie: " + firstName);
        System.out.println("Nazwisko: " + lastname);
        System.out.println("Email: " + email);
        System.out.println("Nr_albumu: " + studentId);

        scanner.close();
    }
}
