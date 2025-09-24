import java.util.*;

public class ContactBookApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactBook book = new ContactBook();
        book.loadFromFile(); 

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Contact");
            System.out.println("2. Show Contacts");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Company or leave it: ");
                String company = sc.nextLine();

                System.out.print("Enter Title or leave it: ");
                String title = sc.nextLine();

                System.out.print("Enter Label for Phone 1 home/work/personal: ");
                String p1Label = sc.nextLine();
                System.out.print("Enter Phone 1 or leave it: ");
                String p1 = sc.nextLine();

                System.out.print("Enter Label for Phone 2 or leave it: ");
                String p2Label = sc.nextLine();
                System.out.print("Enter Phone 2 or leave it: ");
                String p2 = sc.nextLine();

                System.out.print("Enter Label for Phone 3 or leave it: ");
                String p3Label = sc.nextLine();
                System.out.print("Enter Phone 3 or leave it: ");
                String p3 = sc.nextLine();

                System.out.print("Enter Email or leave it: ");
                String email = sc.nextLine();

                Contact c = new Contact(name, company, title,
                                        p1Label, p1,
                                        p2Label, p2,
                                        p3Label, p3,
                                        email);
                book.addContact(c);
                System.out.println("Contact added.");
            }
            else if (choice == 2) {
                book.showContacts();
            }
            else if (choice == 3) {
                System.out.println("Closing Contact App.");
                break;
            }
            else {
                System.out.println("Wrong choice. Try again.");
            }
        }
        sc.close();
    }
}
