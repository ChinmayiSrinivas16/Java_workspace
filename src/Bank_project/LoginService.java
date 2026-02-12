package Bank_project;

import java.io.*;
import java.util.*;

public class LoginService {

    private final String FILE = "users.dat";
    private List<User> users;

    public LoginService() {
        users = loadUsers();
    }

    // Register New User
    public User register(Scanner sc) {

        System.out.print("Enter username: ");
        String name = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        User user = new User(name, pass);

        users.add(user);

        saveUsers();

        System.out.println("Registration Successful");

        return user;
    }

    // Login Existing User
    public User login(Scanner sc) {

        System.out.print("Enter username: ");
        String name = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        for (User u : users) {

            if (u.getUsername().equals(name)
                    && u.getPassword().equals(pass)) {

                System.out.println("Login Successful");
                return u;
            }
        }
        System.out.println("Wrong username or password");
        return null;
    }

    // Save users to file system
    public void update() {
        saveUsers();
    }

    private void saveUsers() {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream(FILE));

            oos.writeObject(users);

            oos.close();

        } catch (Exception e) {

            System.out.println("Error while saving users");
        }
    }

    private List<User> loadUsers() {

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream(FILE));

            List<User> list =
                    (List<User>) ois.readObject();

            ois.close();

            return list;

        } catch (Exception e) {

            return new ArrayList<>();
        }
    }
}
