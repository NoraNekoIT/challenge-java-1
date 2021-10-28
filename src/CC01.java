import java.util.Scanner;

public class CC01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        System.out.println("masukkan 2 integer");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        int add = n1 + n2 ;
        int sub = n1-n2;
        int mul = n1* n2;
        int div = n1/n2;
        int mod = n1% n2;
        System.out.println(" ADD = " +add + " SUB = " +sub + " MUL = " + mul
        + " DIV = " +div + " MOD = " +mod
        );
    }
}
