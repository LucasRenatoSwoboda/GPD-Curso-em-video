import java.awt.Toolkit;
import javax.swing.*;
public class ResolucaoTela{
    public static void main(String []args){
        //Practicing coding and English
        //screen variable gets Toolkit Default
        Toolkit screen = Toolkit.getDefaultToolkit();
        //x variable gets Screen Size Width
        double x = screen.getScreenSize().getWidth();
        //y variable gets Screen Size Height
        double y = screen.getScreenSize().getHeight();
        //screenTxt gets text and screen size
        String screenTxt = "The current system resolution is: " + String.format("%.2f", x) + " x " + String.format("%.2f", y);        
        //Show system resolution with JOptionPane
        JOptionPane.showMessageDialog(null, screenTxt, "System Resolution", 2);
    }
}