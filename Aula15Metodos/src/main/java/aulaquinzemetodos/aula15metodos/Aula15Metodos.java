package aulaquinzemetodos.aula15metodos;

/**
 *
 * @author lucas
 */
public class Aula15Metodos {
    //Métodos para soma
    static void soma(int a, int b){
        int soma = a + b;
        System.out.printf("A soma entre %s + %s = %s\n", a, b, soma);
    }
    static int somaDois(int a, int b){
        int soma = a + b;
        return soma;
    }
    public static void main(String[] args) {
        System.out.println("Começou o programa.");
        soma(10, 5);
        System.out.println("Retorno com o método somaDois abaixo:");
        int soma = somaDois(5,2);
        System.out.printf("A soma entre 5 + 2 = %s", soma);
    }
}
