import java.util.Date;
import javax.swing.*;
public class HoraSistema{
    public static void main(String [] args){
        //date variable gets system date;
        Date date = new Date();
        //dateS variable gets text and system date
        String dateS = "The system date is: " + date.toString();
        //Show date for users with JOptionPane
        JOptionPane.showMessageDialog(null, dateS, "System Date", 1);        
    }
}