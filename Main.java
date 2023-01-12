import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy;
        int kilo;
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen boyunuzu(m) giriniz:");
        boy=input.nextDouble();
        System.out.print("Lütfen Kilonuzu giriniz:");
        kilo=input.nextInt();

        double Vki=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz:"+Vki);
    }
}