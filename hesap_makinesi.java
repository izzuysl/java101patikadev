import java.util.Scanner;
public class hesapmakinesi {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz:");
        n1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        n2 = input.nextInt();
        System.out.print("1- toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("seçiminiz:");
        select = input.nextInt();
        System.out.print(select);

        switch(select){
            case 1:
                System.out.print("toplama:" + (n1+n2));
              break;
            case 2:
                System.out.print("çıkarma" + (n1-n2));
                break;
            case 3:
                System.out.print("çarpma"+ (n1*n2));
                break;
            case 4:
                System.out.print("bölme"+ (n1/n2));
                break;
            default:
                System.out.print("hatalı giriş yaptınız");



        }


    }
}
