
package boletin5;
/**
 *
 * @author Jano
 */
public class Coche {
    //ATRIBUTOS    
    private int velocidad ;
         
    //CONSTRUCTOR
    public Coche(){
        velocidad =0 ;
    }
    //GETTERS
         
    public int getVelocidad(){
        return velocidad;
    }
    //MÉTODOS
    public void acelerar(int velo){
        velocidad=velocidad+velo;
    }
    public void frenar(int velo){
        velocidad=velocidad-velo;
    }
    

}
