import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, age, type;
        double price, iPrice, yPrice, yCut, gdCut, tTutar;

        System.out.print("Mesafeyi km turunden giriniz: ");
        km = input.nextInt();

        System.out.print("Yasinizi giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yon / 2 => Gidis Donus): ");
        type = input.nextInt();


        if ((km > 0 && age > 0) && (type >= 1 && type <= 2)) {
            if (type == 1) {
                if (age <= 12) {
                    price = km * 0.10;
                    yPrice = price * 0.50;
                    iPrice = price - yPrice;
                    System.out.println("Toplam Tutar: " + iPrice);
                } else if (age >= 12 && age <= 24) {
                    price = km * 0.10;
                    yPrice = price * 0.10;
                    iPrice = price - yPrice;
                    System.out.println("Toplam Tutar: " + iPrice);
                } else if (age >= 65) {
                    price = km * 0.10;
                    yPrice = price * 0.30;
                    iPrice = price - yPrice;
                    System.out.println("Toplam Tutar: " + iPrice);
                } else {
                    price = km * 0.10;
                    System.out.println("Toplam Tutar: " + price);
                }
            } else {
                if (age <= 12) {
                    price = km * 0.10;
                    yPrice = price * 0.50;
                    iPrice = price - yPrice;
                    gdCut = iPrice * 0.20;
                    tTutar = (iPrice - gdCut) * 2;
                    System.out.println("Toplam Tutar: " + tTutar);
                } else if (age >= 12 && age <= 24) {
                    price = km * 0.10;
                    yPrice = price * 0.10;
                    iPrice = price - yPrice;
                    gdCut = iPrice * 0.20;
                    tTutar = (iPrice - gdCut) * 2;
                    System.out.println("Toplam Tutar: " + tTutar);
                } else if (age >= 65) {
                    price = km * 0.10;
                    yPrice = price * 0.30;
                    iPrice = price - yPrice;
                    gdCut = iPrice * 0.20;
                    tTutar = (iPrice - gdCut) * 2;
                    System.out.println("Toplam Tutar: " + tTutar);
                } else {
                    price = km * 0.10;
                    yPrice = price;
                    iPrice = price - yPrice;
                    gdCut = iPrice * 0.20;
                    tTutar = (iPrice - gdCut) * 2;
                    System.out.println("Toplam Tutar: " + tTutar);
                }
            }
        } else {
            System.out.println("Hatali giris yaptiniz!");
        }
    }
}