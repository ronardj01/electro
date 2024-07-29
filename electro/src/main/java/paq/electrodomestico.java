
 
 
package paq;

/**
 *
 * @author LUISA
 */
public abstract class electrodomestico {
    private float precioBase;
    private String color;
    private char consumoEnergetico;
    private float peso;
     
    // Constructores
    public electrodomestico() {
        this.precioBase = 100f;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5f;
    }

    public electrodomestico(float precioBase, float peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "blanco";
        this.consumoEnergetico = 'F';        
    }
    

    public electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {
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
}
