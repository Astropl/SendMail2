package SendMail2;

public class EmailConfiguration {
    public static final String HOST = "smtp.gmail.com";
    public static final int PORT = 465;
    public static final boolean SSL_FLAG = true;

    public static String getHOST () {
        return HOST;
    }

    public static int getPORT () {
        return PORT;
    }

    public static boolean isSslFlag () {
        return SSL_FLAG;
    }
}
