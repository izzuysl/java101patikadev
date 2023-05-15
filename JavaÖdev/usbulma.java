import java.util.Scanner;
public class usal {
    public static void main(String[] args) {
        int n;
        int k;
        int total = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        n = inp.nextInt();
        System.out.print("üs olacak sayi:");
        k = inp.nextInt();

        for(int i = 1; i <= k;i++){
            total = total*n;
        }
        System.out.print(total);
    }
}
