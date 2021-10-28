import java.util.Scanner;

public class CC09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Masukkan Tahun: ");
        year = scanner.nextInt();
        if (year%400==0){
            System.out.println(true);
        }else if (year%100==0){
            System.out.println(false);
        } else if (year%4==0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
