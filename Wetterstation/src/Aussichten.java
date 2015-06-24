import java.util.Random;


public class Aussichten{
	private String vorhersage;
	
	private String[] texte = {
			"regnerisch", "trüb", "neblig", "stürmisch", "wechselhaft bewölkt",
			"sonnig", "heiter", "frostig" 
	};
	public void aktualisieren(MessDaten daten) {
		berechneVorhersage(daten);
		System.out.println("Die weiteren Aussichten: " + vorhersage);
	}
	private void berechneVorhersage(MessDaten daten){
		Random random = new Random();
		int index1 = random.nextInt(texte.length);
		int index2 = random.nextInt(texte.length);
		while(index2 == index1){
			 index2 = random.nextInt(texte.length);
		}
		vorhersage = texte[index1] + " und " + texte[index2];
	}
	
}
