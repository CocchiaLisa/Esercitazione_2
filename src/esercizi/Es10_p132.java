package esercizi;
//importo la classe Scanner per leggere l'input da tastiera
import java.util.Scanner;
/*
 * Scrivi un programma che legge quattro numeri da tastiera e li visualizza in ordine decrescente.
 * */

public class Es10_p132 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 

		int n1, n2, n3, n4;
		int primo, secondo, terzo, quarto;

		
		System.out.println("Inserisci il primo numero: ");
		n1 = in.nextInt();
		
		System.out.print("Inserisci il secondo numero: ");
        n2 = in.nextInt();
        
        System.out.print("Inserisci il terzo numero: ");
        n3 = in.nextInt();
        

        System.out.print("Inserisci il quarto numero: ");
        n4 = in.nextInt();
        
        // Trova il massimo tra i quattro numeri
        if (n1 >= n2 && n1 >= n3 && n1 >= n4) {
            primo = n1;
        } else if (n2 >= n1 && n2 >= n3 && n2 >= n4) {
            primo = n2;
        } else if (n3 >= n1 && n3 >= n2 && n3 >= n4) {
            primo = n3;
        } else {
            primo = n4;
        }

        // Trova il secondo più grande
        if ((n1 >= n2 && n1 >= n3 && n1 >= n4 && n1 != primo) || (n1 == primo && (n2 == n1 || n3 == n1 || n4 == n1))) {
            secondo = n1;
        } else if ((n2 >= n1 && n2 >= n3 && n2 >= n4 && n2 != primo)) {
            secondo = n2;
        } else if (n3 >= n1 && n3 >= n2 && n3 >= n4 && n3 != primo) {
            secondo = n3;
        } else {
            secondo = n4;
        }

        // Trova il terzo più grande
        if ((n1 >= n2 && n1 >= n3 && n1 >= n4 && n1 != primo && n1 != secondo)) {
            terzo = n1;
        } else if (n2 >= n1 && n2 >= n3 && n2 >= n4 && n2 != primo && n2 != secondo) {
            terzo = n2;
        } else if (n3 >= n1 && n3 >= n2 && n3 >= n4 && n3 != primo && n3 != secondo) {
            terzo = n3;
        } else {
            terzo = n4;
        }

        // L'ultimo sarà il più piccolo dei quattro
        if (n1 != primo && n1 != secondo && n1 != terzo) {
            quarto = n1;
        } else if (n2 != primo && n2 != secondo && n2 != terzo) {
            quarto = n2;
        } else if (n3 != primo && n3 != secondo && n3 != terzo) {
            quarto = n3;
        } else {
            quarto = n4;
        }
        
              
        
        System.out.println(" " + primo + " " + secondo + " " + terzo + " " + quarto);
        
        in.close();
        
		
	}

}
