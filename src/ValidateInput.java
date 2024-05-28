import java.util.Scanner;

public class ValidateInput {

    private ValidateInput (){}

    public static long longVal(Scanner sc) {
        long val = 0;
        while (true) {
            try {
                val = Long.parseLong(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Error try entering id again.");
            }
        }
        return val;
    }
}
