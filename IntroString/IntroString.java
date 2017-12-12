public class IntroString {
  public static void main (String[] args)
  throws ArrayIndexOutOfBoundsException
   {
     try {
       while (args[0]=="");
     }
     catch(ArrayIndexOutOfBoundsException e) {
       System.out.println ("Start program with \n"+"4 Names, o spaces");
       System.exit(0);
     }
    String name[] = new String[8];
    System.out.println("Your gender is: \n" + args[0]);
    for(int i=0; i <args[0].length(); i++){
      if(i >+ 10){
        System.out.print(i-10);
    } else {
        System.out.print(i);
    }
    }
    System.out.println("");
//ben john pat michelle
    System.out.println(args[0].substring(10));
    System.out.println(args[0].substring(7, 10));
    System.out.println(args[0].substring(3,7));
    System.out.println(args[0].substring(0,3));
    // array thing to save re data /data house thing
    name[0]=args[0];
    name[1]=args[0].substring(0,3);
    name[2]=args[0].substring(3,7);
    name[3]=args[0].substring(7, 10);
    name[4]=args[0].substring(10);

    name[5]=name[1].toLowerCase();
    System.out.println(name[5]);
    System.out.println(name[5].toUpperCase());

    System.out.println(name[1] == args[0].substring(0,3));
    System.out.println(name[1].equals(args[0].substring(0,3)));

    System.out.println("compare b to j:" + name[1].compareTo(name[2]));
    System.out.println("fgdfgdfgdfg" + "\n ffsddfdf");
    System.out.println("compare j to b:" + name[2].compareTo(name[2]));
    System.out.println("rgfdffgf" + "\n ffsddfdf");

    name[6]="      (6)Spaces(2)   ";
    System.out.println(name[6] + ", the length is :" + name[6].length());
    System.out.println(name[6].trim()+ ", the length is :" + name[6].length());
    name[7]=name[6].trim();
    System.out.println(name[7]+ ", the length is :" + name[7].length());
  }


}
