import java.io.*;
import java.util.*;

public class ContactBook {
    ArrayList<Contact> contacts = new ArrayList<>();
    String fileName = "contacts.txt";

    public void addContact(Contact c) {
        contacts.add(c);
        saveToFile();
    }

    public void showContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println("\nContact " + (i + 1) + ":");
                System.out.println(contacts.get(i));
            }
        }
    }

    public void saveToFile() {
        try {
            PrintWriter out = new PrintWriter(new FileWriter(fileName));
            for (Contact c : contacts) {
                out.println(c.toString());
                out.println("------");
            }
            out.close();
        } catch (Exception e) {
            System.out.println("Could not save contacts.");
        }
    }


    public void loadFromFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                // Just printing old saved contacts for now
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("No saved contacts found.");
        }
    }
}

