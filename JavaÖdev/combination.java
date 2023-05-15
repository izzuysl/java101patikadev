import java.util.Scanner;
public class kombi {
    public static void main(String[] args) {
        int n;
        int r;
        int cikarma;
        int nfak = 1, rfak = 1 , cfak = 1;
        int kombinasyon;
        Scanner inp = new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        n = inp.nextInt();
        System.out.print("bir sayı giriniz:");
        r = inp.nextInt();
        cikarma = n-r;

        for(int i =1; i<=n;i++){
            nfak = nfak*i;
        }
        for(int i =1; i<= r;i++){
            rfak = rfak*i;
        }
        for(int i = 1; i<=cikarma;i++){
            cfak = cfak*i;
        }
        kombinasyon = nfak/(rfak*cfak);
        System.out.print("kombinasyon"+ kombinasyon);
    }
}
