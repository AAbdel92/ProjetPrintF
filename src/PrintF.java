import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintF {

	public static void main(String[] args) throws FileNotFoundException {
				

		File fichierTxt = new File("C:\\Users\\Simplon\\osef.txt");
		
		Scanner scan = new Scanner(fichierTxt);
		
		System.out.println("Voici le contenu de votre texte : \n");
		
		int count = 0;	
		
		while (scan.hasNextLine()) {
				if (count < 3) {
			String reponse = scan.next();
			System.out.printf("%s\t", reponse);
			count ++;
				} else {
					System.out.println("\r");					
					count = 0;
				}
		}
		scan.close();
			

	}

}
