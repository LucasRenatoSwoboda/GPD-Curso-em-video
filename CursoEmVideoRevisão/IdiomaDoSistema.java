//Bibliotecas importadas
//Locale para buscar idioma do sistema
//swing para exibir em uma janela para o usuário 
import java.util.Locale;
import javax.swing.*;
//Classe para exibir para o usuário o idioma do sistema
public class IdiomaDoSistema{  
    private Locale idioma;
    //Construtor 
    public IdiomaDoSistema(){
        idioma = Locale.getDefault();
    }
    //Método de acesso Getter
    public Locale getIdioma(){
        return idioma;
    }
    //Método para mostrar em uma janela o idioma do sistema.
    public void exibeIdioma(){
        String txt = "O idioma do sistema é: " + getIdioma().getDisplayName();
        JOptionPane.showMessageDialog(null, txt, "Título da janela", 1);
    }
}