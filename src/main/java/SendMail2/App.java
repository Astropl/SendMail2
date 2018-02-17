package SendMail2;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main ( String[] args ) throws FileNotFoundException {
        EmailSender sender = new EmailSender ();
        ServerStatus serverStatus = new ServerStatus ();
        serverStatus.choiceServer ();
        EmailContainer emailContainer = new EmailContainer ();
        //Scanner sc = new Scanner ( System.in );

        /*System.out.println ("Choice Server properties\n 1. ON.\n 2. OFF");
        int choise = sc.nextInt ();
        if (choise == 1) {
            serverStatus.startServer = true;
        }else{ serverStatus.startServer = false;}

            if (serverStatus.startServer == true) {
                System.out.println ( "Serwer :" + serverStatus.startServer );
                sender.sendEmail ();
                System.out.println ( "Messege send" );
            } else {
                serverStatus.startServer = false;
                System.out.println ( "Serwer :" + serverStatus.startServer );
                System.out.println ( "Message cant send. Server is OFF" );

                //emailContainer.
                //sender.sendEmail ();
                //}
            }
        }*/

    }
}

