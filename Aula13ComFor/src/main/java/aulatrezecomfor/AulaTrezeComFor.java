package aulatrezecomfor;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class AulaTrezeComFor {

    public static void main(String[] args) {
        //Solicitar oa usuário a quantidade de cambalhotas
        int max;
        Scanner t = new Scanner(System.in);
        System.out.print("Quantas cambalhotas devem aparecer? ");
        max = t.nextInt();
        //Estrutura for para aplicar a cambolhata considerando a quantidade infomada pelo usuário
        for (int cc = 0; cc < max; cc++) {
            System.out.println("Cambalhota " + (cc + 1));
        }
    }
}