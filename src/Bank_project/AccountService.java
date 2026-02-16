package Bank_project;

import java.util.Scanner;

public class AccountService {

    public void start(User user, Scanner sc, LoginService manager) {

        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Check Balance");
            System.out.println("4. Edit Profile");
            System.out.println("5. Change Password");
            System.out.println("6. Exit");
            System.out.print("Select: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    deposit(user, sc);
                    break;

                case 2:
                    withdraw(user, sc);
                    break;

                case 3:
                    System.out.println("Balance: " + user.getBalance());
                    break;

                case 4:
                    editProfile(user, sc);
                    manager.update();
                    break;

                case 5:
                    changePassword(user, sc);
                    manager.update();
                    break;

                case 6:
                    manager.update();
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Option");
            }

        } while (choice != 6);
    }

    private void deposit(User user, Scanner sc) {
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        user.setBalance(user.getBalance() + amt);
        System.out.println("Amount Added");
    }

    private void withdraw(User user, Scanner sc) {
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        if (amt <= user.getBalance()) {
            user.setBalance(user.getBalance() - amt);
            System.out.println("Amount Withdrawn");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    private void editProfile(User user, Scanner sc) {
        System.out.print("Enter new username: ");
        String name = sc.nextLine();
        user = new User(name, user.getPassword());
        System.out.println("Profile Updated");
    }

    private void changePassword(User user, Scanner sc) {
        System.out.print("Enter new password: ");
        String pass = sc.nextLine();
        user.setPassword(pass);
        System.out.println("Password Changed");
    }
}
