package nombre_systere;

import java.util.Random;
import java.util.Scanner;

public class PremierMode extends Jeux {
	public PremierMode() {
		super(2);
	}

	public int[] Nombrealeatoire() {
		int[] Number = new int[10];
		;
		for (int index = 0; index < 4; index++) {
			Random random = new Random();
			Number[index] = random.nextInt(9);
			
		}
		return Number;
	}

	public int[] Nombrereponse(int[] reponse, String[] ResultadesOperateur) {
		int j = 0;
		System.out.println("Donnez votre réponse :");
		String split ;
        do {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		 split = scanner.nextLine();
		 if(split.length()>4)
			 System.out.println("Invalid input: "); 
        }while(split.length()>4);
		for (int index = 0; index < 4; index++) {

			reponse[index] = Integer.valueOf(Character.toString(split.trim().charAt(j++)));
		}

		return reponse;
	}
}
