import java.util.Scanner;

public class sinifGecme {
    public static void main(String[] args) {
        double mat,turkce,fizik,kimya,muzik;
                Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");

        mat= inp.nextDouble();
        if (mat<0 || mat>100){
            System.out.println("Geçersiz not");
            System.out.println("Matematik notunuzu giriniz:");
            mat=inp.nextDouble();
        }
        System.out.print("Türkçe notunuzu giriniz:");
        turkce= inp.nextDouble();
        if (turkce<0 || turkce>100){
            System.out.println("Geçersiz not");
            System.out.println("Türkçe notunuzu giriniz:");
            turkce=inp.nextDouble();
        }
        System.out.print("Fizik notunuzu giriniz:");
        fizik= inp.nextDouble();
        if (fizik<0 || fizik>100){
            System.out.println("Geçersiz not");
            System.out.println("Fizik notunuzu giriniz:");
            fizik=inp.nextDouble();
        }
        System.out.print("Kimya notunuzu giriniz:");
        kimya= inp.nextDouble();
        if (kimya<0 || kimya>100){
            System.out.println("Geçersiz not");
            System.out.println("Kimya notunuzu giriniz:");
            kimya= inp.nextDouble();
        }
        System.out.print("Müzik notunuzu giriniz:");
        muzik= inp.nextDouble();
        if (muzik<0 || muzik>100){
            System.out.println("Geçersiz not");
            System.out.println("Müzik notunuzu giriniz:");
            muzik=inp.nextDouble();
        }
        double sonuc;
        sonuc= (mat+turkce+fizik+kimya+muzik)/5;
        if (sonuc<=55){
            System.out.println("Kaldınız!");}
        else if (sonuc>100){
            System.out.println("Geçersiz not girdiniz. Lütfen geçerli bir not girip tekrar hesaplayınız!");
        }
        else{ System.out.println("Geçtiniz!");}

        if (sonuc>=0&&sonuc<=100){
            System.out.println("Ortalamanız:"+ sonuc);}



    }
}
