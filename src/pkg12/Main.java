package pkg12;
import javax.swing.JOptionPane;
public class Main {

   
    public static void main(String[] args) {
      
         int quantidadeSanduiches;
        double queijo, presunto, carne;
        
        quantidadeSanduiches = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de sanduíches a fazer: "));
        
        if (quantidadeSanduiches < 0) {
            JOptionPane.showMessageDialog(null, "Erro: A quantidade de sanduíches não pode ser negativa.");
        } else {
            queijo = (quantidadeSanduiches * 2 * 50) / 1000.0;
            presunto = (quantidadeSanduiches * 1 * 50) / 1000.0;
            carne = (quantidadeSanduiches * 1 * 100) / 1000.0;
            
            JOptionPane.showMessageDialog(null, "Quantidade de queijo necessária: " + queijo + " kg" +
                    "\nQuantidade de presunto necessária: " + presunto + " kg" +
                    "\nQuantidade de carne necessária: " + carne + " kg");
        }
                   
    }
    
}
/*
Variável	Valor Inicial	Após Entrada de Dados	Cálculo Hambúrguer	Cálculo Queijo	  Cálculo Presunto	  Valor Final
 s_quantidade	       -	      "10"	               -	               -	         -	             "10"
quantidade	       -	       10	               -	               -	         -	              10
hambúrguer	      100	       -	        100 * 10 / 1000	               -	         -	             1.0 (kg)
queijo	50	       -	       -	       50 * 10 * 2 / 1000	       -	         -                   1.0 (kg)
presunto	      50	       -	               -	               -	     50 * 10 / 1000	     0.5 (kg)
*/
