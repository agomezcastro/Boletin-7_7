

package boletin77;

/**
 *
 * @author agomezcastro
 */
public class Cadrado {
    private double lado;
    public Cadrado(double lado){
        this.lado=lado;
    }
    public double calcularArea(){
        double area;
        area= lado*lado;
        return area;
    }
    
}
