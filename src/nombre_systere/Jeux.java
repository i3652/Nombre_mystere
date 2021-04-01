package nombre_systere;

public class Jeux {

	int mode;

	public Jeux(int mode) {
		this.mode = mode;
	}

	void Deuxiememenu() {
		System.out.println("---------------------------------------");
		System.out.println("1)->Rejouer au meme mode ");
		System.out.println("2)->Lancer un autre mode");
		System.out.println("3)->Quitter");
		System.out.println("---------------------------------------");

	}

	String[] Comparer(int[] reponse, int[] resulta) {
		String[] tst = new String[4];
		for (int i = 0; i < 4; i++) {
			if (reponse[i] == resulta[i])
				tst[i] = "=";
			else if (reponse[i] > resulta[i])
				tst[i] = "+";
			else
				tst[i] = "-";
		}
		return tst;
	}

	boolean TesteReponse(String[] tst) {
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (tst[i].equals("=")) {
				count++;
			}
		}
		if (count == 4)

			return true;
		else
			return false;

	}

	public int[] Nombrealeatoire() {
		return null;
	}

	public int[] Nombrereponse(int[] reponse, String[] test) {
		return null;
	}

}
