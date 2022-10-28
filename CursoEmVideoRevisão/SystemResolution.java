import java.awt.Toolkit;
import javax.swing.*;
public class SystemResolution{
    //tool variable gets Default Toolkit
    private Toolkit tool = Toolkit.getDefaultToolkit();
    //x and y variable for resolution Width and Height
    private double x, y;
    //Constructor
    public SystemResolution(){
        //x variable get Width Screen
        //y variable get Height Screen
        x = tool.getScreenSize().getWidth();
        y = tool.getScreenSize().getHeight();
    }
    //Gets
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    //Show resolution
    public void showResolution(){
        String text = "System Resolution is: " + getX() + " x " + getY();
        JOptionPane.showMessageDialog(null, text, "Resolution", 1);
    }
}