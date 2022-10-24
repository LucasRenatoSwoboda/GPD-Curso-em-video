package aulaonzewhile;

/**
 *
 * @author lucas
 */
public class AulaOnzeWhile {
    //Continue encerra o processo atual do laço e volta para o inicio do próprio laço.
    //Break interrompe o laço
    public static void main(String[] args) {
        int cc = 0;
        while (cc < 10) {
            cc++;
            if ((cc == 3) | (cc == 5))
                continue;
            else if (cc == 8)
                break;
            System.out.println("Cambalhota " + (cc) + ".");
        }
    }
}
