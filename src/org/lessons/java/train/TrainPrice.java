package org.lessons.java.train;

import java.util.Scanner;

public class TrainPrice {

	public static void main(String[] args) {
		
		float unitPrice = 0.21f; //prezzo unitario al km
		float underageDiscount = 0.20f;
		float overageDiscount = 0.40f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BENVENUTO SU TRAIN TICKET PRICE CALCULATOR");
		
		System.out.print("Inserisci i KM che intendi percorrere: ");
		int km = sc.nextInt();
		
		System.out.print("Inserisci la tua età: ");
		int age = sc.nextInt();
		
		sc.close();
		
		float price = km * unitPrice;
		
		if (age < 18) {
			price *= (1 - underageDiscount);
		} 
		
		if (age > 64) {
			price *= (1 - overageDiscount);
		}
		
		System.out.println("Il prezzo del tuo biglietto sarà di €" + String.format("%.02f", price));
	}

}
