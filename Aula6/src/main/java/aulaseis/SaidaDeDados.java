package aulaseis;
/**
 *
 * @author lucas
 */
public class SaidaDeDados {
    public static void main(String[] args) {
        float nota = 8.5f;
        String nome = "Lucas";
        System.out.print("A nota é: " + nota); //Imprime sem quebra de página
        System.out.println("A nota é: " + nota); //Imprime com quebra de página
        System.out.printf("A nota é %s %.2f\n", nome, nota); //Imprime formatando a variável
        System.out.format("A nota de %s é: %.2f\n", nome, nota);
    }
}
