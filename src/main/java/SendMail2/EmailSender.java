package SendMail2;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

import java.util.Scanner;

public class EmailSender extends EmailConfiguration {

    public void sendEmail() {
        Scanner sc = new Scanner ( System.in );
        String userName = "martys.pawel2@gmail.com";
        String password = "";

        String fromAdress = "martys.pawel2@gmail.com";
        String toAdress = "martys.pawel2@gmail.com";
        String subject = "Test email";
        String message = "Hello from Apache Mail";

        try {
            System.out.println ("Podaj Haslo");
            password=sc.next (  );
            Email email = new SimpleEmail();
            email.setHostName(HOST);
            email.setSmtpPort(PORT);
            email.setAuthenticator(new DefaultAuthenticator(userName, password));
            email.setSSLOnConnect(SSL_FLAG);
            email.setFrom(fromAdress);
            email.setSubject(subject);
            email.setMsg(message);
            email.addTo(toAdress);
            email.send();
        } catch (Exception ex) {
            System.out.println("Unable to send email");
            System.out.println(ex);
        }
    }

    public boolean startServer() {

        return true;
    }

    public boolean stopServer() {

        return true;
    }
}