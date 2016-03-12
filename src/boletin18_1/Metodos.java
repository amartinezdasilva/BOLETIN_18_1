
package boletin18_1;


public class Metodos {
    int[]numeros = new int[6];
    
   public void cargarArray(){
    for(int i = 0;i<6;i++){
        numeros[i] = (int)(Math.random()*50+1);
       System.out.println("**"+numeros[i]);
    }
        
   }
   
   public void visualizarArray(){
       for(int i=numeros.length-1;i>=0;i--)
    System.out.println(numeros[i]);
   
   }
   
}
