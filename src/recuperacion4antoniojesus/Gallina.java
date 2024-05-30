package recuperacion4antoniojesus;

public class Gallina extends Ave {
 
    private String cacareo = "GRRRRR";
    
    Gallina () {}
    
    Gallina (Habitat habitat, String comida, int longevidad, int periodoIncubacion) {
        super(habitat, comida, longevidad, periodoIncubacion);
    }
    
    public void setCacareo (String cacareo) { this.cacareo = cacareo; }
    
    public String getCacareo () { return cacareo; }
    
    public void rugir () { System.out.println(cacareo); }
    
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    public void desplazar () { System.out.println("Estoy volando con mucha dificultad"); }
}
