import java.util.Random;
/**
 * @author Livaja Toni
 * @date 25-09-2026
 * Die Aufgabe der Klasse GewinnModel ist es die gesamte Spielelogik
 * den Punktestand zu Verwalten.
 */
public class GewinnModel {
    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    /**
     * Initialisiert das Modell mit 30 Startpunkten.
     */
    public GewinnModel() {
        this.gesamtPunkte = 30;
    }

    /**
     * Die Methode gibt die aktuelle Punkteanzahl zurück
     *
     * @return Die derzeitigen Punkte
     */
    public int getGesamtPunkte() {
        return gesamtPunkte;
    }

    /**
     * In der Methode wird die letzte Ermittelte Computerzahl zurückgegeben
     *
     * @return die Computerzahl zwischen 1 und 9
     */
    public int getComputerZahl() {
        return computerZahl;
    }

    /**
     * Die Methode getRundenErgebnis gibt das Ergebnis der letzen Runde zurück
     *
     * @return gibt die in der Runde erzieten Punkte zurück
     */
    public int getRundenErgebnis() {
        return rundenErgebnis;
    }

    /**
     * Hier wird geprüft ob der Spieler gewonnen hat
     *
     * @return in der Methode wird true zurückgegeben falls der Spieler mehr als 100 Punkte hat ansonten false
     */
    public boolean hatGewonnen() {
        return this.gesamtPunkte >= 100;
    }

    /**
     * Hier wird geprüft ob der Spieler verloren hat
     *
     * @return in der Methode wird true zurückgegeben falls der Spieler weniger als 100 Punkte hat ansonten false
     */
    public boolean hatVerloren() {
        return this.gesamtPunkte <= 0;
    }

    /**
     * Hier wird eine Zufallszahl zwischen 1 und 9 Generiert diese wird dann in ein Attribut gespeichert
     */
    public void berechneComputerZahl() {
        Random random;
        random = new Random();
        this.computerZahl = random.nextInt(9) + 1; // Zahl von 1 bis 9
    }

    /**
     * Berechnet das Ergebnis der aktuellen Spielrunde basierend auf dem Tipp des Spielers
     * und vergleicht ihn mit der Computerzahl.
     *
     * @param spielerZahl Die vom Spieler gewählte Zahl zwischen 1 und 9
     */
    public void berechneRunde(int spielerZahl) {
        this.spielerZahl = spielerZahl;
        berechneComputerZahl();

        if (this.spielerZahl == this.computerZahl) {
            this.rundenErgebnis = 20;
        } else if (Math.abs(this.spielerZahl - this.computerZahl) == 1) {
            this.rundenErgebnis = 5;
        } else {
            this.rundenErgebnis = -10;
        }

        this.gesamtPunkte += this.rundenErgebnis;
    }
}
