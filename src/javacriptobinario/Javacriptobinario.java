/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacriptobinario;

import javax.swing.JOptionPane;


public class Javacriptobinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
String sMensaje = JOptionPane.showInputDialog("Cifrado de CriptoBinario\n\nPara iniciar ingrese el mensaje:");
        String binario="";
        for (int j=0;j < sMensaje.length();j++){
                char EXT = sMensaje.charAt(j);
                
                //System.out.print(matrizGronsfeld [fila][columna]);
                
            
        char characterValue = EXT;
        int asciiValue = (int) characterValue;
        System.out.println(asciiValue);
        
        for (int i=7;i >= 0;i--)
        {
            double a= Math.pow (2, i);
            int x = (int) a;
            
            System.out.println(x);
                if (asciiValue >= x){
                    binario = binario + 1;
                    asciiValue  = asciiValue - x;
                }
                else{
                    binario= binario+0;
                }
        
    }
        System.out.println(binario);
    
}
}
}