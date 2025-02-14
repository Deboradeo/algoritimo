package javaapplication51;
import javax.swing.JOptionPane;
public class JavaApplication51 {

    
    public static void main(String[] args) {
        
    int velho = 55;
    int novo = 50;
    int anosAtras = 0;
    
    while ((velho - anosAtras)/ 2!= (novo - anosAtras))
    {
        anosAtras++;
    }
        JOptionPane.showMessageDialog(null,"O irmão mais velho tinha o dobro da idade do mais novo há"+ anosAtras +"anos");
        
    }
    
}
