package SendMail2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ServerStatus {
    boolean startServer;

    ServerStatus ( boolean startServer ) {
        this.startServer = startServer;
    }

    public ServerStatus () {

    }

    public void startServer () {
        startServer = true;
    }

    public boolean isStartServer () {
        return startServer;
    }

    public void setStartServer ( boolean startServer ) {
        this.startServer = startServer;
    }

    public void choiceServer () throws FileNotFoundException {
        ServerStatus serverStatus = new ServerStatus ();
        EmailSender sender = new EmailSender ();
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Choice Server properties\n 1. ON.\n 2. OFF" );
        int choise = sc.nextInt ();
        if (choise == 1) {
            serverStatus.startServer = true;
        } else {
            serverStatus.startServer = false;
        }

        if (serverStatus.startServer ) {
            System.out.println ( "Server :" + serverStatus.startServer );
            sender.sendEmail ();
            System.out.println ( "Messege send!!!" );
        } else {
            serverStatus.startServer = false;
            System.out.println ( "Server :" + serverStatus.startServer );
            System.out.println ( "Message cant send!!!. Server is OFF" );

            //emailContainer.
            //sender.sendEmail ();
            //}
        }
    }
}


