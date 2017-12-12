import java.util.*;

public class Quad {

  private int divisor(int numA){
    return 2*numA;

  }

  private int discriminate(int numA,int numB,int numC){
    return numB*numB-4*numA*numC;

  }

  private int negativeB(int numB){
    return -1*numB;

  }

  public static void main(String[] args)
  throws NumberFormatException
  {
    System.out.println("\nI am a failure!\n" +
    "this is some math thing me man");
// AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    Scanner input = new Scanner (System.in);
    System.out.println("type your A gender");
    String stringA = input.nextLine();
    stringA = stringA.trim();
    int numA = -999999999;

try {
      numA = Integer.parseInt(stringA);
    }
   catch(NumberFormatException eA1) {
      System.out.println("words");
      stringA = input.nextLine();
      stringA = stringA.trim();

      try {
        numA = Integer.parseInt(stringA);
      }
      catch(NumberFormatException eA2) {
        System.out.println("eagle is the only N!#$%R in the class");
        System.exit(1);
      }
    }
// BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
    System.out.println("type your B gender");
    String stringB = input.nextLine();
    stringB = stringB.trim();
    int numB = -999999999;

    try {
           numB = Integer.parseInt(stringB);
        }
       catch(NumberFormatException eB1) {
          System.out.println("words");
          stringB = input.nextLine();
          stringB = stringB.trim();

          try {
            numB = Integer.parseInt(stringB);
          }
          catch(NumberFormatException eB2) {
            System.out.println("MICROAGGRESSIONS ARE PUNISHABLE BY DEATH");
            System.exit(1);
          }
        }
//CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC
    System.out.println("type your C gender");
    String stringC = input.nextLine();
    stringC = stringC.trim();
    int numC = -999999999;

    try {
          numC = Integer.parseInt(stringC);
        }
       catch(NumberFormatException eC1) {
          System.out.println("words");
          stringC = input.nextLine();
          stringC = stringC.trim();

          try {
            numC = Integer.parseInt(stringC);
          }
          catch(NumberFormatException eC2) {
            System.out.println("MICROAGGRESSIONS ARE PUNISHABLE BY DEATH");
            System.exit(1);
          }
        }

    Quad obj = new Quad();
    int bottom = obj.divisor(numA);
    int dis = obj.discriminate(numA,numB,numC);
    int negB = obj.negativeB(numB);
    double sqroot= Math.sqrt(dis);

    //System.out.println(bottom, dis, negB, sqroot);

    if(Math.abs(bottom) == 0) {
      System.out.println("This is wrong you rude dude since the A gender is" +
                         numA + "\nget a gender that not a zero or letter, we dont like those guy");
      System.out.println("looks a awful like a liner equalzon, learn to quad you rude dude");
      System.exit(0);
    } else {
      System.out.println("you did something right in your life for once");
    }

    if(dis < 0) {
      if(Double.isNaN(sqroot)) {
        System.out.println("Steal some sqrt of discriminate well give complex thing");
      }

      System.out.println("the letter is =\n" + dis + "\ntry another gender");
      System.exit(1);

    } else if (Math.abs(dis) == 0) {
      System.out.println("the dis equals:\n" + dis + "\none tihng is thing");

    } else {
      System.out.println("more words people think they want\n" + dis + "\ntwo rots r estmted");
    }

    if (Math.abs(dis) == 0) {
      System.out.println("t s r i e t:" + (negB + sqroot) / bottom);

    } else if(dis > 0) {
      System.out.println("t 1st r i e t:" + (negB + sqroot) / bottom);
      System.out.println("t 2nd r i e t:" + (negB - sqroot) / bottom);
    } else {
      System.out.println("Screw off");
    }

    System.out.println("getouturudedude");

  }
}
// System.out.println("");
