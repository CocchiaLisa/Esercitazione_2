package esercizi;
//importo la classe Scanner per leggere l'input da tastiera
import java.util.Scanner;
/*
 * Scrivi un programma che legge quattro numeri da tastiera e li visualizza in ordine decrescente.
 * fhhjf
 * */

public class Es10_p132_ORD {//Verisione con ORDINAMENTO

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 

		int n1, n2, n3, n4, temp;
		// ordino i numeri man mano che li chiedo all'utente
		
		System.out.println("Inserisci il primo numero: ");
		n1 = in.nextInt();
		
		System.out.print("Inserisci il secondo numero: ");
        n2 = in.nextInt();
        
        if(n2 > n1) {
        	temp =  n1;
        	n1 = n2;
        	n2 = temp;
        }

        System.out.print("Inserisci il terzo numero: ");
        n3 = in.nextInt();
        
        if (n3 > n2) {
            temp = n3; n3 = n2; n2 = temp;
            if (n2 > n1) {
                temp = n2; n2 = n1; n1 = temp;
            }
        }

        System.out.print("Inserisci il quarto numero: ");
        n4 = in.nextInt();
        
        if (n4 > n3) {
            temp = n4; n4 = n3; n3 = temp;
            if (n3 > n2) {
                temp = n3; n3 = n2; n2 = temp;
                if (n2 > n1) {
                    temp = n2; n2 = n1; n1 = temp;
                }
            }
        }
        
        System.out.println(" " + n1 + " " + n2 + " " + n3 + " " + n4);
        
        in.close();
        
		
	}

}
