package de.thunderfrog;

public class Karte {
    private String kartenwert;
    private String farbe;

    public Karte(String kartenwert, String farbe) {
        this.kartenwert = kartenwert;
        this.farbe = farbe;
    }

    public void ausgabe() {
        // print für Ausgabe HINTEREINANDER
        System.out.print(this.farbe + " " + this.kartenwert + " ");
    }
}
