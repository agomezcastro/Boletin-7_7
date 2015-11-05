

package boletin77;

/**
 *
 * @author agomezcastro
 */
public class Circulo {
    private double radio;
    public final double PI=3.14;
    public Circulo(double radio){
        this.radio=radio;
    }
    public double calcularArea(){
        double area;
        area= this.PI*Math.pow(this.radio,2);
        return area;
    } 
}
