package controller;

import ajtoFeladat.AjtoGUI;
import javax.swing.JButton;
import javax.swing.JSpinner;
import model.JatekModell;

public class GuiController {

    private final JatekModell modell;
    public final ajtoFeladat.AjtoGUI nezet;

    public GuiController() {
        this.modell = new JatekModell();
        this.nezet = new AjtoGUI();

        guiBeallitas();
        esemenykezlesekMeghivasa();
        jatekUjrakezdese();
    }

    private void esemenykezlesekMeghivasa() {

        JButton gomb;

        gomb = nezet.getBtnElsoGomb();
        valasztasEsemenykezeles(gomb, 0);

        gomb = nezet.getBtnMasodikGomb();
        valasztasEsemenykezeles(gomb, 1);

        gomb = nezet.getBtnHarmadikGomb();
        valasztasEsemenykezeles(gomb, 2);

        jatekVege();

    }

    private void valasztasEsemenykezeles(JButton gomb, int ajtoSzam) {
        gomb.addActionListener(e -> {
            int valasztas = nezet.dontes();
            if (ajtoSzam == modell.getSzam()) {
                if (valasztas == 0) {
                    nezet.kiiratas("Gratulálok nyertél egy autót");
                    modell.novelNemCserekSzama(modell.getNemCserekSzama());
                    modell.novelJatekokSzama(modell.getJatekokSzama());
                } else {
                    modell.novelJatekokSzama(ajtoSzam);
                    nezet.kiiratas("Kecske volt az általad nyitott ajtó mögött");
                }
            } else {
                if (valasztas == 1) {
                    nezet.kiiratas("Gratulálok nyertél egy autót");
                    modell.novelCserekSzama(modell.getCserekSzama());
                    modell.novelJatekokSzama(modell.getJatekokSzama());
                } else {
                    modell.novelJatekokSzama(ajtoSzam);
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
