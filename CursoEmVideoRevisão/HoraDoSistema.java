//Bibliotecas importadas:
//Date para buscar a hora do sistema
//swing para exibir em uma janela para o usuário
import java.util.Date;
import javax.swing.*;
//Classe tem como objetivo gerar a hora atual do sistema e retornar essa informação para o usuário
public class HoraDoSistema{
    private Date hora;
    //Construtor
    public HoraDoSistema(){
        hora = new Date();
    }
    //Método de acesso Getter
    public Date getHora(){
        return hora;
    }
    //Método para exibit hora para o usuário
    public void verHora(){
        String txt = "A hora do sistema é: " + getHora().toString();
        JOptionPane.showMessageDialog(null, txt , "Título da Janela", 1);
    }
}