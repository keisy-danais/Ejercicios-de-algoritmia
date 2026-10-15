
package conversiondegradocaf;

import javax.swing.JOptionPane;

public class ConversionDegradocaf {

    public static void main(String[] args) {
       
        float gFahrenheit, gCelsius;
        
        gCelsius=Float.parseFloat(JOptionPane.showInputDialog("Digite los grados Celsius"));
                gFahrenheit=(float) ((gCelsius*1.8)+32);
                JOptionPane.showMessageDialog(null, "En grados Fahrenheit es: "+gFahrenheit);
    }
    
}
