package esercizi;
//importo la classe Scanner per leggere l'input da tastiera
import java.util.Scanner;

/*
 * Es 2: Leggi un numero e scrivilo a video solo se tale numero è divisibile per 5.
 * */
public class Es2_p129 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Creo un oggetto Scanner per leggere i dati inseriti dall'utente
		
		// dichiarazione delle variabili
		int numero;
		
		System.out.print("Inserisci un numero: ");
        numero = in.nextInt();

        if (numero % 5 == 0) {
            System.out.println("Il numero inserito è divisibile per 5.");
        } else {
            System.out.println("Il numero inserito non è divisibile per 5.");
        }

        in.close(); // Chiude lo Scanner per liberare le risorse
 
	}

}
