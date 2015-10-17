package boletin5;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Boletin5 {

    public static void main(String[] args) {
       Coche primerCoche=new Coche();
       JOptionPane.showMessageDialog(null, "La velocidad inicial es : "+primerCoche.getVelocidad());
       String aceleraString = JOptionPane.showInputDialog("Teclea la velocidad para acelerar:");
       primerCoche.acelerar(Integer.parseInt(aceleraString));
       JOptionPane.showMessageDialog(null, "La velocidad tras acelerar es : "+primerCoche.getVelocidad());
       String frenaString = JOptionPane.showInputDialog("Teclea la velocidad para frenar:");
       primerCoche.frenar(Integer.parseInt(frenaString));
       JOptionPane.showMessageDialog(null, "La velocidad tras frenar es : "+primerCoche.getVelocidad());
       
    }
    
}
