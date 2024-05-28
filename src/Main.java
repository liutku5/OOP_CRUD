import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Author> autorList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            printInfoMessege();
            int autor = Author.intInput(sc);
            sc.nextLine();
            while (true) {
                switch (autor) {
                    case 1:
                        Author.addAuthorInfo(autorList, sc);
                        break;
                    case 2:
                        Author.printAuthor(autorList);
                        break;
                    case 3:
                        Author.changeAuthorInfo(autorList, sc);
                        break;
                    case 4:
                        Author.removeAuthor(autorList, sc);
                        break;
                    case 5:
                        System.exit(1);
                }
                break;
            }
        }
    }
    public static void printInfoMessege() {
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("1. Enter autor informacion");
        System.out.println("2. Show autor list");
        System.out.println("3. Edit autor informacion");
        System.out.println("4. Remove autor from the list");
        System.out.println("5. Close program");
        System.out.println("--------------------------");
        System.out.println();
    }
}