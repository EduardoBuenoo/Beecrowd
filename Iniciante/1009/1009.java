import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        String name = read.nextLine();

        double salary = read.nextDouble();
        double sales = read.nextDouble();

        double total = (0.15 * sales) + salary;
        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
