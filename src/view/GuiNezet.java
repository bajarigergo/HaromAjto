package view;

import javax.swing.JOptionPane;

public class GuiNezet {
    
    public int dontes(String uzenet){
        String[] options = { "választott ajtó", "másik ajtó"};
        int valasztas = JOptionPane.showOptionDialog(null, "Az egyik zárt ajtó biztosan kecskét rejt, szeretnéd megváltoztatni a döntésed? :", "Dönts!",0, 2, null, options, options[0]);
        return valasztas;
    }
    public void osszesito(int jatekokSzama, int cserekSzama, int nemCserekSzama){
        JOptionPane.showMessageDialog(null, "Összes játék száma: "+jatekokSzama+"\nNyert körök amikben cseréltél: "+cserekSzama+"\nNyert körök amikben nem cseréltél: ");
    }
}
