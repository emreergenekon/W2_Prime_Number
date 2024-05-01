import java.util.Scanner;

public class Main {

    // Method to check prime number recursively
    static boolean asalMi(int n, int i) {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        // Recursive call to check divisibility up to square root of n
        return asalMi(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi < 2) {
            System.out.println(sayi + " sayısı ASAL değildir!");
        } else if (asalMi(sayi, 2)) {
            System.out.println(sayi + " sayısı ASALDIR!");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir!");
        }
    }
}