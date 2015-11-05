

package boletin77;

import javax.swing.JOptionPane;


public class Boletin77 {

    
    public static void main(String[] args) {
        int num;
        String res;
        res= JOptionPane.showInputDialog("Teclee el numero 1 para area del cuadrado; numero 2 para area del triangulo; numero 3 para area del circulo");
        num= Integer.parseInt(res);
        switch(num){
            case 1:
                double lado;
                res= JOptionPane.showInputDialog("Introduzca lado");
                lado= Double.parseDouble(res);
                Cadrado cadrado1= new Cadrado(lado);
                System.out.println("El area el cuadrado es: "+ cadrado1.calcularArea());
                break;
            case 2:
                double altura;
                double base;
                res= JOptionPane.showInputDialog("Introduzca base");
                base= Double.parseDouble(res);
                res= JOptionPane.showInputDialog("Introduzca altura");
                altura= Double.parseDouble(res);
                Triangulo triangulo1= new Triangulo(base, altura);
                System.out.println("El area del triangulo es: "+ triangulo1.calcularArea());
                break;
            case 3:
                double radio;
                res= JOptionPane.showInputDialog("Introduzca radio");
                radio= Double.parseDouble(res);
                Circulo circulo1= new Circulo(radio);
                System.out.println("el area del circulo es: "+ circulo1.calcularArea());
                break;
        }
    }
    
}
