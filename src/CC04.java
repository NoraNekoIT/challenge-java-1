import java.util.Scanner;

public class CC04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        System.out.println("masukkan 2 integer");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
//        int temp = n1;
//        n1 = n2;
//        n2 = temp;
//        System.out.println("n1 = " + n1+ "n2 = "+n2);
        n1 = n1 + n2 ;
        n2 = n1 - n2;
        n1 = n1 - n2 ;
        System.out.println("n1= " + n1 + "n2" + n2);


    }
}
