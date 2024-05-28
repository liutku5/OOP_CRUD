import java.util.ArrayList;
import java.util.Scanner;

public class Author {
    private static long idcount = 0;

    private String name;
    private String surname;
    private long id;

    public Author() {
        this.id = ++idcount;
    }

    public Author(String name, String surname, long id) {
        this.name = name;
        this.surname = surname;
        this.id = ++idcount;
    }

    public static void addAuthorInfo(ArrayList<Author> authorList, Scanner sc) {
        printAutor(authorList);
        Author author = new Author();
        System.out.println("Enter author name.");
        author.setName(sc.nextLine());
        System.out.println("Enter author surname.");
        author.setSurname(sc.nextLine());
        authorList.add(author);

        if (!authorList.contains(author.getName()) && !authorList.contains(author.getSurname())) {
            System.out.println("The author " + author.getName() + " " + author.getSurname() + " was added.");

        } else {
            System.out.println("The author already exists.");
        }
    }
    public static void printAuthor(ArrayList<Author> authorList) {

        for (Author author : authorList) {
            System.out.print("Name: " + author.getName() + ", surname: " + author.getSurname() + " id: " + author.getId());
        }
        System.out.println();

    }

    public static void changeAuthorInfo(ArrayList<Author> authorList, Scanner sc) {
        printAutor(authorList);

        System.out.println("Enter the id of the author info you wish to change.");
        long oldId = ValidateInput.longVal(sc);
        for (int i = 0; i < authorList.size(); i++) {
            Author author = authorList.get(i);
            if (author.getId() == oldId) {
                System.out.println("Enter new author name.");
                author.setName(sc.nextLine());
                System.out.println("Enter new author surname.");
                author.setSurname(sc.nextLine());
                System.out.println("The author was changed successfully.");
                break;
            } else {
                System.out.println("There is no such author in the list.");
            }

        }
    }

    public static void removeAuthor(ArrayList<Author> authorList, Scanner sc) {

        System.out.println("Enter the id of the author you wish to remove.");
        long oldId = ValidateInput.longVal(sc);
        sc.nextLine();
        for (int i = 0; i < authorList.size(); i++) {
            Author author = authorList.get(i);
            if (author.getId() == oldId) {
                authorList.remove(i);
                System.out.println("The author with id " + oldId + " was removed.");
            }
        }
        System.out.println("There is no such author with in the list.");
    }

    public static int intInput(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (Exception e) {
                System.out.println("Plese enter a digit");
                sc.nextLine();
            }
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author: " + " name: " + name + '\'' + ", surname: " + surname + '\'' + ", id: " + id + ' ';
    }
}

