package SendMail2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EmailSender sender = new EmailSender ();
        sender.sendEmail ();
    }
}
