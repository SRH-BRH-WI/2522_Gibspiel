public class Gibspiel {

    /*
     * Ein Spiel für 2 Spieler.
     * Jeder Spieler kann 1-10 Elemente auf einem Spielbrett plazieren,
     * selbst gewählt, mindestens eins, maximal 10 Elemente.
     * Welcher Spieler das 100. Element hinlegt, hat gewonnen.
     * Das Spiel beginnt mit einer zufälligen Anzahl von Elementen (< 30),
     * die bereits auf dem Spielbrett liegen.
     *
     * Benutzen Sie das Konzept der Vererbung, um wahlweise einen
     * menschlichen oder computergesteuerten Spieler teilnehmen zu lassen
     * (0, 1 oder 2 Computerspieler).
     *
     * Verwenden Sie am Anfang eine schwache KI für den computergesteuerten
     * Spieler.
     *
     * Notwendige Klassen:
     * - Spieler
     *   - MenschSpieler
     *   - ComputerSpieler
     * - Spielbrett
     */

    public static void main(String[] args) {
        Spielbrett spielbrett = new Spielbrett();
        MenschSpieler spieler1 = new MenschSpieler(spielbrett, "Spieler 1");
        MenschSpieler spieler2 = new MenschSpieler(spielbrett, "Spieler 2");

        int anzahlElemente = spieler1.elementePlazieren();
        if ( spielbrett.elementeHinzufügen(anzahlElemente) ) {
            anzahlElemente = spieler2.elementePlazieren();
            if ( spielbrett.elementeHinzufügen(anzahlElemente) ) {
                // Spieler 1 ist wieder dran ...
                System.out.println("Okay");
            }
        }
    }

}
