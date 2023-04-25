import java.util.Scanner;

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

    private static void spielerErmitteln(Spielbrett spielbrett, Spieler[] spieler) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Wieviele Computerspieler (0-2): ");
        int anzahlComputerSpieler = eingabe.nextInt();
        if (anzahlComputerSpieler > 1)
            spieler[0] = new ComputerSpieler(spielbrett, "KI-0");
        else
            spieler[0] = new MenschSpieler(spielbrett, "Mensch 1");
        if (anzahlComputerSpieler > 0)
            spieler[1] = new ComputerSpieler(spielbrett, "KI-1");
        else
            spieler[1] = new MenschSpieler(spielbrett, "Mensch 2");
    }

    private static int wähleAnfangsspieler(Spieler[] spieler) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Es spielen " + spieler[0].getName() +" gegen " +
                spieler[1].getName());
        System.out.print("Wer soll anfangen (0-1): ");
        int anfangsspieler = eingabe.nextInt();
        return anfangsspieler;
    }

    public static void main(String[] args) {
        Spielbrett spielbrett = new Spielbrett();
        Spieler[] spieler = new Spieler[2];
        spielerErmitteln(spielbrett, spieler);

        int aktuellerSpieler = wähleAnfangsspieler(spieler);
        while ( ! spielbrett.istSpielZuEnde() ) {
            System.out.println("Es sind " + spielbrett.getAnzahlElemente() +
                    " Elemente auf dem Spielbrett");
            int anzahlElemente = spieler[aktuellerSpieler].elementePlazieren();
            if ( spielbrett.elementeHinzufügen(anzahlElemente) ) {
                if ( spielbrett.istSpielZuEnde() ) {
                    System.out.println("Spieler " +
                            spieler[aktuellerSpieler].getName() + " hat gewonnen");
                    break;
                }
                // Spieler wechseln (Version 1)
                if (aktuellerSpieler == 0)      aktuellerSpieler = 1;
                else if (aktuellerSpieler == 1) aktuellerSpieler = 0;
                // Spieler wechseln (Version 2)
//                aktuellerSpieler = (aktuellerSpieler + 1) % 2;
                // Spieler wechseln (Version 3)
//                aktuellerSpieler = 1 - aktuellerSpieler;
            }
            else
                System.out.println("Ungültiger Zug, bitte nochmal versuchen");
        }
        System.out.println("Vielen Dank fürs Spielen");
    }
}
