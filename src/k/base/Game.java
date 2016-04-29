package k.base;


import java.util.Scanner;

public class Game {

    private String[][] spielfeld;


    /*
    bekommt ein vorkonfiguriertes k.base.Spielfeld mit bereits
    platzierten Schiffen übergeben und bindet es an die ‚Game’-interne k.base.Spielfeld-
    Datenstruktur.
     */
    public Game(String[][] spielfeld) {
        this.spielfeld = spielfeld;
    }


    // implementiert den Spielablauf.
    public void play() {

        int schuessen = 0;
        while (!testSpielGewonnen()) {

            String koordinaten = readStr();
            boolean test = testKoor(koordinaten);
            while (!test) {
                System.out.println("Die eingegebene Schusskoordinaten sind ungültig. Bitte versuch es erneut.");
                koordinaten = readStr();
                test = testKoor(koordinaten);
            }
            schuessen++;

            if (spielfeld[koordinaten.charAt(0) - 97][Character.getNumericValue(koordinaten.charAt(1)) - 1].equals("0")) {
                System.out.println("kein Treffer");
            } else {
                System.out.println("Treffer");
                spielfeld[koordinaten.charAt(0) - 97][Character.getNumericValue(koordinaten.charAt(1)) - 1] = ("*");
            }
        }
        if (testSpielGewonnen())
            System.out.println("Du hast das Spiel nach Abgabe von " + schuessen + " Schüssen gewonnen.");
        else {
            System.out.println("Du hast das Spiel nach Abgabe von 49 Schüssen verloren.");
        }
    }


    private boolean testSpielGewonnen() {
        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 7; j++) {
                if (spielfeld[i][j].equals("1")) {
                    return false;
                }
            }
        return true;
    }

    private boolean testKoor(String koordinaten) {
        boolean test = (koordinaten.length() == 2);
        test = test && (Character.isLetter(koordinaten.charAt(0))) && (koordinaten.charAt(0) >= 'a') && (koordinaten.charAt(0) <= 'g');
        test = test && (Character.isDigit(koordinaten.charAt(1))) && (koordinaten.charAt(1) >= '1') && (koordinaten.charAt(1) <= '7');

        return test;
    }

    private String readStr() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Gib Deine Schusskoordinaten in Form <Spalte><Zeile> ein:");
        return reader.next();
    }
}
