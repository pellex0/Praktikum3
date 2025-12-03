
import java.util.ArrayList;

public class GeometrischeObjekte {
     private ArrayList<String> olist;

    public GeometrischeObjekte() {
        ArrayList<String> olist = new ArrayList<>();

    }
    private void add() {
    }
    private int getAnzahl() {
        return olist.size();
    }
    private double berechneGesamtesVolumen() {
        for(i = 0; i < olist.size(); i++) {
            double gesamtvolumen = gesamtvolumen + olist.get(i);
        return gesamtvolumen;
        }
    }
    private double berechneGesamteOberflaeche() {
        for(i = 0; i < olist.size(); i++) {
            double gesamtoberflaeche = gesamtoberflaeche + olist.get(i);
        }
        return  gesamtoberflaeche;
    }
    public void ausgeben() {
        System.out.println(olist.size() + olist.get() );
    }

}