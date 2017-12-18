import java.util.Scanner;
import javax.swing.JOptionPane;

public class FCC {
    public String printMoney(double money) {
      String pM =String.format("Your total kill count is %.2f", money);
      System.out.println(pM);
      return pM;
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

   String apples_string1 = JOptionPane.showInputDialog ("Let's fill the T-34 for our trip to Fascist Heartland" +
      ", how much vodka do we need comrade");
   int apples_int = 0;
   double apples_double = 0.0;
   String apples_string2 = "";

   try {
     apples_double = Double.parseDouble(apples_string1);
     apples_double = 0.0;
   }
   catch (NumberFormatException ne3) {
     System.out.println ("Tiger to the left! (intag)");
     apples_string2 = JOptionPane.showInputDialog ("Tiger to the left!");
     try {
       apples_double = Double.parseDouble(apples_string2);
     }
     catch (NumberFormatException ne4) {
       System.out.println ("The tiger sees us(intag)");
       JOptionPane.showMessageDialog (null, "Our tank broke down(whole)", "ERROR " + "MESSAGE", JOptionPane.ERROR_MESSAGE);
       System.exit(0);
     }
   }
   if (apples_double > 0.0 ) {
     try {
       System.out.println ("Wait what is Demitri doing with that pistol and vodka");
       apples_int = Integer.parseInt(apples_string1);
       apples_string1 = apples_string2;
       System.out.println("By Stalin, Demitri is taking on a Tiger with a pistol and vodka, good man");
       apples_double = 0.0;
     }
     catch (NumberFormatException ne5) {
       System.out.println ("I think that shot got the pigs");
       JOptionPane.showMessageDialog (null, "For Stalingrad!", "ERROR " +
                   "MESSAGE", JOptionPane.ERROR_MESSAGE);
       System.exit(0);
     }
   }
   try {
     System.out.println ("I see the German border");
     apples_int = Integer.parseInt(apples_string1);
     System.out.println ("Today we bring the fight to their people.");
   }
   catch (NumberFormatException ne6) {
     System.out.println ("Berlin, Germany");
     apples_string2 = JOptionPane.showInputDialog ("The Reichstag is in the centre of Germany, push Comrades");
      try {
        apples_int = Integer.parseInt(apples_string2);
        apples_double = 0.0;
      }
      catch (NumberFormatException ne7) {
        System.out.println ("German soldiers to the left");
        JOptionPane.showMessageDialog (null, "Comrade watch out for the soldiers to the left", "ERROR " +
                   "MESSAGE", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
      }
    }

    System.out.println("The german army surrendered");
    System.out.println(apples_int);
    System.out.println(apples_double);
    System.out.println(apples_string1);
    System.out.println(apples_string2);

 }
}
