
package determinaciónparoipar;

import javax.swing.JOptionPane;

public class DeterminaciónParoIpar {

    public static void main(String[] args) {
        
        int num;
        
        num=Integer.parseInt(JOptionPane.showInputDialog("Digite su número Entero"));
        
        if (num<0){
            JOptionPane.showMessageDialog(null, "Su numero es negativo");
        }
        else{
            if (num>0){
            JOptionPane.showMessageDialog(null,"Su Numero positivo");
            }
            else{
            JOptionPane.showMessageDialog(null, "el numero es cero");
            }
        }
            
        
        if (num%2==0){
         JOptionPane.showMessageDialog(null,"Su numero es par");
        }
        else{
        JOptionPane.showMessageDialog(null, "Su numero es impar");
        }
            
        
        
    }
    
}
