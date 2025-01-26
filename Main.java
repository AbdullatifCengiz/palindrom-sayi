import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner latf=new Scanner(System.in);
        System.out.println("Palindrom olduğunu düşündüğünüz bir sayı giriniz");
        int sayi=latf.nextInt();
        int rsayi=sayi;
        int terssayi=0;
        while (sayi!=0) {
            int kalan = sayi % 10;
            terssayi = terssayi * 10 + kalan;
            sayi = sayi / 10;
        }
        if (rsayi==terssayi){
            System.out.println("Sayınız palindrom sayıdır");
        }
        else System.out.println("Sayınız palindrom değildir");
    }
}