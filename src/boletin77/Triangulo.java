

package boletin77;

/**
 *
 * @author agomezcastro
 */
public class Triangulo {
    private double altura;
    private double base;
    public Triangulo(double altura, double base){
        this.altura=altura;
        this.base=base;
    }
    public double calcularArea(){
        double area;
        area= this.altura*this.base/2;
        return area;
    }
}
