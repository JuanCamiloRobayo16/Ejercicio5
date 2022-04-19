/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author GaMerJ16
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //Variables
       int nP = 0;
    int suma = 0;

    int x = Integer.parseInt(JOptionPane.showInputDialog("Digite x: "));
    int y = Integer.parseInt(JOptionPane.showInputDialog("Digite y: "));
     double promedio = 0;
    
    int i = x ;
    while(i <= y)
    {
      if(i % 5 == 0)
      {
          nP = nP + 1; 
          suma = i;
          for (int j = 0; j <= y; j++) 
          {
            suma = suma + 5;
            promedio = ((suma - 80)/nP);
          }
      }
      
      i++;
    //Salida
    JOptionPane.showMessageDialog(null,"Cant. N°:" + nP + "\nSuma " + Math.abs((suma - 80)) + "\nPromedio" + Math.abs(promedio));
    
    //Fin del programa
    System.exit(0);
    
}
}
}


