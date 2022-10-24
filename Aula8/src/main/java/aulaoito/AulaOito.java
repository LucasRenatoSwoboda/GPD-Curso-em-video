package aulaoito;

/**Operador ternário.
 * variávelQueReceberáOValorDaOperação = testeLógico ? resultadoSeForVerdade : resultadoSeForFalso;
 * 
 * Operadores relacionais.
 * >  Maior que
 * <  Menor que
 * == Igual a
 * != Diferente de
 * >= Maior ou igual que
 * <= Menor ou igual que
 *  
 * Operadores Lógicos.
 * &&   and
 * ||   or
 * ^    xor
 * !    not
 */
public class AulaOito {

    public static void main(String[] args) {
        boolean ot = false?true:false;
        System.out.println(ot);
        String nome1 = "Lucas";
        String nome2 = "Lucas";
        String nome3 = new String("Lucas");
        String res = (nome1 == nome3)?"Igual":"Diferente";
        System.out.println(res);
        System.out.println(nome1.equals(nome3));
    }
}
