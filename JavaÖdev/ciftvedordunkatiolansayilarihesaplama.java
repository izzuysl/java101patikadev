import java.util.Scanner;
public class dorde {
    public static void main(String[] args) {
        int k;
        int summer = 0;
        Scanner girdi = new Scanner(System.in);
        do{
            System.out.print("sayı giriniz:");
            k = girdi.nextInt();
            if(k% 4 == 0){
                summer +=k;

            }
        }while(k%2 == 0);
               System.out.print("toplam"+ summer);
    }
}
