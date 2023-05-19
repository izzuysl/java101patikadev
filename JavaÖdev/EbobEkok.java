import java.util.Scanner;
public class ekok {
    public static void main(String[] args) {
        int n1,n2,ebob = 1,ekok= 1,i = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz:");
        n1 = inp.nextInt();
        System.out.print("n2 sayısını giriniz:");
        n2 = inp.nextInt();

        while(i<=n1){
            if(n1%i == 0 && n2%i == 0){
                ebob = i;
            }
            i++;
        }
        System.out.print("ebok:"+ ebob);

        while(i<= n1*n2){
            if(i%n1 == 0 && i%n2 == 0){
                ekok = i;
                break;
            }
            i++;
        }
        System.out.print("ekok:"+ ekok);
    }
}
