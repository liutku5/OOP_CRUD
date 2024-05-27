import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Autor> autorList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            Autor.printInfoMessege();
            int autor = Autor.intInput(sc);
            sc.nextLine();
            while (true) {
                switch (autor) {
                    case 1:
                        Autor.addAutorInfo(autorList, sc);
                        break;
                    case 2:
                        Autor.printAutor(autorList);
                        break;
                    case 3:
                        Autor.changeAutorInfo(autorList, sc);
                        break;
                    case 4:
                        Autor.removeAutor(autorList, sc);
                        break;
                    case 5:
                        System.exit(1);
                }
            }

        }
    }
}