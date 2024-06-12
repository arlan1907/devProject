package exceptionprictice;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedException {

    public static void main(String[] args) throws MalformedURLException, InterruptedException{


            URL url = new URL("https://www.google.com");
            System.out.println("End of the code");

            Thread.sleep(4000);

    }
}
