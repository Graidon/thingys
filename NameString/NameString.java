package stringvar;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class NameString {
  public static void main (String[] args)
  throws ArrayIndexOutOfBoundsException
  {
    String input = JOptionPane.showInputDialog("Enter your name");

    String first_name;
    System.out.println("Enter your first name: ");
    first_name = name_input.next(args);

    String family_name;
    System.out.println("Enter your surname: ");
    family_name = user_input.next(args);

    String full_name;
    full_name = first_name + " " + family_name;

    System.out.println("You are " + full_name);
  }
}
