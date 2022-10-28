import javax.swing.*;
public class HelloWorld{
    //String
    private static String text = "Hello World";
    //Gets
    public static String getText(){
        return text;
    }
    //Show Hello World text
    public static void showText(){
        JOptionPane.showMessageDialog(null, getText(), "Hello", 1);
    }
}