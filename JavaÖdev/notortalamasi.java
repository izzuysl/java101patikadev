package Pratik;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        double matematikNot,fizikNot, kimyaNot, turkceNot, tarihNot, muzikNot, ortalama;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz:");
        matematikNot=scanner.nextDouble();
        System.out.println("Fizik Notunuzu Giriniz:");
        fizikNot=scanner.nextDouble();
        System.out.println("Kimya Notunuzu Giriniz:");
        kimyaNot=scanner.nextDouble();
        System.out.println("Türkçe Notunuzu Giriniz:");
        turkceNot=scanner.nextDouble();
        System.out.println("Tarih Notunuzu Giriniz:");
        tarihNot=scanner.nextDouble();
        System.out.println("Müzik Notunuzu Giriniz:");
        muzikNot=scanner.nextDouble();
        ortalama=(matematikNot+fizikNot+kimyaNot+turkceNot+tarihNot+muzikNot)/6.0;
        System.out.println("Ortalama:"+ortalama);
        String sonuc=(ortalama>=60)?"Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println("Sonuç:"+sonuc);
    }
}
