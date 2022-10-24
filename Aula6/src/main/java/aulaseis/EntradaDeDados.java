package aulaseis;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class EntradaDeDados {
    public static void main(String[] args) {
        
        // biblioteca scanner para leitura de dados
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual o nome do aluno? ");
        String nome = teclado.nextLine();
        System.out.printf("\nQual a nota de %s: ", nome);
        float nota = teclado.nextFloat();
        System.out.printf("\nA nota de %s é: %.2f", nome , nota);
        
        // Convertendo valores Int em String e valores String em Int (Pode utilizar o mesmo método para conversão de números reais
        
        int idade = 32;
        String idadeTxt = Integer.toString(idade);
        System.out.printf("\nA sua idade é %s: ", idade);
        
        String qtdFilhos = "3";
        int qtdFilhosInt = Integer.parseInt(qtdFilhos);
        
        System.out.printf("\nA quantidade de filhos é %s ",qtdFilhosInt);
        
    }
}
