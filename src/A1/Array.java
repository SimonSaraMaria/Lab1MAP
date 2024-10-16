package A1;

public class Array {
    public int[] addiere(int[] zahl1, int[] zahl2) {
        int[] ergebnis = new int[zahl1.length + 1];
        int carry = 0;
        for (int i = zahl1.length - 1; i >= 0; i--) {
            int summe = zahl1[i] + zahl2[i] + carry;
            ergebnis[ergebnis.length - 1 - (zahl1.length - 1 - i)] = summe % 10;
            carry = summe / 10;
        }
        if (carry > 0) {
            ergebnis[0] = carry;
        }
        return ergebnis;
    }

    public int[] subtrahiere(int[] zahl1, int[] zahl2) {
        int[] ergebnis = new int[zahl1.length];
        int leih = 0;
        for (int i = zahl1.length - 1; i >= 0; i--) {
            int diff = zahl1[i] - zahl2[i] - leih;
            if (diff < 0) {
                diff += 10;
                leih = 1;
            }
            else {
                leih = 0;
            }
            ergebnis[ergebnis.length - 1 - (zahl1.length - 1 - i)] = diff;
        }
        return ergebnis;
    }

    public int[] multipliziere(int[] zahl1, int digit) {
        int[] ergebnis = new int[zahl1.length];
        int carry = 0;
        for (int i = zahl1.length - 1; i >= 0; i--) {
            int product = zahl1[i] * digit + carry;
            ergebnis[ergebnis.length - 1 - (zahl1.length - 1 - i)] = product % 10;
            carry = product / 10;
        }
        if (carry > 0) {
            ergebnis[0] = carry;
        }
        return ergebnis;
    }

    public int[] teile(int[] zahl1, int digit) {
        int[] ergebnis = new int[zahl1.length];
        int rest = 0;
        for (int i = 0; i < zahl1.length; i++) {
            int current = rest * 10 + zahl1[i];
            ergebnis[i] = current / digit;
            rest = current % digit;
        }
        return ergebnis;
    }
}
