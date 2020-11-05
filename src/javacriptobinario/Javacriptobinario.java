package javacriptobinario;

import javax.swing.JOptionPane;


public class Javacriptobinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Cifrar cifrar = new Cifrar();
        Descifrar descifrar = new Descifrar();
        String mensaje = JOptionPane.showInputDialog("Cifrado de CriptoBinario\n\nPara iniciar ingrese el mensaje:");
        String ingreso = JOptionPane.showInputDialog("Para cifrar ingrese 1 o Para descifrar 2:");
        int accion = Integer.parseInt(ingreso);
        
        if (accion==1){
           cifrar.sMensaje = mensaje;
           cifrar.cifrado();
        }
        else if(accion==2){
           descifrar.sMensaje = mensaje;
           descifrar.descifrado();
        }
    }
}