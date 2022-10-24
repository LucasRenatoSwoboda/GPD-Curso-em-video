package aulaquatro;

import java.awt.Toolkit;

/**
 *
 * @author lucas
 */
public class ResolucaoDaTela {
    public static void main(String[] args){
        //Programa do exercício proposto
        Toolkit tamanhoTela = Toolkit.getDefaultToolkit();
        double x = tamanhoTela.getScreenSize().getWidth();
        double y = tamanhoTela.getScreenSize().getHeight();
        System.out.printf("Sua tela tem a resolução: %.2f x %.2f\n\n", x, y, ".");
        
        //Testes com o pacote
        System.out.println("Usando getScreenResolution(): '" + tamanhoTela.getScreenResolution() + "'");
    }
}
