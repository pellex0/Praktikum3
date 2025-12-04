public class GeometrischeObjekteMain {
    public static void main (
        String[] args
    ) { 
        GeometrischeObjekte olist = new GeometrischeObjekte();
        
        try {
            Quader quader = new Quader(3,4,5);
            olist.add(quader);
        } catch (GeometrischesObjektException e) {
            System.out.println(e);
        }
          try {
            Quader quader = new Quader(16,-1,15);
            olist.add(quader);
        } catch (GeometrischesObjektException e) {
            System.out.println(e);
        }
          try {
            Quader quader = new Quader(200,200,200);
            olist.add(quader);
        } catch (GeometrischesObjektException e) {
            System.out.println(e);
        }
        
        
        try {
            Wuerfel wuerfel = new Wuerfel(-207.15);
            olist.add(wuerfel);
        } catch (GeometrischesObjektException e) {
            System.out.println(e);
        }   try {
            Wuerfel wuerfel = new Wuerfel(4);
            olist.add(wuerfel);
        } catch (GeometrischesObjektException e) {
            System.out.println(e);
        }   try {
            Wuerfel wuerfel = new Wuerfel(200);
            olist.add(wuerfel);
        } catch (GeometrischesObjektException e) {
            System.out.println(e);
        }
        olist.ausgeben();
    }
}