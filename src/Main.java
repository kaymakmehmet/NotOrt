import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // değişkenlerimizi tanımlama
        int mat,fizik,kimya,turkce,tarih,muzik;

        // scanner sınıfını tanımlama
        Scanner input = new Scanner(System.in);

        // kullanıcıdan değerleri alma

        System.out.print("Matematik Notunuzu Giriniz : " );
        mat = input.nextInt();
        System.out.print("Fizik Notunuzu Giriniz : " );
        fizik = input.nextInt();
        System.out.print("Kimya Notunuzu Giriniz : " );
        kimya = input.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz : " );
        turkce = input.nextInt();
        System.out.print("Tarih Notunuzu Giriniz : " );
        tarih = input.nextInt();
        System.out.print("Müzik Notunuzu Giriniz : " );
        muzik = input.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ort = (toplam/6);

        System.out.println("Not ortalamaniz  " + ort);

        String durum = (ort >= 60 )? "Sinifi gecti" : "Sinifta Kaldi";
        System.out.println(durum);



    }
}