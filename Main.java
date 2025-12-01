public static void main (
    String[] args
) { 
    try {
        Quader quader1 = new Quader(0,4,4);
        System.out.println(quader1.toString());
    } catch (GeometrischesObjektException e) {
        System.out.println(e);
    }
    try {
        Wuerfel wuerfel1 = new Wuerfel(4);
        System.out.println(wuerfel1.toString());
    } catch (GeometrischesObjektException e) {
        System.out.println(e);
    }
}
