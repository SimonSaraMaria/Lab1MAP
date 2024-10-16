package A1;

public class Elektronik {
    private int tastaturPreis;

    public int billigsteTastatur(int[] tastaturen) {
        int billigste = tastaturen[0];
        for (int i = 1; i < tastaturen.length; i++) {
            if (tastaturen[i] < billigste) {
                billigste = tastaturen[i];
            }
        }
        return billigste;
    }

    public int teuersterGegenstand(int[] tastaturen, int[] usbLaufwerk) {
        int teuerstergegenstand = tastaturen[0];
        for (int i = 1; i < tastaturen.length; i++) {
            if (tastaturen[i] > teuerstergegenstand) {
                teuerstergegenstand = tastaturen[i];
            }
        }
        for (int usb : usbLaufwerk) {
            if (usb > teuerstergegenstand) {
                teuerstergegenstand = usb;
            }
        }
        return teuerstergegenstand;
    }

    public int teuerstesUsbLaufwerk(int[] preise, int budget) {
        int teuerstes = -1;
        for (int i = 0; i < preise.length; i++) {
            if (preise[i] <= budget && preise[i] > teuerstes) {
                teuerstes = preise[i];
            }
        }
        return teuerstes;
    }

    //public int maximalerGeldbetrag(int budget, int[] tastaturen, int[] usbLaufwerk) {
    //int billigsteTastatur = billigsteTastatur(tastaturen);
    //int teuerstesUsbLaufwerk = teuerstesUsbLaufwerk(usbLaufwerk, budget);
    //if (billigsteTastatur + teuerstesUsbLaufwerk > budget <= budget) {}
    //}

    public int maximalerGeldbetrag(int budget, int[] tastaturen, int[] usbLaufwerke) {
        int maxAusgaben = 0;
        for (int tastaturPreis : tastaturen) {
            if (tastaturPreis <= budget) {
                for (int usbLaufwerkPreis : usbLaufwerke) {
                    if (tastaturPreis + usbLaufwerkPreis <= budget) {
                        maxAusgaben = Math.max(maxAusgaben, tastaturPreis + usbLaufwerkPreis);
                    }
                }
            }
        }
        return maxAusgaben;
    }
}

//        for (int usbLaufwerkPreis : usbLaufwerke) {
//            if (usbLaufwerkPreis <= budget - maxAusgaben) {
//                maxAusgaben += usbLaufwerkPreis;
//            if (tastaturPreis + usbLaufwerkPreis <= budget) {
//                maxAusgaben = tastaturPreis + usbLaufwerkPreis;
//            }
//        }
//        return maxAusgaben;


