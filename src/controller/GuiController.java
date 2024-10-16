package controller;

import ajtoFeladat.AjtoGUI;
import javax.swing.JButton;
import model.JatekModell;

public class GuiController {

    private final JatekModell modell;
    public final ajtoFeladat.AjtoGUI nezet;

    public GuiController() {
        this.modell = new JatekModell();
        this.nezet = new AjtoGUI();

        guiBeallitas();
        esemenyKezelo();
    }

    private void esemenyKezelo() {
        JButton gomb;

        gomb = nezet.getBtnElsoGomb();
        valasztasEsemeny(gomb, 0);

        gomb = nezet.getBtnMasodikGomb();
        valasztasEsemeny(gomb, 1);

        gomb = nezet.getBtnHarmadikGomb();
        valasztasEsemeny(gomb, 2);

        jatekUjrakezdese();
        jatekVege();
    }

    private void valasztasEsemeny(JButton gomb, int ajtoSzam) {
        gomb.addActionListener(e -> {
            int valasztas = nezet.dontes();
            if (ajtoSzam == modell.getSzam()) {
                if (valasztas == 0) {
                    nezet.kiiratas("Gratulálok nyertél egy autót");
                    modell.novelNemCserekSzama();
                    modell.novelJatekokSzama();
                } else {
                    modell.novelJatekokSzama();
                    nezet.kiiratas("Kecske volt az általad nyitott ajtó mögött");
                }
            } else {
                if (valasztas == 1) {
                    nezet.kiiratas("Gratulálok nyertél egy autót");
                    modell.novelCserekSzama();
                    modell.novelJatekokSzama();
                } else {
                    modell.novelJatekokSzama();
                    nezet.kiiratas("Kecske volt az általad nyitott ajtó mögött");
                }
            }
            gombEngedely(false);

        });
    }

    private void gombEngedely(boolean ertek) {

        JButton gomb1 = nezet.getBtnElsoGomb();
        JButton gomb2 = nezet.getBtnMasodikGomb();
        JButton gomb3 = nezet.getBtnHarmadikGomb();

        gomb1.setEnabled(ertek);
        gomb2.setEnabled(ertek);
        gomb3.setEnabled(ertek);
    }

    private void guiBeallitas() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nezet.setVisible(true);
            }
        });

    }

    private void jatekUjrakezdese() {
        JButton gomb = nezet.getBtnUjJatek();
        gomb.addActionListener(e -> {
            eredmenyBeallitas();
            gombEngedely(true);
            modell.ujJatek();
        });
    }

    private void eredmenyBeallitas() {
        nezet.getSpnCsereNelkul().setValue(modell.getNemCserekSzama());
        nezet.getSpnCserevel().setValue(modell.getCserekSzama());
    }

    private void jatekVege() {
        JButton gomb = nezet.getBtnJatekVege();
        gomb.addActionListener(e -> {
            eredmenyBeallitas();
            nezet.osszesito(modell.getJatekokSzama(), modell.getCserekSzama(), modell.getNemCserekSzama());
            nezet.getBtnUjJatek().setEnabled(false);
        });
    }

}
