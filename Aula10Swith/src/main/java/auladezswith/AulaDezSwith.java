/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auladezswith;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class AulaDezSwith {
    public static void main(String[] args) {
        //Variaveis e objetos iniciados        
        int qtdPernas;
        String tipo;
        Scanner t = new Scanner(System.in);
        //Solicita a quantidade de pernas ao usuário e guarda na variável
        System.out.print("Digite a quantidade de pernas: ");
        qtdPernas = t.nextInt();
        //Testa pela quantidade de pernas em qual tipo se encaixa
        switch (qtdPernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6,8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        //Mostra o resultado de pernas x tipo.
        System.out.printf("\nCom %s pernas o tipo é: %s.", qtdPernas, tipo);
    }
}
