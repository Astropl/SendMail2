package SendMail2;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmailSender extends EmailConfiguration {

    public EmailSender () {
    }

    public void sendEmail () throws FileNotFoundException {
        Scanner sc = new Scanner ( System.in );
        ServerStatus serverStatus = new ServerStatus ();
        EmailContainer emailContainer = new EmailContainer ();
        //ServerStatus serverStatus = new ServerStatus ( true );
        String userName = "martys.pawel2@gmail.com";
        String password = "";

        String fromAdress = "martys.pawel2@gmail.com";
        String toAdress = "martys.pawel2@gmail.com";
        String subject = "Test email";
        String message = "Cos tam ";

        File file = new File ( "pass.txt" );
        Scanner in = new Scanner(file);
        password = in.nextLine ();

        //System.out.println ( password );
        //System.out.println(zdanie);

        try {
            //System.out.println ("Podaj Haslo :");
            //password=sc.next (  );
            Email email = new SimpleEmail ();
            email.setHostName ( HOST );
            email.setSmtpPort ( PORT );
            email.setAuthenticator ( new DefaultAuthenticator ( userName, password ) );
            email.setSSLOnConnect ( SSL_FLAG );
            //email.setSSLOnConnect ( serverStatus.startServer );
            //email.setSSLOnConnect(SSL_FLAG);
            email.setFrom ( fromAdress );
            email.setSubject ( subject );
            email.setMsg ( message );
            //System.out.println (message);
            email.addTo ( toAdress );
            email.send ();
        } catch (Exception ex) {
            System.out.println ( "Unable to send email" );
            System.out.println ( ex );
        }
    }

    public boolean startServer () {

        return true;
    }

    public boolean stopServer () {

        return true;
    }
}