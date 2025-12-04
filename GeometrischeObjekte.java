
import java.util.ArrayList;
import java.util.List;

public class GeometrischeObjekte {
     private List<GeometrischesObjekt> olist;
     private double gesamtvolumen;
     private double gesamtoberflaeche;

    public GeometrischeObjekte() {
        this.olist = new ArrayList<>();
    }
    
    public void add(GeometrischesObjekt objekte) {
        olist.add(objekte);
    }
    private int getAnzahl() {
        return olist.size();
    }
    private double berechneGesamtesVolumen() {
        for(GeometrischesObjekt objekte : olist) {
            gesamtvolumen =  gesamtvolumen + objekte.getVolumen();
        }
        return gesamtvolumen;
    }
    private double berechneGesamteOberflaeche() {
        for(GeometrischesObjekt objekte : olist) {
            gesamtoberflaeche = gesamtoberflaeche + objekte.getOberflaeche();
        }
        return gesamtoberflaeche;
    }
    public void ausgeben() {
        System.out.println( "Anzahl geometrischer Objekte: " + getAnzahl());
        System.out.print("Gespeicherte Objekte: ");
                            for (GeometrischesObjekt objekte : olist) {
                                System.out.println(objekte.toString());
                            };
        System.out.println("Gesamtvolumen der Objekte " + berechneGesamtesVolumen() + ", "); 
        System.out.println("Gesamtoberflaeche der Objekte " + berechneGesamteOberflaeche());
    }
}