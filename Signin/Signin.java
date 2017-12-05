import java.util.Scanner;

public class Signin {

public static void main(String[] args) {

    String Username;
    String Password;

    Password = "000";
    Username = "username";

    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username) && password.equals(Password)) {

        System.out.println("Access Granted. Boom will go off in 5 minutes.");
    }

    else if (username.equals(Username)) {
        System.out.println("Get your password right you rude dude");
    } else if (password.equals(Password)) {
        System.out.println("Get your username right you rude dude");
    } else {
        System.out.println("Get your username and password right you rude dude");
    }

}

}
