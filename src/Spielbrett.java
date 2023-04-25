public class Spielbrett {
    private int anzahlElemente;

    public Spielbrett() {
        spielAufbau();
    }

    public int getAnzahlElemente() {
        return anzahlElemente;
    }

    public boolean elementeHinzufügen(int anzahlElemente) {
        // TODO
        return false;
    }

    public void spielAufbau() {
        this.anzahlElemente = (int)(Math.random() * 30);
    }

    public boolean istSpielZuEnde() {
        // TODO
        return false;
    }
}
