
import java.util.ArrayList;
import java.util.List;

public class GeometrischeObjekte {
     private List<GeometrischeObjekte> olist;

    public GeometrischeObjekte() {
        this.olist = new ArrayList<>();

    }
    private void add(GeometrischeObjekte objekte) {
        olist.add(objekte);
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