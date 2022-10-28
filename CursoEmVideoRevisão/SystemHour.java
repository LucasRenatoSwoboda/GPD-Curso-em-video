import java.util.Date;
import javax.swing.*;
public class SystemHour{
    //hour variable prepare to get Date;
    private Date hour;
    //Constructor
    public SystemHour(){
        hour = new Date();
    }
    //Gets
    public Date getHour(){
        return hour;
    }
    //Show System Hour
    public void showHour(){
        String text = "System Hour is: " + getHour().toString();
        JOptionPane.showMessageDialog(null, text, "Hour", 1);
    }
}