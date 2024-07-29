
package paq;

/**
 *
 * @author LUISA
 */
public class Television extends Electrodomestico {
    private byte resolucion;
    private boolean sintonizadorTDT;
    
    //Constructores
    
    public Television() {
        super();
        this.resolucion = (byte)20;
        this.sintonizadorTDT = false;
    }

    public Television(float precioBase, float peso) {
        super(precioBase, peso);
        this.resolucion = (byte)20;
        this.sintonizadorTDT = false;
    }

    public Television(byte resolucion, boolean sintonizadorTDT) {
        super();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    //Getters

    public byte getResolucion() {
        return resolucion;
    }

    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }
    //Setters
    
    public void setResolucion(byte resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }   
    //Metodos

    @Override
    public String toString() {
        return "Television{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }        
}
