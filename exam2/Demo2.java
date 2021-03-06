package exam2;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Demo2 {
    public static void main(String[] args) {
        {
            try
            {
                System.out.print("Bitte URL eingeben:");

                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
                URL url = new URL(userInput.readLine());
                BufferedReader connectionInput = new BufferedReader(new InputStreamReader(url.openStream()));

                //Die Datei wird im Projekt bei Aufruf der Methode angelegt und bei erneutem Aufruf überschrieben
                PrintWriter pw = new PrintWriter("content.html");

                String s;
                while ((s = connectionInput.readLine()) != null){

                    System.out.println(s);
                    pw.println(s);
                }

                connectionInput.close();
                pw.close();
            }
            catch (MalformedURLException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
