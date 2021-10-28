import java.util.Scanner;

public class CC06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3 ;
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        int min = n1<n2 && n1<n3 ? n1 : n2<n1&&n2<n3? n2 : n3;
        int max = n1>n2 && n1>n3 ? n1 : n2>n1 && n2>n3? n2 : n3 ;
        System.out.println("MIN = " + min + "MAX = " + max
        );
    }
}
