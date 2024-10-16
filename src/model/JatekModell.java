package model;

import java.util.Random;

public class JatekModell {

    private static Random rnd = new Random();
    private boolean[] ajtok;
    private int szam;
    private int jatekokSzama;
    private int cserekSzama;
    private int nemCserekSzama;

    public JatekModell() {
        jatekokSzama = 0;
        cserekSzama = 0;
        nemCserekSzama = 0;
        szam = rnd.nextInt(0, 3);
        ajtok = new boolean[3];
        ajtok[0] = false;
        ajtok[1] = false;
        ajtok[2] = false;

        ajtok[szam] = true;

    }

    public void ujJatek() {
        szam = rnd.nextInt(0, 3);
        ajtok[0] = false;
        ajtok[1] = false;
        ajtok[2] = false;

        ajtok[szam] = true;

    }

    public boolean[] getAjtok() {
        return ajtok;
    }

    public int getSzam() {
        return szam;
    }

    public void novelJatekokSzama(int jatekokSzama) {
        this.jatekokSzama++;
    }

    public void novelCserekSzama(int cserekSzama) {
        this.cserekSzama++;
    }

    public void novelNemCserekSzama(int nemCserekSzama) {
        this.nemCserekSzama++;
    }

    public int getJatekokSzama() {
        return jatekokSzama;
    }

    public int getCserekSzama() {
        return cserekSzama;
    }

    public int getNemCserekSzama() {
        return nemCserekSzama;
    }

}
