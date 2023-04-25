import java.util.Scanner;

public class MenschSpieler extends Spieler {
    private Scanner eingabe;

    public MenschSpieler(Spielbrett spielbrett, String name) {
        super(spielbrett, name);
        eingabe = new Scanner(System.in);
    }

    @Override
    public int elementePlazieren() {
        System.out.println("Spieler " + getName() + " ist am Zug.");
        System.out.print("Wieviel Elemente plazieren: ");
        int anzahlElemente = eingabe.nextInt();
        return anzahlElemente;
    }
}
