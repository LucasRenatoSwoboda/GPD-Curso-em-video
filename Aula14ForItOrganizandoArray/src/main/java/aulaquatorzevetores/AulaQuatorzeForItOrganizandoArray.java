package aulaquatorzevetores;

import java.util.Arrays;

/**
 *
 * @author lucas
 */
public class AulaQuatorzeForItOrganizandoArray {

    public static void main(String[] args) {
        //Utilizando método para organizar Arrays        
        double valor[] = {3.5, 10.85, 1.25, 7.96, 8.5, 0.98};
        Arrays.sort(valor);
        for(double v: valor){
            System.out.println(v);
        }
        //Buscando valores em uma lista com Arrays.binarySearch (Vai retornar a posição do valor)
        int posicao = Arrays.binarySearch(valor, 7.96);
        System.out.println(posicao);
        //Preenchimento do vetor automático
        int num[] = new int[5];
        Arrays.fill(num, 8);
        for (int v : num) {
            System.out.println(v);
        }
    }
}
