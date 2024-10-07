package esercizi;
//importo la classe Scanner per leggere l'input da tastiera
import java.util.Scanner;
/*
 * Un supermercato applica uno sconto del 20% sull’importo che supera i 100 euro: 
 * scrivi un programma che, leggendo il totale della spesa, calcola 
 * l’eventuale importo scontato.
 * */

public class Es8_p131 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Creo un oggetto Scanner per leggere i dati inseriti dall'utente
		
		float importoSpesa, sconto = 0;
		
		System.out.print("Inserisci l'importo totale della spesa: ");  
        importoSpesa = in.nextFloat();  


        if (importoSpesa > 100) {  
            sconto = importoSpesa * 20 / 100;  
        }

        double importoScontato = importoSpesa - sconto;  

        System.out.println("Importo originale: " + importoSpesa);  
        System.out.println("Importo scontato: " + importoScontato);  
        
        in.close();
	}

}
