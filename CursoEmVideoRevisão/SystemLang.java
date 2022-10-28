import java.util.Locale;
import javax.swing.*;
public class SystemLang{
    //lang variable prepare to get Default Locale;
    private Locale lang;
    //Constructor
    public SystemLang(){
        lang = Locale.getDefault();
    }
    //Gets
    public Locale getLang(){
        return lang;
    }
    //Show System Language
    public void showLang(){
        String text = "System lang is: " + getLang().getDisplayName();
        JOptionPane.showMessageDialog(null, text, "Language", 1);
    }
}