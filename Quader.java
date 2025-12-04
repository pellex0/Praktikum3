public class Quader implements GeometrischesObjekt {
    private double laenge;
    private double breite;
    private double hoehe;

    public Quader(double laenge, double breite, double hoehe) 
    throws GeometrischesObjektException {
            if (laenge <= 0){
                String message = "Quader: Parameter Laenge < 0; wert:"
                                + laenge;
                this.laenge = laenge;
                throw new GeometrischesObjektException(message);
            }   else if ( breite <= 0) {
                    String message = "Quader: Parameter Breite < 0; wert:"
                                + breite;
                throw new GeometrischesObjektException(message);
            }   else if (hoehe <= 0) {
                    String message = "Quader: Parameter Hoehe < 0; wert:"
                                + hoehe;
                throw new GeometrischesObjektException(message);
            }   else { 
                this.laenge = laenge;
                this.breite = breite;
                this.hoehe = hoehe;
            }
        } 

    private double getLaenge() {
        return laenge;
    }
    private double getBreite() {
        return breite;
    }
    private double getHoehe() {
        return hoehe;
    }
    public double getVolumen()  {
        return laenge * breite * hoehe;
    }
    public double getOberflaeche() {
        return ((laenge * breite) + (breite * hoehe) + (laenge * hoehe)) * 2;
    }
    @Override
    public String toString() {
        return "Quader mit Laenge = " + getLaenge()
                + ", Breite = " + getBreite()
                + ", Hoehe = " + getHoehe()
                + ", Volumen = " + getVolumen()
                + ", Oberflaeche = " + getOberflaeche();
    }// Methoden getVolumen und getOberflaeche aus Interface können nicht private sein 
}