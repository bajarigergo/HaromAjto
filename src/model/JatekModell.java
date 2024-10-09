package model;

import java.util.Random;

public class JatekModell {
    private static Random rnd = new Random();
    private Object[] ajtok;
    private Ajto ajto1;
    private Ajto ajto2;
    private Ajto ajto3;
    private int szam;


    public JatekModell() {
        szam = rnd.nextInt(0, 3);
        ajtok=new Object[3];
        if(szam==0){
            ajto1 = new Ajto(true);
            ajto2 = new Ajto(false);
            ajto3 = new Ajto(false);
        }else{
            ajto1 = new Ajto(false);
            if(szam==1){
                ajto2 = new Ajto(true);
                ajto3 = new Ajto(false);
            }else{
                ajto2 = new Ajto(false);
                ajto3 = new Ajto(true);
            }
        }
        ajtok[0] = ajto1;
        ajtok[1] = ajto2;
        ajtok[2] = ajto3;
    }

    public Object[] getAjtok() {
        return ajtok;
    }

    public int getSzam() {
        return szam;
    }
    
    
}
