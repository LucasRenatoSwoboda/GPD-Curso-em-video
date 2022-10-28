import javax.swing.JOptionPane;
public class BuscarUmCaracter{
    public static void main(String []args){
        String textoAleatorio = JOptionPane.showInputDialog(null,"Digite um texto qualquer: ", "Entrada texto", 1);
        char charac [] = new char[textoAleatorio.length()];   
        for (int i = 0; i < charac.length; i++){
            charac[i] = textoAleatorio.charAt(i);
        }
        for (int i = 0; i < charac.length; i++) {
            JOptionPane.showMessageDialog(null,String.format("A letra na posição %s é '%s'",i,charac[i]));
            String charcA = Character.toString(charac[i]);
            if (charcA.equals("a")){
                JOptionPane.showMessageDialog(null, "Essa foi a letra A que estávamos procurando");
            }
        }
        
    }
}