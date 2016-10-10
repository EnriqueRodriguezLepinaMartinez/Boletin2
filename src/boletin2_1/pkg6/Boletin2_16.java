/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1.pkg6;

import javax.swing.JOptionPane;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Boletin2_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 1
        
        int base = 3;
        int altura = 4;
        int area = base * altura;
    
        System.out.println("Ejer1. El area del triangulo es " + area);
        
        // Ejercicio 2
        
        int lado = 4;
        int areacuadrado = lado * 2;
        System.out.println("Ejer2. El area del cuadrado es " + areacuadrado);
        
        // Ejercicio 3
        
        double euros = Float.parseFloat(JOptionPane.showInputDialog("Ejer3. euros"));
        double dolares = 0.89;
        double conversion = euros * dolares;
        System.out.println( "Ejer3. " + euros + " euros son " + conversion + " dolares");
        
        // Ejercicio 4
        
        int num1 = 4;
        int num2 = 2;
        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        int cociente = num1 / num2;
        System.out.println( "Ejer 4. La suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println( "La resta de " + num1 + " y " + num2 + " es: " + resta);
        System.out.println( "El producto de " + num1 + " y " + num2 + " es: " + producto);
        System.out.println( "El cociente de " + num1 + " y " + num2 + " es: " + cociente);
        
        // Ejercicio 5
        
        final int milla = 1852;
        int marina = Integer.parseInt(JOptionPane.showInputDialog("Ejer5. Millas Mariñas"));
        int metros = milla * 5;
        System.out.println( "Ejer5." + marina + " millas mariñas e igual a: " + metros + " metros.");
        
        //Ejercicio 6
        
        float pagado, tarifa, operacion, operacion2 ;
        tarifa = Float.parseFloat(JOptionPane.showInputDialog("Tarifa:"));
        pagado = Float.parseFloat(JOptionPane.showInputDialog("Pagado:"));
        operacion = (tarifa-pagado)/tarifa*100 ;
        System.out.println("Ejer6- " + operacion + "%");
    }
    
}
