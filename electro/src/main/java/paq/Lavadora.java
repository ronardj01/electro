package paq;

/**
 *
 * @author ronar
 */
public class Lavadora extends Electrodomestico{
    private float carga;
    private final  float cargaDef = 5f;
    
    //Constructores
    public Lavadora() {
        super();
        this.carga = cargaDef;
    }

    public Lavadora(float precioBase, float peso) {
        super(precioBase, peso);
        this.carga = cargaDef;
    }

    public Lavadora(float precioBase, String color, char consumoEnergetico, float peso, float carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    //Getters
    public float getCarga() {
        return carga;
    }

    public float getCargaDef() {
        return cargaDef;
    }
    
    //Setters
    public void setCarga(float carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + ", cargaDef=" + cargaDef + super.toString() +'}';
    } 
}
