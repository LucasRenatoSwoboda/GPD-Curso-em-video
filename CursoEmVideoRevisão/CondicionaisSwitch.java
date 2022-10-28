import javax.swing.JOptionPane;
// Classe aprendendo condicionais com pernas usando JOptionPane.
public class CondicionaisSwitch {
    public static void main (String [] args){
        int pernas;
        String tipo;
        pernas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas pernas o ser tem?", "Pergunta", 3));
        switch(pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Trípede";
                break;
            case 4: 
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            case 8: 
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        JOptionPane.showMessageDialog(null, String.format("<html> o ser é um <strong>%s</strong></html>", tipo),"Resposta",2); 
    }
}