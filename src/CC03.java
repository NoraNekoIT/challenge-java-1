import java.util.Scanner;

public class CC03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan r lingkaran");
        float radius = scanner.nextFloat();
        double area = 3.1416* radius* radius;
        System.out.printf("%.3f",area);
    }
}
