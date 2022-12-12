public class Main {

    static int nullenHintereinander = 0;
    static int anzahlZahlenReihe = 0;
    static char[][] feld = new char[10][10];
    //static double[][] feldVorher = new double[10][10];
    static int freieFelderVorher;
    static int verbleibendeFelder = 0;
    static boolean raetselGeloest = false;
    static int durchgaenge = 0;
    static int felderFrei = 0;
    static int felderBelegt = 0;
    static boolean unloesbar = false;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                feld[i][j] = ' ';

            }

        }

        //einfaches setzten von Zahlen

        Raetsel6();


        RaetselAusgeben();


        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (feld[i][j] == ' ') {
                    felderFrei++;
                }
            }
        }
        //Weise felderFrei felderFreiVorher zu
        //freieFelderVorher = felderFrei;
        felderBelegt = 100 - felderFrei;
        System.out.println("Zu Beginn sind " + felderFrei + " Felder frei und " + felderBelegt + " Felder belegt.");
        System.out.println();

//		while (raetselGeloest == false) {
//
//		}
        for (int i = 0; i < 50; i++) {
            if (raetselGeloest) {
                break;
            } else if (!hatSichGeaendert()) {
                //System.out.println("Das Rätsel ist für dieses Programm nicht lösbar.");
                unloesbar = true;
                break;
            } else {
                doppelNullHorizontal();
                doppelEinsHorizontal();
                doppelNullVertikal();
                doppelEinsVertikal();

                nullLeerNullHorizontal();
                einsLeerEinsHorizontal();
                nullLeerNullVertikal();
                einsLeerEinsVertikal();

                fuenfNullenHorizontal();
                fuenfEinsenHorizontal();
                fuenfNullenVertikal();
                fuenfEinsenVertikal();

                /*if(!hatSichGeaendert()){
                    vierNullenHorizontal();
                    vierInSpalte();
                    System.out.println("Hat sich nicht geändert");
                }*/

                istRaetselFertig();
                RaetselAusgeben();

            }
        }

        System.out.println();

        zaehlenNullVertikal();
        zaehlenNullHorizontal();

        System.out.println();

        RaetselAusgeben();

        if (!unloesbar) {
            System.out.println("Das Rätsel wurde in " + durchgaenge + " Durchgängen gelöst.");
        } else {
            System.out.println("Das Rätsel ist für dieses Programm leider nicht lösbar.");
        }


    }

    static void Raetsel7() {
        feld[0][0] = '1';
        feld[0][2] = '1';
        feld[0][5] = '1';
        feld[1][4] = '0';
        feld[1][8] = '0';
        feld[1][9] = '0';
        feld[2][3] = '1';
        feld[2][7] = '1';
        feld[4][2] = '1';
        feld[4][7] = '0';
        feld[4][8] = '0';
        feld[5][3] = '0';
        feld[5][8] = '1';
        feld[7][2] = '1';
        feld[7][5] = '1';
        feld[7][9] = '1';
        feld[8][6] = '1';
        feld[8][8] = '0';
        feld[9][1] = '0';
        feld[9][4] = '1';
        feld[9][8] = '0';
    }

    static void Raetsel6() {
        // TODO Auto-generated method stub
        feld[1][9] = '1';
        feld[2][3] = '0';
        feld[2][6] = '0';
        feld[2][9] = '1';
        feld[3][1] = '1';
        feld[3][2] = '1';
        feld[3][7] = '1';
        feld[3][8] = '1';
        feld[4][8] = '1';
        feld[5][0] = '1';
        feld[5][2] = '1';
        feld[5][5] = '1';
        feld[6][0] = '1';
        feld[6][8] = '1';
        feld[7][4] = '1';
        feld[7][5] = '1';
        feld[7][7] = '0';
        feld[8][0] = '1';
        feld[8][2] = '1';
        feld[8][3] = '1';
        feld[8][9] = '1';
        feld[9][1] = '0';
        feld[9][5] = '1';
    }

    private static void RaetselAusgeben() {
        System.out.println("----------------------------------------- ");
        for (int i = 0; i < 10; i++) {
            System.out.print("| ");
            for (int j = 0; j < 10; j++) {
                System.out.print(feld[i][j]);
                System.out.print(" | ");

            }
            System.out.println();
            System.out.println("----------------------------------------- ");
        }
    }

    static void istRaetselFertig() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (feld[i][j] == ' ') {
                    verbleibendeFelder++;
                }
            }
        }
        if (verbleibendeFelder == 0) {
            raetselGeloest = true;
            System.out.println("Das Lösen dieses Rätsels hat " + durchgaenge + " Durchgänge benötigt.");
        } else {
            System.out.println("Aktuell sind noch " + verbleibendeFelder + " Felder nicht gelöst.");
            verbleibendeFelder = 0;
            durchgaenge++;
            raetselGeloest = false;
        }
    }

    static void Raetsel5() {
        // TODO Auto-generated method stub
        feld[0][3] = '0';
        feld[1][1] = '0';
        feld[1][4] = '1';
        feld[1][6] = '0';
        feld[1][8] = '1';
        feld[1][9] = '1';
        feld[2][8] = '1';
        feld[3][0] = '1';
        feld[3][2] = '0';
        feld[3][4] = '1';
        feld[4][0] = '1';
        feld[4][2] = '0';
        feld[4][6] = '1';
        feld[5][3] = '1';
        feld[5][8] = '1';
        feld[6][1] = '0';
        feld[6][5] = '1';
        feld[7][2] = '1';
        feld[8][5] = '0';
        feld[8][7] = '1';
        feld[9][2] = '0';
        feld[9][6] = '1';
        feld[9][7] = '1';
        feld[9][9] = '0';
    }

    private static void Raetsel4() {
        // TODO Auto-generated method stub
        feld[0][1] = '1';
        feld[1][2] = '0';
        feld[1][5] = '1';
        feld[1][9] = '0';
        feld[3][0] = '1';
        feld[3][3] = '1';
        feld[3][6] = '0';
        feld[3][8] = '0';
        feld[4][1] = '0';
        feld[4][2] = '0';
        feld[4][7] = '1';
        feld[5][2] = '0';
        feld[5][5] = '1';
        feld[6][8] = '0';
        feld[7][8] = '0';
        feld[8][3] = '0';
        feld[8][4] = '0';
        feld[8][6] = '1';
        feld[9][1] = '1';
        feld[9][5] = '0';
        feld[9][7] = '0';
    }

    static void zaehlenNullHorizontal() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (feld[i][j] == '0') {
                    anzahlZahlenReihe++;

                }
            }
            if (anzahlZahlenReihe != 5) {
                System.out.println("Reihe " + (i + 1) + " hat einen Fehler");

            } else {
                System.out.println("Reihe " + (i + 1) + " ist korrekt!");
            }
            anzahlZahlenReihe = 0;
        }
    }

    static void Raetsel3() {

        // TODO Auto-generated method stub
        feld[0][7] = '1';
        feld[1][1] = '0';
        feld[1][2] = '0';
        feld[1][5] = '0';
        feld[1][8] = '1';
        feld[2][1] = '0';
        feld[2][4] = '1';
        feld[2][7] = '0';
        feld[2][9] = '0';
        feld[3][2] = '1';
        feld[3][6] = '1';
        feld[4][0] = '1';
        feld[4][2] = '1';
        feld[4][9] = '1';
        feld[5][7] = '1';
        feld[6][1] = '0';
        feld[6][4] = '1';
        feld[6][8] = '0';
        feld[7][4] = '1';
        feld[7][5] = '1';
        feld[7][9] = '0';
        feld[8][1] = '0';
        feld[8][3] = '0';
        feld[8][6] = '1';
        feld[8][9] = '0';
        feld[9][0] = '0';
        feld[9][4] = '0';
        feld[9][8] = '1';
    }

    static void zaehlenNullVertikal() {
        // TODO Auto-generated method stub
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {

                if (feld[i][j] == '0') {
                    anzahlZahlenReihe++;

                }
            }
            if (anzahlZahlenReihe != 5) {
                System.out.println("Spalte " + (j + 1) + " hat einen Fehler");

            } else {
                System.out.println("Spalte " + (j + 1) + " ist korrekt!");
            }
            anzahlZahlenReihe = 0;
        }

    }

    static void Raetsel2() {
        // TODO Auto-generated method stub
        feld[0][0] = '0';
        feld[1][2] = '1';
        feld[1][6] = '1';
        feld[1][7] = '1';
        feld[2][1] = '1';
        feld[2][8] = '0';
        feld[3][3] = '0';
        feld[3][5] = '0';
        feld[5][0] = '0';
        feld[5][7] = '1';
        feld[5][9] = '0';
        feld[6][1] = '1';
        feld[6][3] = '1';
        feld[7][0] = '0';
        feld[7][4] = '0';
        feld[7][5] = '0';
        feld[7][7] = '1';
        feld[8][0] = '1';
        feld[9][1] = '1';
        feld[9][3] = '1';
        feld[9][4] = '1';
        feld[9][9] = '0';
    }

    static void Raetsel1() {
        feld[0][3] = '0';
        feld[0][9] = '1';
        feld[1][0] = '0';
        feld[1][1] = '0';
        feld[1][4] = '1';
        feld[1][6] = '0';
        feld[2][2] = '1';
        feld[2][9] = '1';
        feld[3][3] = '0';
        feld[3][8] = '1';
        feld[4][3] = '0';
        feld[4][6] = '1';
        feld[5][0] = '0';
        feld[5][4] = '1';
        feld[5][7] = '0';
        feld[6][1] = '1';
        feld[7][0] = '0';
        feld[7][3] = '0';
        feld[8][6] = '0';
        feld[8][7] = '0';
        feld[9][2] = '1';
        feld[9][5] = '1';
    }

    static void fuenfEinsenVertikal() {
        // TODO Auto-generated method stub
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {

                if (feld[i][j] == '1') {
                    anzahlZahlenReihe++;
                    if (anzahlZahlenReihe == 5) {
                        for (int k = 0; k < 10; k++) {
                            if (feld[k][j] == ' ') {
                                feld[k][j] = '0';

                            }

                        }
                    }
                }
            }
            anzahlZahlenReihe = 0;
        }
    }

    static void fuenfNullenVertikal() {
        // TODO Auto-generated method stub
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {

                if (feld[i][j] == '0') {
                    anzahlZahlenReihe++;
                    if (anzahlZahlenReihe == 5) {
                        for (int k = 0; k < 10; k++) {
                            if (feld[k][j] == ' ') {
                                feld[k][j] = '1';

                            }

                        }
                    }
                }
            }
            anzahlZahlenReihe = 0;
        }
    }

    static void fuenfNullenHorizontal() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (feld[i][j] == '0') {
                    anzahlZahlenReihe++;
                    if (anzahlZahlenReihe == 5) {
                        for (int k = 0; k < 10; k++) {
                            if (feld[i][k] == ' ') {
                                feld[i][k] = '1';

                            }
                        }
                    }
                }
            }
            anzahlZahlenReihe = 0;
        }
    }

    static void fuenfEinsenHorizontal() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (feld[i][j] == '1') {
                    anzahlZahlenReihe++;
                    if (anzahlZahlenReihe == 5) {
                        for (int k = 0; k < 10; k++) {
                            if (feld[i][k] == ' ') {
                                feld[i][k] = '0';

                            }

                        }
                    }
                }
            }
            anzahlZahlenReihe = 0;
        }
    }

    static void einsLeerEinsVertikal() {
        // TODO Auto-generated method stub
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {

                if (i < 8 && feld[i][j] == '1' && feld[i + 1][j] == ' ' && feld[i + 2][j] == '1') {
                    feld[i + 1][j] = '0';

                }
            }
        }
    }


    static void nullLeerNullVertikal() {
        // TODO Auto-generated method stub
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {

                if (i < 8 && feld[i][j] == '0' && feld[i + 1][j] == ' ' && feld[i + 2][j] == '0') {
                    feld[i + 1][j] = '1';

                }
            }
        }
    }

    //Prüft ob eine Null auf ein Leeres Feld folgt und auf eine Null und setzt dann die Leerstelle auf 1
    static void nullLeerNullHorizontal() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (j < 8 && feld[i][j] == '0' && feld[i][j + 1] == ' ' && feld[i][j + 2] == '0') {
                    feld[i][j + 1] = '1';

                }
            }
        }
    }


    //Prüft ob eine Eins auf ein Leeres Feld folgt und auf eine Eins und setzt dann die Leerstelle auf 0
    static void einsLeerEinsHorizontal() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (j < 8 && feld[i][j] == '1' && feld[i][j + 1] == ' ' && feld[i][j + 2] == '1') {
                    feld[i][j + 1] = '0';

                }
            }
        }
    }


    //Prüft ob 2 Einen hintereinander Vertikal sind und fügt eine 0 ein
    static void doppelEinsVertikal() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (feld[j][i] == '1') {
                    nullenHintereinander++;
                    if (nullenHintereinander == 2 && j < 9) {
                        feld[j + 1][i] = '0';
                    }
                } else {
                    nullenHintereinander = 0;
                }

            }
            nullenHintereinander = 0;

        }

        for (int i = 9; i >= 0; i--) {
            for (int j = 9; j >= 0; j--) {

                if (feld[j][i] == '1') {
                    nullenHintereinander++;
                    if (nullenHintereinander == 2 && j != 0) {
                        feld[j - 1][i] = '0';
                    }
                } else {
                    nullenHintereinander = 0;
                }

            }
            nullenHintereinander = 0;

        }
    }

    //Prüft ob 2 Nullen hintereinander Vertikal sind und fügt eine 1 ein
    static void doppelNullVertikal() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (feld[j][i] == '0') {
                    nullenHintereinander++;
                    if (nullenHintereinander == 2 && j < 9) {
                        feld[j + 1][i] = '1';
                    }
                } else {
                    nullenHintereinander = 0;
                }

            }
            nullenHintereinander = 0;

        }

        for (int i = 9; i >= 0; i--) {
            for (int j = 9; j >= 0; j--) {

                if (feld[j][i] == '0') {
                    nullenHintereinander++;
                    if (nullenHintereinander == 2 && j != 0) {
                        feld[j - 1][i] = '1';
                    }
                } else {
                    nullenHintereinander = 0;
                }

            }
            nullenHintereinander = 0;

        }
    }

    //Prüft ob 2 Nullen hintereinander Horizontal sind und fügt eine 1 ein
    static void doppelNullHorizontal() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (feld[i][j] == '0') {
                    nullenHintereinander++;
                    if (nullenHintereinander == 2 && j < 9) {
                        feld[i][j + 1] = '1';
                    }
                } else {
                    nullenHintereinander = 0;
                }

            }
            nullenHintereinander = 0;

        }

        for (int i = 9; i >= 0; i--) {
            for (int j = 9; j >= 0; j--) {

                if (feld[i][j] == '0') {
                    nullenHintereinander++;
                    if (nullenHintereinander == 2 && j != 0) {
                        feld[i][j - 1] = '1';
                    }
                } else {
                    nullenHintereinander = 0;
                }

            }
            nullenHintereinander = 0;

        }
    }


    //Prüft ob 2 Einsen hintereinander Horizontal sind und fügt eine 0 ein
    static void doppelEinsHorizontal() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (feld[i][j] == '1') {
                    nullenHintereinander++;
                    if (nullenHintereinander == 2 && j < 9) {
                        feld[i][j + 1] = '0';
                    }
                } else {
                    nullenHintereinander = 0;
                }

            }
            nullenHintereinander = 0;

        }

        for (int i = 9; i >= 0; i--) {
            for (int j = 9; j >= 0; j--) {

                if (feld[i][j] == '1') {
                    nullenHintereinander++;
                    if (nullenHintereinander == 2 && j != 0) {
                        feld[i][j - 1] = '0';
                    }
                } else {
                    nullenHintereinander = 0;
                }

            }
            nullenHintereinander = 0;

        }
    }


    //Prüft ob eine Zeile schon 4 Nullen und noch 3 Leerstellen neben einander hat und setzt dann die Leerstellen auf 1
    static void vierNullenHorizontal() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (feld[i][j] == '0') {
                    nullenHintereinander++;
                    if (nullenHintereinander == 4 && j < 7) {
                        if (feld[i][j + 1] == ' ' && feld[i][j + 2] == ' ' && feld[i][j + 3] == ' ') {
                            feld[i][j + 1] = '1';
                            feld[i][j + 2] = '1';
                            feld[i][j + 3] = '1';
                        }
                    }
                } else {
                    nullenHintereinander = 0;
                }

            }
            nullenHintereinander = 0;

        }

        for (int i = 9; i >= 0; i--) {
            for (int j = 9; j >= 0; j--) {

                if (feld[i][j] == '0') {
                    nullenHintereinander++;
                    if (nullenHintereinander == 4 && j > 2) {
                        if (feld[i][j - 1] == ' ' && feld[i][j - 2] == ' ' && feld[i][j - 3] == ' ') {
                            feld[i][j - 1] = '1';
                            feld[i][j - 2] = '1';
                            feld[i][j - 3] = '1';
                        }
                    }
                } else {
                    nullenHintereinander = 0;
                }

            }
            nullenHintereinander = 0;

        }
    }


    //Prüft ob eine Spalte schon 4 Nullen oder 4 Einsen hat und setzt dann die restlichen Felder auf die fehlende Zahl
    static void vierInSpalte() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            int nullen = 0;
            int einsen = 0;
            for (int j = 0; j < 10; j++) {
                if (feld[j][i] == '0') {
                    nullen++;
                } else if (feld[j][i] == '1') {
                    einsen++;
                }
            }
            if (nullen == 4) {
                for (int j = 0; j < 10; j++) {
                    if (feld[j][i] == ' ') {
                        feld[j][i] = '1';
                    }
                }
            } else if (einsen == 4) {
                for (int j = 0; j < 10; j++) {
                    if (feld[j][i] == ' ') {
                        feld[j][i] = '0';
                    }
                }
            }
            nullen = 0;
            einsen = 0;
        }
    }

    //Prüft ob im letzten Schritt etwas verändert hat in dem die Freien Felder gezählt werden
    static boolean hatSichGeaendert() {
        // TODO Auto-generated method stub
        int freieFelder = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (feld[i][j] == ' ') {
                    freieFelder++;
                }
            }
        }
        if (freieFelder == freieFelderVorher) {
            return false;
        } else {
            freieFelderVorher = freieFelder;
            return true;
        }
    }
/*    static boolean hatSichGeaendert() {
        // TODO Auto-generated method stub

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (feld[i][j] != feldVorher[i][j]) {
                    return true;
                }
            }
        }
        return false;

    }*/
}
