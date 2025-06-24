import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        int hours = read.nextInt();
        double valueHours = read.nextDouble();

        double salary = hours * valueHours;
        System.out.printf("NUMBER = %d\n", number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    }
}
