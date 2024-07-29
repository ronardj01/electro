
 
 
package paq;

/**
 *
 * @author LUISA
 */
public abstract class Electrodomestico {
    protected float precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected float peso;
    
    private final float PRECIOBASE = 100;
    private final String COLOR = "blanco";   
    private  final char CONSUMOENERGETICO = 'F';
    private final float PESO = 5;
        
    // Constructores
    public Electrodomestico() {
        this.precioBase = this.PRECIOBASE;
        this.color = this.COLOR;
        this.consumoEnergetico = this.CONSUMOENERGETICO;
        this.peso = this.PESO;
    }

    public Electrodomestico(float precioBase, float peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = this.COLOR;
        this.consumoEnergetico = this.CONSUMOENERGETICO;        
    }
    
    public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        
        // Getters
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }
    
    
    // Setters
    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }  

    @Override
    public String toString() {
        return " " + "precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso;
    }
    
    public abstract float precioFinal();
}
