/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_7.pkg12;

import javax.swing.JOptionPane;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Boletin2_712 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Ejercicio 7
        
        double n, renda;
        float i;
        int t;
        n= Double.parseDouble(JOptionPane.showInputDialog("Ejer7. Teclea Nominal:"));
        i= Float.parseFloat(JOptionPane.showInputDialog("Interes anual en %:"));
        t= Integer.parseInt(JOptionPane.showInputDialog("Tempo de concesion en meses:"));
        renda= n * Math.pow((1+i), t) * i / (Math.pow(1+i, t)-1);
        System.out.println(renda);
        
        //Ejercicio 8
        
        int grados = Integer.parseInt(JOptionPane.showInputDialog("Ejer8. Grados"));
        System.out.println(grados*1.8 + 32 +" farenheit");
        System.out.println(grados -273 +" kelvin");
        
        //Ejercicio 9
        
        int cien = Integer.parseInt(JOptionPane.showInputDialog("Ejer9.  Billetes de 100"));
        int veinte = Integer.parseInt(JOptionPane.showInputDialog("Billetes de 20"));
        int cinco = Integer.parseInt(JOptionPane.showInputDialog("Billetes de 5"));
        int uno = Integer.parseInt(JOptionPane.showInputDialog("Monedas de 1"));     
        int total = cien * 100 + veinte * 20 +  cinco * 5 + uno;
        System.out.println("Total " + total);
        
        //Ejercicio 10
        
        double euros = Double.parseDouble(JOptionPane.showInputDialog("Ejer10.  Euros"));
        double decien, deveinte, decinco, deuno;
        
        decien=euros/100;
        euros= euros%100;
        deveinte= euros/20;
        euros= euros%20;
        decinco= euros/5;
        euros= euros%5;
        deuno= euros/1;
                
        System.out.println("Nº 100 = " + (int)decien + " Nº 20 = " + (int)deveinte + " Nº 5 = " + (int)decinco+ " Nº 1 = "+(int)deuno);
        
        
        //Ejercicio 11 y 12
        
        float fixo = Float.parseFloat(JOptionPane.showInputDialog("Soldo"));
        float vendas = Float.parseFloat(JOptionPane.showInputDialog("Vendas"));
        float km = Float.parseFloat(JOptionPane.showInputDialog("Kilometros"));
        float dias = Float.parseFloat(JOptionPane.showInputDialog("Dietas"));
        double Final= ( fixo + vendas * 0.05 + km * 2 + 30 * dias -36)* 0.82;
        System.out.println("Soldo Final:  " + Final);
    }
    
}
