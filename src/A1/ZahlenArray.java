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
}
