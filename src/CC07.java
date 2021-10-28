import java.util.Scanner;

public class CC07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3;
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();

        int sc = n1>n2&&n1>n3 ? n2>n3?n2:n3 : n2>n1&&n2>n3 ? n1>n3?n1:n3 : n1>n2?n1:n2 ;
        System.out.println("terbesar kedua = " + sc);
    }
}
