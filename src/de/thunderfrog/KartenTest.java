package de.thunderfrog;

public class KartenTest {

    public static void main(String[] args) {
        // Spielkarten und Farben ARRAY
        String[] farben = {"Karo", "Herz", "Pike", "Kreuz"};
        String[] kartenwert = {"Sieben", "Acht", "Neun", "Zehn", "Bube", "Dame", "König", "Ass"};

        // Farbe * Kartenwert = 32 Karten
        Karte[] kartenspiel = new Karte[farben.length * kartenwert.length];
        int count = 0;

        // Loop über alle Farben und Kartentypen
        for(int i = 0; i < farben.length; i++){
            for(int j = 0; j < kartenwert.length; j++){
                kartenspiel[count] = new Karte(kartenwert[j], farben[i]);
                kartenspiel[count].ausgabe();

                count++;
            }
            System.out.println();
        }

    }
}
