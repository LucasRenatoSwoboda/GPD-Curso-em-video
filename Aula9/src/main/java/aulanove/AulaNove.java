package aulanove;

import java.util.Scanner;

/**Estruturas condicionais:
 * Simples -> Limita o retorno a uma única condição.
 * Composta -> Há uma segregação de possibilidades com condicionais dentro de codicionais, ou até uma sequência de condicionais divergêntes.
 */

public class AulaNove {

    public static void main(String[] args) {
        
        //CONDICIONAL SIMPLES
        //Cria Teclado para leitura de dados
        Scanner teclado = new Scanner(System.in);
        //Solicita as notas 1 e 2 e calcula a média entre elas
        System.out.print("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        float med = (n1+n2)/2;
        //Retorna a média, se for acima de 9
        String ret= "";
        if (med >= 9)
            ret = " Parabéns!";
        System.out.printf("A média é: %.2f.%s", med, ret);     
        
        //CONDICIONAL COMPOSTA
        //Recebe ano de nascimento, subtrai do ano atual para ver a idade e retorna se é maior ou menor de idade.
        System.out.print("\nDigite o ano de nascimento com quatro digitos: ");
        int nasc = teclado.nextInt();
        System.out.printf("Você tem %s anos.\n", (2022-nasc));
        if ((2022-nasc) >= 18)
            System.out.println("Você é maior de idade!");
        else
            System.out.println("Você é menor de idade!");      
    }
}
