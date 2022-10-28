//Bibliotecas importadas
//Toolkit para buscar a resolução da tela
//swing para mostrar janela interativa para o usuário
import java.awt.Toolkit;
import javax.swing.*;
//Classe para exibir a resolução do sistema para o usuário.
public class ResolucaoDoSistema{
    private Toolkit awtTool;
    double eixoX, eixoY;
    //Construtor
    public ResolucaoDoSistema(){
        awtTool = Toolkit.getDefaultToolkit();
        eixoX = awtTool.getScreenSize().getWidth();
        eixoY = awtTool.getScreenSize().getHeight();
    }
    //Métodos Getter
    public double getEixoX(){
        return eixoX;
    }
    public double getEixoY(){
        return eixoY;
    }
    //Método para mostrar em uma janela a resolução do sistema para o usuário
    public void exibeResolucao(){
        String txt = "A resolução do sistema é: " + String.format("%.2f",eixoX) + " x " + String.format("%.2f",eixoY);
        JOptionPane.showMessageDialog(null, txt, "Resolução", 1);
    }
}