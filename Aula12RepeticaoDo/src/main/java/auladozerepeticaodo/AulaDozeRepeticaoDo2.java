package auladozerepeticaodo;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class AulaDozeRepeticaoDo2 {
    public static void main(String[] args) {
        //Realizará a soma do número informado pelo usuário, enquanto ele digitar 'S' para continuar
        //Faz a verificação do case, caso o usuário digite s minuscolo transformará em maiusculo antes de verificar.
        int num, soma = 0;
        String resp, somaT = "";
        Scanner t = new Scanner(System.in);
        do {            
            System.out.print("Digite um número para a soma: ");
            num = t.nextInt();
            soma += num;
            System.out.print("Se quiser continuar o programa digite [S]: ");
            resp = t.next();
            resp = resp.toUpperCase();
            if (resp.equals("S")){
                System.out.printf("Você Digitou %s o sistema continuará. \n", resp);
                somaT += num + " + ";
            }
            else
                somaT += num + " = ";
        } while (resp.equals("S"));
        //Mostra para o usuário o resultado da soma.
        System.out.printf("O resultado da soma dos valores %s %s", somaT, soma);
    }
}
