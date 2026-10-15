
package areayperimetro;

import javax.swing.JOptionPane;

public class AreayPerimetro {

   
    public static void main(String[] args) {
        
     int altura, base, area, perimetro;
     
     altura=Integer.parseInt(JOptionPane.showInputDialog("Digite la altura de su rectangulo"));
     base=Integer.parseInt(JOptionPane.showInputDialog("Digite la base"));
        
      if((altura>base) || (base>altura)){
      area=base*altura;
      perimetro=2*(base+altura);
      JOptionPane.showMessageDialog(null,"Su area es: "+area+ "\n su perimetro es: "+perimetro);
      }  
      else {
      JOptionPane.showMessageDialog(null,"Se ha producido un ERROR");
      }
    }
    
}
