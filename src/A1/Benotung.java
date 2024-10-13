package A1;

public class Benotung {
    public int[] nichtAusreichendeNoten (int[] noten) {
        int[] nichtAusreichend = new int[noten.length]; //de aceeasi lungime cu array-ul de input
        int index = 0;
        for (int note : noten) { //itereaza prin fiecare nota din array
            if (note < 40) {
                nichtAusreichend[index++] = note;
            }
        }
        int[] result = new int[index];
        System.arraycopy(nichtAusreichend, 0, result, 0, index); //copiaza din nichtA in result n elemente
        return result;
    }

    public int durchschnittlicheNote(int[] noten) {
        int summe = 0;
        for (int note : noten) {
            summe += note;
        }
        return  summe / noten.length;
    }

    public int[] gerundeteNoten(int[] noten) {
        int[] gerundet = new int[noten.length];
        for (int i = 0; i < noten.length; i++) {
            gerundet[i] = rundeNote(noten[i]);
        }
        return gerundet;
    }

    private int rundeNote(int note) {
        if (note < 38) {
            return note;
        }
        int nachstesVielfachesFunf = (note / 5 + 1) * 5;
        if (nachstesVielfachesFunf - note < 3) {
            return nachstesVielfachesFunf;
        }
        return note;
    }

    public int maximaleGerundeteNote (int[] noten) {
        int maximaleGerundet = 0;
        for (int note : noten) {
            int gerundet = rundeNote(note);
            if (gerundet > maximaleGerundet) {
                maximaleGerundet = gerundet;
            }
        }
        return maximaleGerundet;
    }
}
