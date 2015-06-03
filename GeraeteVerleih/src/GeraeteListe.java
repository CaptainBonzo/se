import java.util.ArrayList;


public class GeraeteListe {
	private ArrayList<Geraet> geraeteListe;
	public GeraeteListe(){
		geraeteListe = new ArrayList<Geraet>();
	}
	public void hinzufuegen(Geraet geraet){
		geraeteListe.add(geraet);
	}
	public void entfernen(Geraet geraet) {
		geraeteListe.remove(geraet);
	}
	public int getAnzahlGeraete() {
		return geraeteListe.size();
	}
}
