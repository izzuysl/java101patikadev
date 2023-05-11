import java.util.Scanner;
public class kilo {
    public static void main(String[] args) {
        double boy;
        int kilo;
        double kitle;
        Scanner indeks = new Scanner(System.in);
        System.out.print("boyunuzu giriniz:");
        boy = indeks.nextDouble();
        System.out.print("kilonu giriniz:");
        kilo = indeks.nextInt();
        kitle = kilo / boy * boy;
        System.out.print("vücut kitle endeksiniz:"+ kitle);
