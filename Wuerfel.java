public class Wuerfel implements GeometrischesObjekt {
    private double seitenlaenge;

    public Wuerfel(double seitenlaenge) throws GeometrischesObjektException {
        if (seitenlaenge <= 0) {
            throw new GeometrischesObjektException("Wuerfel: Parameter Seitenlaenge < 0; wert:" + seitenlaenge);
        }      
        this.seitenlaenge = seitenlaenge;       
    }

    private double getSeitenlaenge() {
        return seitenlaenge;
    }
    public double getVolumen() {
        return seitenlaenge * seitenlaenge * seitenlaenge;
    }
    public double getOberflaeche() {
        return (seitenlaenge * seitenlaenge) * 6;
    }
    @Override
    public String toString() {
        return "Wuerfel mit Seitenlaenge = " + getSeitenlaenge()
                + ", Volumen = " + getVolumen()
                + ", Oberflaeche = " + getOberflaeche();
    }// Methoden getVolumen und getOberflaeche aus Interface können nicht private sein 
}
