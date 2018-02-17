package SendMail2;

public class EmailConfiguration {
    static final String HOST = "smtp.gmail.com";
    static final int PORT = 465;
    static final boolean SSL_FLAG = true;

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
