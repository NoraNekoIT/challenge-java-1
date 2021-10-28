import java.util.Scanner;

public class CC11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size ;
        System.out.println("masukkan size array : ");
        size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i=0 ; i<size; i++) {
            System.out.printf("index ke  %d :" , i);
            nums[i] = scanner.nextInt();
        }
        int sum = 0 ;
        for (int i= 0; i<size ; i++){
            sum = sum + nums[i];
        }
        System.out.println("SUM: " + sum);
    }
}
