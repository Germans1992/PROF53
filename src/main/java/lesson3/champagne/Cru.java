package lesson3.champagne;

public enum Cru {
    AUTRE(80),PREMIER(90),GRAND(100);

    private int Quality;

    Cru(int quality) {
        Quality = quality;
    }

    public int getQuality() {
        return Quality;
    }
}
