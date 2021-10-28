import java.util.Scanner;

public class CC10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x1, y1 ,y2,x2;
        System.out.println("x1=");
        x1 = scanner.nextFloat();
        System.out.println("y1=");
        y1 = scanner.nextFloat();
        System.out.println("x2");
        x2 = scanner.nextFloat();
        System.out.println("y2");
        y2 = scanner.nextFloat();
        float side1 = x2 - x1;
        float side2 = y2 - y1;
        double distance = Math.sqrt(side1*side2 + side2*side2);
        System.out.printf("%.3f", distance);
    }
}
