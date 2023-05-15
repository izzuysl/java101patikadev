import java.util.Scanner;

public class FindEvenNumbersUpToTheEnteredNumber {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        k = input.nextInt();

        for (i=0; i<=k; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
