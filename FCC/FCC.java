import java.util.Scanner;
import javax.swing.JOptionPane;

public class FCC {
    public String printMoney(double money) {
      String pM =String.format("Your total kill count is %.2f", money);
      System.out.println(pM);
      return pM;
    }

    public int checkIntEntry (String userNumber1) {
    String userNumber2 = new String();
    userNumber2 = "";
    int item_int = 0;
    double item_double = 0.0;
    try {
        item_double = Double.parseDouble(userNumber1);
        item_double = 0.0;
    }
    catch (NumberFormatException ne3) {
        System.out.println ("User has failed first attempt at entering item number");
        userNumber2 = JOptionPane.showInputDialog ("Please enter how many " +
                "whole items.\nFor example: \' 3 \'");
        try {
          item_double = Double.parseDouble(userNumber2);
          userNumber1 = userNumber2;
          item_double = 0.0;
        }
        catch (NumberFormatException ne4) {
          System.out.println ("User failed a second attempt for " +
                             "an integer value of items.");
          JOptionPane.showMessageDialog (null, "Please restart the program and " +
                     "enter a whole number of items, as a whole number.", "ERROR " +
                     "MESSAGE", JOptionPane.ERROR_MESSAGE);
          System.exit(0);
        }
    }
    try {
      System.out.println ("User entered a double or int for number of items.");
      item_int = Integer.parseInt(userNumber1);
      System.out.println ("User entered an int for number of items.");
    }
    catch (NumberFormatException ne6) {
      System.out.println ("User entered a decimal value for the number of items.");
      userNumber2 = JOptionPane.showInputDialog ("It seems you have entered " +
              " a decimal number.\nPlease enter a number of whole items.\n" +
              "For example: \' 3 \'");
      try {
        item_int = Integer.parseInt(userNumber2);
        item_double = 0.0;
      }
      catch (NumberFormatException ne7) {
        System.out.println ("User failed a second attempt for " +
                           "the whole number of items.");
        JOptionPane.showMessageDialog (null, "Please restart the program and " +
                   "enter a whole number of items, as a whole number.", "ERROR " +
                   "MESSAGE", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
      }
    }

    System.out.println ("Tracking Variables of Procedure for debugging");
    System.out.println (item_int);
    System.out.println (item_double);
    System.out.println (userNumber1);
    System.out.println (userNumber2);
    return item_int;
 }
    public static void main(String[] args)
    throws NumberFormatException
   {

     FCC obj = new FCC();

     String moneyYouHave_string1 = JOptionPane.showInputDialog ("Get to the breadline" +
            " comrade.\n not there, that is the enlistment line \n" +
            "(For Example: \'\' 14.50 \'\')");
     Double moneyYouHave_double = 0.00;

     try{
       moneyYouHave_double = Double.parseDouble(moneyYouHave_string1);
     }
     catch (NumberFormatException ne1) {
       System.out.println ("a capitalist revolulion comrade, get your Kalashnikov\n" +
                           "For example: \' 14.50 \'");
       String moneyYouHave_string2 = JOptionPane.showInputDialog ("Oh no " +
               "A wild capitalist revolution has appeared\n" +
               "(For example: \' 14.50 \')");
       try {
         moneyYouHave_double = Double.parseDouble(moneyYouHave_string2);
       }
       catch (NumberFormatException ne2) {
         System.out.println ("You failure! " +
                            "Capitalism has taken over Mother Russia, Stalin is disappointed");
         JOptionPane.showMessageDialog (null, "Capitalism has taken over Mother Russia, Stalin is disappointed", "ERROR " +
         "MESSAGE", JOptionPane.ERROR_MESSAGE);
         System.exit(0);
       }
     }
     double totalMoneyIn = moneyYouHave_double;
     if(moneyYouHave_double == Math.abs(0.0)) {
       System.out.println("The Germans are taking Berlin");
       JOptionPane.showMessageDialog (null, "We have lost to the fascist scum", "ERROR " +
       "MESSAGE", JOptionPane.ERROR_MESSAGE);
       System.exit(0);
     } else {
       System.out.println("You got " + totalMoneyIn + " kill(s)");
       JOptionPane.showMessageDialog (null, "Comrade, " + obj.printMoney(totalMoneyIn) + JOptionPane.INFORMATION_MESSAGE);
     }
//here
   System.out.println ("How much vodka do we need comrade.\n");

   String usernum1 = JOptionPane.showInputDialog ("Let's fill the T-34 for our trip to Fascist Heartland" +
      ", how much vodka do we need comrade");


    System.out.println("The german army surrendered");
    System.out.println(usernum1);

 }
}
