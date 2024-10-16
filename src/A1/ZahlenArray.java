package A1;

public class ZahlenArray {
    private int[] zahlen;

    public ZahlenArray(int[] zahlen) {
        this.zahlen = zahlen;
    }
    public int findeMax() {
        int max = zahlen[0];
        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] > max) {
                max = zahlen[i];
            }
        }
        return max;
    }

    public int findeMin() {
        int min = zahlen[0];
        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] < min) {
                min = zahlen[i];
            }
        }
        return min;
    }

    public int findeMaximaleSumme() {
        int min = findeMin();
        int summe = 0;
        for (int zahl : zahlen) {
            if (zahl != min) {
                summe += zahl;
            }
        }
        return summe;
    }

    public int findeMinimaleSumme() {
        int max = findeMax();
        int summe = 0;
        for (int zahl : zahlen) {
            if (zahl != max) {
                summe += zahl;
            }
        }
        return summe;
    }


}
