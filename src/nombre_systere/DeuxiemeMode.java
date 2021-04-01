package nombre_systere;

import java.util.Random;
import java.util.Scanner;

public class DeuxiemeMode extends Jeux {

	public DeuxiemeMode() {
		super(1);
	}

	public int[] Nombrealeatoire() {
		int[] Number = new int[10];
		System.out.println("Donnez un nombre systere :");
		int j = 0;
		String split ;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		do {
			split = scanner.nextLine();
		 if(split.length()>4)
			 System.out.println("Invalid input! "); 
        }while(split.length()>4);
		for (int i = 0; i < 4; i++) {
			Number[i] = Integer.valueOf(Character.toString(split.trim().charAt(j++)));
		}
		return Number;
	}

	public int[] Nombrereponse(int[] reponse, String[] ResultadesOperateur) {
		System.out.println("La reponse tentative du systeme :");
		for (int index = 0; index < 4; index++) {
			if (!ResultadesOperateur[index].equals("=")) {
				Random random = new Random();
				reponse[index] = random.nextInt(9);
				System.out.print(reponse[index]);
			} else
				System.out.print(reponse[index]);
		}
		System.out.print("\n");

		return reponse;
	}

}
