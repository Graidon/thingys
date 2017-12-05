import java.util.Scanner;
    public class Q3 {
        public static void main(String[] args)
            throws ArrayIndexOutOfBoundsException
            {
            //Create new scanner
            Scanner input = new Scanner(System.in);

            //Values of each digit
            int hundreds = 0;
            int tens = 0;
            int ones = 0;

            //Prompt user to input 3 digit number
            System.out.print("Enter a 3 digit number: ");
            int number = input.nextInt();


            hundreds = number / 100;
            tens = (number %100) / 10;
            ones = number %10;

            System.out.println("Hundreds place digit: " + hundreds);
            System.out.println("Tens place digit: " + tens);
            System.out.println("Ones place digit: " + ones);


            //Error if number is less or more then three digits
            if (number > 999)
            System.out.println("Can only have numbers with 3 digits");
            if (number < 100)
            System.out.println("Can only have numbers with 3 digits");
          }
}
