package aulaquatro;

import java.util.Locale;

/**
 *
 * @author lucas
 */
public class IdiomaDoSistema {
    public static void main(String[]args){
        // Pelo que entendi lendo a documentação getDefault retornará os valores padrões do SO por buscar os dados da JVM.
        Locale local = Locale.getDefault();
        System.out.println("O idioma do sistema é: " + local.getDisplayName() + ".\n");
        // Testes de outros métodos do pacote Locale
        System.out.println("Teste usando outros métodos do pacote Locale: \n");
        System.out.println("Usando getISO3Language() = '" + local.getISO3Language() + "'");
        System.out.println("Usando getCountry() = '" + local.getCountry() + "'");
        System.out.println("Usando getDisplayCountry() = '" + local.getDisplayCountry() + "'");
        System.out.println("Usando getDisplayLanguage() = '" + local.getDisplayLanguage()+ "'");    
        System.out.println("Usando toString() = '" + local.toString() + "'");
        System.out.println("Usando getDisplayVariant() = '" + local.getDisplayVariant() + "'");
    }
}
