import java.util.Scanner;

public class Q1 {
  public static void main (String[] args) {

    int x;

    System.out.println("put in a number to find your gender");
    Scanner in = new Scanner(System.in);
    x = in.nextInt();
    // thingy to find out if gender is even
    if ( x % 2 == 0 )
    System.out.println("your gender is even");
    // thingy that gives up and give you oddd gender
    else
    System.out.println("your gender is odd");

  }
}
