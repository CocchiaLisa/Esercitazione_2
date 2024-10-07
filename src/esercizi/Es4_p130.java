package esercizi;
//importo la classe Scanner per leggere l'input da tastiera
import java.util.Scanner;



public class Es4_p130 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float totaleSpesa, sconto = 0;

        System.out.print("Inserisci il totale della spesa: ");
        totaleSpesa = in.nextFloat();  


        // Applica lo sconto del 10% se il totale è inferiore a 500 euro, altrimenti del 20%
        if (totaleSpesa < 500) {
            sconto = totaleSpesa * 10 / 100;  
        } else {
            sconto = totaleSpesa * 20 / 100; 
        }

        double importoDaPagare = totaleSpesa - sconto;  

        // Stampa i risultati
        System.out.println("Sconto applicato: " + sconto + " euro");
        System.out.printf("Importo finale da pagare: %.2f", importoDaPagare); // stampa con due decimali

 
        in.close();  // Chiude lo Scanner
	}

}
