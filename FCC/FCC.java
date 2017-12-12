import java.util.Scanner;
import javax.swing.JOptionPane;

public class FCC {
   public static void main(String[] args)
   throws NumberFormatException
   {

     String moneyYouHave_string1 = JOptionPane.showInputDialog ("Tell me how much " +
            "you love communism.\n Go to bread line \n" +
            "For Example: \'\' 14.50 \'\'");
     Double moneyYouHave_double = 0.00;

     try{
       moneyYouHave_double = Double.parseDouble(moneyYouHave_string1);
     }
     catch (NumberFormatException ne1) {
       System.out.println ("A capitalist revolulion comrade, get your Kalashnikov\n" +
                           "For example: \' 14.50 \'");
       String moneyYouHave_string2 = JOptionPane.showInputDialog ("Please " +
               "enter a dolars and cents value\n" +
               "For example: \' 14.50 \'");
       try {
         moneyYouHave_double = Double.parseDouble(moneyYouHave_string2);
       }
       catch (NumberFormatException ne2) {
         System.out.println ("You failure! " +
                            "time for you to fight in frontlines for Mother Russia");
         System.exit(0);
       }
     }
     double totalMoneyIn = moneyYouHave_double;
     System.out.println(" your total Stalincoins are %.2f", totalMoneyIn);
     //Double input_double = Double.parseDouble(input_string);

     //System.out.println(input_double+2.50);

     //JOptionPane.showMessageDialog (null, "$" + input_string, "You told me " +
     //           " you have: ", JOptionPane.ERROR_MESSAGE);
     //INFORMATION_MESSAGE
     //ERROR_MESSAGE
     //WARNING_MESSAGE
     //QUESTION_MESSAGE

     //System.out.println("$" + input_double);




   }
}
