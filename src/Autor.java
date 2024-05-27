import java.util.ArrayList;
import java.util.Scanner;

public class Autor {
    private String name;
    private String surname;
    private long id;

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

    public static void printInfoMessege() {
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("1. Enter auter informacion");
        System.out.println("2. Show auter list");
        System.out.println("3. Edit auter informacion");
        System.out.println("4. Remove auter from the list");
        System.out.println("5. Close program");
        System.out.println("--------------------------");
        System.out.println();
    }

    public static void addAutorInfo(ArrayList<Autor> autorList, Scanner sc) {
        printAutor(autorList);
        Autor autor = new Autor();
        System.out.println("Enter autor name.");
        autor.setName(sc.nextLine());
        System.out.println("Enter autor surname.");
        autor.setSurname(sc.nextLine());
        System.out.println("Enter autor id.");
        autor.setId(sc.nextInt());

        if (!autorList.contains(autor.getName()) && !autorList.contains(autor.getSurname())) {
            System.out.println("The author " + autor.getName() + " " + autor.getSurname() + " was added.");
        } else {
            System.out.println("The author already exists.");
        }
        autorList.add(autor);
    }


    public static void printAutor(ArrayList<Autor> autorList) {
        System.out.println("Autor list: " + autorList);
    }



    public static void changeAutorInfo(ArrayList<Autor> autorList, Scanner sc) {
        printAutor(autorList);

        System.out.println("Enter the auter id you wish to change.");
        long oldId = sc.nextLong();
        sc.nextLine();
        for (int i = 0; i < autorList.size(); i++) {
            if (autorList.get(i).id = oldId) {
                System.out.println("Enter new auter name.");

            }
        }
    }


        public static void removeAutor (ArrayList < Autor > autorList, Scanner sc){
        }

        public static int intInput (Scanner sc){
            while (true) {
                try {
                    return sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Plese enter a digit");
                    sc.nextLine();
                }
            }
        }


    @Override
    public String toString() {
        return "Autor: " +
                " name: " + name + '\'' +
                ", surname: " + surname + '\'' +
                ", id: " + id +
                ' ';
    }
}

