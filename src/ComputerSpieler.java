public class ComputerSpieler extends Spieler {
    public ComputerSpieler(Spielbrett spielbrett, String name) {
        super(spielbrett, name);
    }

    @Override
    public int elementePlazieren() {
        int spieleElemente = 100 - getSpielbrett().getAnzahlElemente();
        if (spieleElemente > 10) {
            spieleElemente = (int)(Math.random() * 10) + 1;
        }
        System.out.println(getName() + " spielt " + spieleElemente + " Elemente");
        return spieleElemente;
    }
}
