package auladozeexerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class AulaDozeExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int qtdN = 0, num = 9999, qtdP = 0, qtdI = 0, qtdMC = 0;
        double media = 0, soma = 0;
        //Enquando usuário digitar valores diferentes de 0 ficará no loop
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("<html>Digite um número. <br><em>Ao informar 0 interrompe o programa.</em></html>"));
            if (num !=0 )
                qtdN++;
            //Verifica se é par ou impar e joga no contador de quantidades dessas identificações.
            if (((num % 2) == 0) & (num !=0)) 
                qtdP++;
            if (((num % 2) == 1) & (num !=0))
                qtdI++;
            //Verifica se é maior de 100, se for acrescenta 1 ao contador 
            if (num > 100)
                qtdMC++;
            //Realiza a soma e a média dos valores
            soma += (double)num;
            media = (soma / qtdN);
        }while(num != 0);
        //Mostra o resultado para o usuário em nova janela
        JOptionPane.showMessageDialog(null, "<html>Resultado:<br><hr><br>Total de valores: " + qtdN + "<br>Total de Pares: " + qtdP + "<br>Total de Ímpares: " + qtdI + "<br>Acima de 100: " + qtdMC + "<br>Média dos valores: " + media + "</html>");
    }
}
