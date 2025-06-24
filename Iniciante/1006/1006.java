import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        double A = read.nextDouble();
        double B = read.nextDouble();
        double C = read.nextDouble();

        double media = (A * 2 + B * 3 + C * 5) / 10;

        System.out.printf("MEDIA = %.1f\n", media);
    }
}
