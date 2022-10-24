package auladez;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * 
 */
public class AulaDez {
    public static void main(String[] args) {
        
        //Inicia variaveis para calculo da idade e o objeto t para scannear o valor do usuário
        int nasc, idade;
        int anoAtual = Integer.parseInt(Year.now().toString());
        Scanner t = new Scanner(System.in);
        //Solicita ao usuário o nome de nascimento
        System.out.print("Digite o ano de nascimento: ");
        nasc = t.nextInt();
        //Calcula a idade
        idade = (int)anoAtual - nasc;
        //Condicional para retornar se o voto é obrigatório ou não por faixa etária.
        System.out.printf("Sua idade é %s. ", idade);
        if ((idade < 16) & (idade >= 0))
            System.out.println("\nMenores de 16 anos não podem votar.");
        else if ((idade >= 16) & (idade < 18))
            System.out.println("\nEntre 16 e 18 anos o voto NÃO é obrigatório.");
        else if ((idade > 18) && (idade <= 70))
            System.out.println("\nEntre 18 e 70 anos o voto É obrigatório.");
        else if ((idade > 70) && (idade <= 150))
            System.out.println("Para pessoas com mais de 70 anos o voto NÃO é obrigatório");
        else if ((idade < 0))
            System.out.println("O ano de nascimento não pode ser posterior ao ano atual.");
        else if (idade > 1000)
            System.out.println("Isso é impossível Kakaroto, sua idade é de mais de 1000!");
        else 
            System.out.println("Idade inválida!");           
    }
}
