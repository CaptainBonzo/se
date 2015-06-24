import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class Wetterstation {
	MessDaten daten = new MessDaten();

	AktuelleBedingungen aktuelleBedingungen = new AktuelleBedingungen();
	Tendenz tendenz = new Tendenz();
	Aussichten aussichten = new Aussichten();
	
	// wird aufgerufen, wenn neue Messwerte da sind
	public void messwerteGeaendert(){
		aktuelleBedingungen.aktualisieren(daten);
		tendenz.aktualisieren(daten);
		aussichten.aktualisieren(daten);
	}
	
	// Simulation der Wetterdaten ...
	public void messungSimulieren(){
		Thread thread = new Thread(new Runnable(){
			public void run(){
				while (true){
					daten.messen();
					messwerteGeaendert();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		thread.start();
	}

	public Wetterstation(){
		messungSimulieren();
	}

	public static void main(String [] arg){
		new Wetterstation();
	}
}
