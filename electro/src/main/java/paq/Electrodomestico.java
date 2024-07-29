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

    protected final float PRECIOBASE = 100;
    protected final String COLOR = "blanco";
    protected final char CONSUMOENERGETICO = 'F';
    protected final float PESO = 5;

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
    }

    // Getters
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

    public float precioFinal() {
        switch (this.consumoEnergetico) {
            case 'A' ->
                this.precioBase += 100;
            case 'B' ->
                this.precioBase += 80;
            case 'C' ->
                this.precioBase += 60;
            case 'D' ->
                this.precioBase += 50;
            case 'E' ->
                this.precioBase += 30;
            case 'F' ->
                this.precioBase += 10;
        }

        if (this.peso < 19) {
            this.precioBase += 10;
        } else if (this.peso < 49) {
            this.precioBase +=  50;
        } else if (this.peso < 79) {
            this.precioBase += 80;
        } else {
            this.precioBase += 100;
        }
        return precioBase;
    }
}
