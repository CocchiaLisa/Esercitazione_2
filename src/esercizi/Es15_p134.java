package esercizi;
//importo la classe Scanner per leggere l'input da tastiera
import java.util.Scanner;
/*
 *  Scrivi un programma che legge in input il valore di due lati di un quadrilatero, 
 *  individua se si tratta di un quadrato o di un rettangolo e 
 *  ne calcola il perimetro e l’area.
 * 
 *  */

public class Es15_p134 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		int lato1, lato2; 

		// Richiede all'utente di inserire le lunghezze dei due lati del quadrilatero
        System.out.print("Inserisci la lunghezza del primo lato: ");
        lato1 = in.nextInt();

        System.out.print("Inserisci la lunghezza del secondo lato: ");
        lato2 = in.nextInt();

        // Verifica se il quadrilatero è un quadrato o un rettangolo
        if (lato1 == lato2) {
            System.out.println("Il quadrilatero è un quadrato.");
        } else {
            System.out.println("Il quadrilatero è un rettangolo.");
        }

        // Calcola il perimetro e l'area
        int perimetro = 2 * (lato1 + lato2);  // Perimetro = somma di tutti i lati
        int area = lato1 * lato2;  // Area = base * altezza

        // Stampa il perimetro e l'area
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
		
        in.close();
	}

}
