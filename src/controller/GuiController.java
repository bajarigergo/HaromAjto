package controller;


import model.JatekModell;
import view.GuiNezet;

public class GuiController {
    private JatekModell modell;
    public GuiNezet nezet;
    private int jatekokSzama;
    private int cserekSzama;
    private int nemCserekSzama;

    public GuiController(JatekModell modell, GuiNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        jatekokSzama = 0;
        cserekSzama = 0;
        nemCserekSzama = 0;
    }
    public void dontes(int valasztas){
        if (modell.getSzam()==valasztas){
            
        }
    }
    
}

