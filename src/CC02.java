import java.util.Scanner;

public class CC02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("masukkan integer");
        num = scanner.nextInt();
        if (num%2==0){
            System.out.println("EVEN");
        }else if (num%2==1){
            System.out.println("ODD");
        }
    }
}
