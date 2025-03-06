package pkg13;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        
        double litrosRefresco = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros de refresco desejada: "));
        
        if (litrosRefresco < 0) {
            JOptionPane.showMessageDialog(null, "Erro: A quantidade de refresco não pode ser negativa.");
        } else {
            double litrosAgua = litrosRefresco * 0.8;
            double litrosSuco = litrosRefresco * 0.2;
            
            JOptionPane.showMessageDialog(null, "Serão necessários " + litrosAgua + " litros de água e " + litrosSuco + " litros de suco.");
        }
    }
           }
   
