package aulaquatorzevetores;

import java.time.Year;

/**
 *
 * @author lucas
 */
public class AulaQuatorze {

    public static void main(String[] args) {
        //Declarando lista sem atribuir valores, apenas definindo o tamanho da lista
        int n[] = new int [4];
        n[0] = 3;
        n[1] = 5;
        n[2] = 8;
        n[3] = 2;
        //Declarando lista já com os elementos da lista.
        int n1 [] = {3, 5, 8, 2};
        //Mostra valores da lista n
        for (int i = 0; i < n.length; i++) {
            System.out.println("n[" + i + "] = " + n[i]);
        }
        //Mostra valores da lista n1
        for (int i = 0; i < n1.length; i++) {
            System.out.println("n1[" + i + "] = " + n[i]);
        }
        //Declara meses e dias de cada mês
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //Cria variável com ano atual e imprime informações do dia e ano considerando se é ano bissexto ou não.
        Year ano = Year.of(2024); //Variável para teste do ano bissexto
        Year anoAtual = Year.now();
        for (int i = 0; i < mes.length; i++) {
            if ((Integer.parseInt(anoAtual.toString())%4 == 0) && (mes[i].equals("Fev")))
                System.out.printf("O mês %s tem %s dias.\n", mes[i], tot[i]+1);    
            else
                System.out.printf("O mês %s tem %s dias.\n", mes[i], tot[i]);
        }
        //For it
        for (String m: mes) {
            System.out.println("Mês = " + m);
        }
    }
}
