package aula15testefuncao02;

/**
 *
 * @author lucas
 */
public class Operacoes {
    //Método para contar de int i até int f
    public static String contador(int i, int f){
        String s = "";
        for(int c = i; c <= f; c++){
            s += c + " ";
        }
        return s;
    }
}
