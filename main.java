/**
 *
 * @author Daw120
 * 
 * 10. Se realiza una competición donde cada participante escribe un algoritmo 
       en papel y lo lanza, ganando quien consiga lanzarlo más lejos. 

* La peculiaridad del concurso es que la longitud del lanzamiento se mide en metros, 
  con tantos decimales como se desee, pero el ranking solo se tiene en cuenta la 
  longitud en centímetros sin decimales. 

* Por ejemplo, para un lanzamiento de 12,3456 metros, solo se contabilizan 1234 centímetros.

  Realiza un programa que solicite la longitud (en metros) de un lanzamiento y 
  muestre la parte entera correspondiente en centímetros

*/
package com.solomongo.ejercicio10_hoja3;
import javax.swing.JOptionPane;
public class Ejercicio10_Hoja3 {
    public static void main(String[] args) {
    
        String lanzamientoMTRS;  // string lo escribirá un@ user
        double lanzamientoRankingCMS;  // si valor decimal se pone double
        double resultadoCMS;
        
        lanzamientoMTRS=JOptionPane.showInputDialog("Mete la distancia, en metros:");
        lanzamientoRankingCMS=Double.parseDouble(lanzamientoMTRS); // metodo Double..     
        System.out.printf("\n\tDistancia introducida en metros es: "+lanzamientoMTRS+" metros.");  
        
       resultadoCMS=100*lanzamientoRankingCMS;
       System.out.printf("\n\tDistancia en centimetros corresponde a: %,.0f" , resultadoCMS); // SEPARADO f COMA!!
       //System.out.printf("\n\tDistancia en centimetros es:"+(lanzamientoRankingCMS*1000)); // MI CAGADA
       //System.out.printf((lanzamientoRankingCMS*1000)+"\n\tDistancia en centimetros es:"); // EL ARREGLO
                            // opera antes (entre parentesis)+ "el texto"..... 
        System.out.println(" cms.\n");
    }
}
