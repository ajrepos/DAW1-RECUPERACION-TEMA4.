package recuperacion4antoniojesus;

/**
 * La clase Leon representa a un león, un tipo específico de mamífero.
 * Hereda de la clase Mamifero y agrega características y comportamientos únicos de los leones.
 */
public class Leon extends Mamifero {
 
    /** El sonido que hace el león, por defecto es "GRRRRR". */
    private String rugido = "GRRRRR";
    
    /**
     * Constructor por defecto de la clase Leon.
     * Crea un león con valores predeterminados.
     */
    Leon () {}
    
    /**
     * Constructor de la clase Leon que permite definir su hábitat, tipo de comida,
     * esperanza de vida y periodo de lactancia.
     * 
     * @param habitat El lugar donde vive el león.
     * @param comida La dieta del león.
     * @param longevidad La cantidad de años que vive el león.
     * @param periodoLactancia Los meses que dura la lactancia del león.
     */
    Leon (Habitat habitat, String comida, int longevidad, int periodoLactancia) {
        super(habitat, comida, longevidad, periodoLactancia);
    }
    
    /**
     * Establece el sonido que hace el león.
     * 
     * @param rugido El nuevo sonido del león.
     */
    public void setRugido (String rugido) { this.rugido = rugido; }
    
    /**
     * Devuelve el sonido actual del león.
     * 
     * @return El rugido del león.
     */
    public String getRugido () { return rugido; }
    
    /**
     * Hace que el león ruja, imprimiendo su rugido en la consola.
     */
    public void rugir () { System.out.println(rugido); }
    
    /**
     * Hace que el león coma, imprimiendo un mensaje con su tipo de comida.
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     * Hace que el león se desplace en busca de comida, imprimiendo un mensaje con su dieta.
     */
    public void desplazar () { System.out.println("Estoy en busca de " + comida); }
}
