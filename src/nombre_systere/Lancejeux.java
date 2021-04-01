package nombre_systere;

import java.util.Scanner;

public class Lancejeux {

	static int Premiermenu() {
		System.out.println("---------------------MENU-------------------------");
		System.out.println("1)->Premier Mode ");
		System.out.println("2)->Deuxiéme Mode");
		System.out.println("--------------------------------------------------");
		int index;
		do {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			index = scanner.nextInt();
			if (index > 2)
				System.out.println("Invalid input ! Enterz un autre choix svp! :");
		} while (index > 2 && index < 0);
		return index;
	}

	static int Deuxiememenu() {
		System.out.println("---------------------MENU-------------------------");
		System.out.println("1)->Rejouer au meme mode ");
		System.out.println("2)->Lancer un autre mode");
		System.out.println("3)->Quitter");
		System.out.println("--------------------------------------------------");
		int index;
		do {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			index = scanner.nextInt();
			if (index > 4)
				System.out.println("Invalid input ! Enterz un autre choix svp! :");
		} while (index > 4 && index < 0);
		return index;
	}

	public static void main(String[] args) {
		DeuxiemeMode DeuxiemeMode = new DeuxiemeMode();
		PremierMode PremierMode = new PremierMode();
		Jeux jeux = null;
		int choix = 0;
		int[] NumeroReponse = new int[4];
		String[] ResultadesOperateur = { "", "", "", "" };
		choix = Premiermenu();
		while (true) {
			if (choix == 1)
				jeux = PremierMode;
			else
				jeux = DeuxiemeMode;

			int i = 0;
			int[] NumeroAleatoire = jeux.Nombrealeatoire();

			while (i < 10) {
				System.out.print("\n" + (i + 1) + ") ");
				NumeroReponse = jeux.Nombrereponse(NumeroReponse, ResultadesOperateur);
				ResultadesOperateur = jeux.Comparer(NumeroReponse, NumeroAleatoire);
				for (int c = 0; c < 4; c++)
					System.out.print(ResultadesOperateur[c]);
				i++;
				if (jeux.TesteReponse(ResultadesOperateur))
					i = 10;
			}
			System.out.println("\n--------------------------------------------------");
			if (jeux.TesteReponse(ResultadesOperateur)) {
				System.out.print("Félicitation, gagné!. Le  resultat   :");
				for (int c = 0; c < 4; c++)
					System.out.print(NumeroAleatoire[c]);
				System.out.print("\n");
			} else {
				System.out.print("le  résultat   :");
				for (int c = 0; c < 4; c++)
					System.out.print(+NumeroAleatoire[c]);
				System.out.print("\n");
			}
			System.out.println("--------------------------------------------------");
			int Deuxiememenu = Deuxiememenu();
			;
			if (Deuxiememenu == 1) {
				System.out.println("*******************Rejouer au m�me mode *******************");
			} else if (Deuxiememenu == 3) {
				System.out.println("*******************Quitter le Systeme*******************");
				System.exit(0);
			} else {
				System.out.println("*******************Lancer un autre mode*******************");
				if (choix == 1)
					choix = 2;
				else
					choix = 1;
			}

		}
	}
}
