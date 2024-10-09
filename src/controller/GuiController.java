package controller;

import java.util.Random;

import model.JatekModell;
import view.GuiNezet;

public class GuiController {
    private static Random rnd = new Random();
    private JatekModell modell;
    private GuiNezet nezet;

    public GuiController(JatekModell modell, GuiNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
    }
    
}

