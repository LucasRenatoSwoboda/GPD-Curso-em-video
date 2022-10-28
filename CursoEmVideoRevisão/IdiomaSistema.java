import java.util.Locale;
import javax.swing.*;
public class IdiomaSistema{
    public static void main(String [] args){
        //Practicing coding and English
        //Language variable gets system Language Default 
        Locale language = Locale.getDefault();
        //LanguageTxt variable gets text and system language default
        String languageTxt = "The language system is: " + language.getDisplayName();
        //Show system language with JOptionPane
        JOptionPane.showMessageDialog(null, languageTxt, "System Language", 2);
    }
}