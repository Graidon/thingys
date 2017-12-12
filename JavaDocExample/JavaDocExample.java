/**
*<h1>Chicken Tendies</h1>
*<b>REEEEEEEE</b><br>
*<p>REEEEEEE</p><br>
*<b>REEEEEEEE</b><br>
*<p>REEEEEEEEE</p><br>
*<br>
*@author different name 1
*@version V0.0000.00000.01
*@since when ever i made it
*/

public class JavaDocExample{
  /**<b>REEEEEEEE</b><br>
  *<p> REEEEEEEE</p>
   *@param args[0]
     *@param args[1]
  *@return nulllllllllllll
  @exception NumberFormatException ARGS IS OR NOT IS G3ND3R
  *@throws 
  */

  /**<b>REEEEEEEE driver</b><br>
  *<p> REEEEEEEE</p>
  *@param numA we are number 1
  *@param numB we are num 2
  *@return "do i" look smert
  *@throws
  */

  public int addNum(int numA, int numB) {
    return numA + numB;
    }

  public static void main(String args[]) {
    try{
      for(int i = 0; i<args.length; i++) {
        System.out.println("Args[" + i + "]; "+ args[i]);
      }
      int numA = Integer.parseInt(args [0]);
      int numB = Integer.parseInt(args [1]);

      JavaDocExample obj = new JavaDocExample();
      int sum = obj.addNum(numA, numB);
      System.out.println("Sum of " + args[0] + "and" + args[1] + "is:" + sum);
  }
  catch(NumberFormatException nfe){
//input is a number or is it not, gently rubs the user and tell the user to use a letter that is numeral in argssssss
    System.out.println ("Your agrgumemntrnert may or may not be a gender. \n please use a new gender");
    System.exit(1);
  }
  }
}
