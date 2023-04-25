public class Spielbrett {
    private int anzahlElemente;

    public Spielbrett() {
        spielAufbau();
    }

    public int getAnzahlElemente() {
        return anzahlElemente;
    }

    public boolean elementeHinzufügen(int anzahlElemente) {
        // Sanity Check (Türsteher, Wächterfunktion)
        if (anzahlElemente < 1) return false;
        if (anzahlElemente > 10) return false;

        int anzahlNeuerElemente = this.anzahlElemente + anzahlElemente;
        if (anzahlNeuerElemente > 100) return false;

        this.anzahlElemente = anzahlNeuerElemente;
        return true;
    }

    public void spielAufbau() {
        this.anzahlElemente = (int)(Math.random() * 30);
    }

    public boolean istSpielZuEnde() {
        // TODO
        return false;
    }
}
