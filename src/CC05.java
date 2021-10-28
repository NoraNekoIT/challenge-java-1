import java.util.Scanner;

public class CC05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,n2 ;
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        int min = n1 > n2 ? n2 : n1;
        int max = n1 > n2 ? n1 : n2;
        System.out.println(" MIN = " + min + " MAX= " +max);
    }
}
