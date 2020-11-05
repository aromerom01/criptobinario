
package javacriptobinario;


public class Cifrar {
 
    
    public String sMensaje;
    String binario="";
    public void cifrado() {
   
        for (int j=0;j < sMensaje.length();j++){
                char EXT = sMensaje.charAt(j);
        char characterValue = EXT;
        int asciiValue = (int) characterValue;
        //System.out.println(asciiValue);
        
        for (int i=7;i >= 0;i--)
        {
            double a= Math.pow (2, i);
            int x = (int) a;
            
            //System.out.println(x);
                if (asciiValue >= x){
                    binario = binario + 1;
                    asciiValue  = asciiValue - x;
                }
                else{
                    binario= binario+0;
                }
        
    }
        
        }
System.out.println(binario);
    }
}
    
    
    

