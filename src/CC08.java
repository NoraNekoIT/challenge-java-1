import java.util.Scanner;

public class CC08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,n2, n3 ;
        System.out.println("masukkan 3 integer : ");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();

        int min = n1<n2 && n1<n3 ? n1 : n2<n1 && n2<n3? n2 : n3;
        int max = n1>n2 && n1>n3 ? n1 : n2>n1 && n2>n3? n2 : n3 ;
        int sc = n1>n2&&n1>n3 ? n2>n3?n2:n3 : n2>n1&&n2>n3 ? n1>n3?n1:n3 : n1>n2?n1:n2 ;
//        n1 = min;
//        n2 = sc;
//        n3 = max;
        System.out.println(" n1= " + min + " n2 = " + sc + " n3= " + max );
    }
}
