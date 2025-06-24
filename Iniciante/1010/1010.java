import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int cod1 = read.nextInt();
        int prod1 = read.nextInt();
        double price1 = read.nextDouble();

        int cod2 = read.nextInt();
        int prod2 = read.nextInt();
        double price2 = read.nextDouble();

        double total = prod1 * price1 + prod2 * price2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
