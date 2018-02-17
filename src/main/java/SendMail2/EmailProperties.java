package SendMail2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmailProperties
{

        String userName = "martys.pawel2@gmail.com";
        String password = "";

        String fromAdress = "martys.pawel2@gmail.com";
        String toAdress = "martys.pawel2@gmail.com";
        String subject = "Test email";
        String message = "Cos tam ";

        File file = new File ( "pass.txt" );
        Scanner in = new Scanner(file);

        password = in.nextLine ();

}
