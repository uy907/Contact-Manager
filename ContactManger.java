 import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager manager = new ContactManager();
        String command;

        System.out.println("Welcome to Contact Manager!");

        while (true) {
            System.out.println("\nChoose an option: add | delete | list | exit");
            command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "add":
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    manager.addContact(name, phone, email);
                    break;
                      case "delete":
                System.out.print("Name to delete: ");
                String nameToDelete = scanner.nextLine();
                manager.deleteContact(nameToDelete);
                break;

                case "list":
                    manager.listContacts();
                    break;

                case "exit":
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}




