public abstract class Spieler {
    private Spielbrett spielbrett;
    private String name;

    // Dependency Injection
    public Spieler(Spielbrett spielbrett, String name) {
        this.spielbrett = spielbrett;
        this.name = name;
    }

    public Spielbrett getSpielbrett() {
        return spielbrett;
    }

    public String getName() {
        return name;
    }

    public abstract int elementePlazieren();
}
