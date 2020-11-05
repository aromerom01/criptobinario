/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacriptobinario;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres Julian Romero
 */
public class Javacriptobinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Cifrar cifrar = new Cifrar();
        
       cifrar.sMensaje = JOptionPane.showInputDialog("Cifrado de CriptoBinario\n\nPara iniciar ingrese el mensaje:");
       String ingreso = JOptionPane.showInputDialog("Para cifrar ingrese 1 o Para descifrar 2:");
       int accion = Integer.parseInt(ingreso);
       if (accion==1){
     
              
       cifrar.cifrado();
       }
       }
}