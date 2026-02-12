package Bank_project;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Changed UserManager → LoginService
        LoginService service = new LoginService();

        System.out.println("Welcome to Simple Banking System");

        System.out.println("1. Existing User");
        System.out.println("2. New User");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();
        sc.nextLine();

        User currentUser = null;

        if (choice == 1) {
            currentUser = service.login(sc);
        }
        else if (choice == 2) {
            currentUser = service.register(sc);
        }

        if (currentUser != null) {

            AccountService acc = new AccountService();
            acc.start(currentUser, sc, service);

        } else {
            System.out.println("Login Failed");
        }

        sc.close();
    }
}
