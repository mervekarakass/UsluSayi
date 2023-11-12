package UsluSayi;

import java.util.Scanner;

public class UsluSayi {

	public static void main(String[] args) {
		int taban, us;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Taban olacak sayiyi giriniz: ");
		taban = scanner.nextInt();
		
		System.out.print("Us olacak sayiyi giriniz: ");
		us = scanner.nextInt();
		
		int sonuc = 1;

        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }

        System.out.println(taban + " üzeri " + us + " = " + sonuc);

	}

}
