/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */

  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();
    
    /*Mycode*/

    
    String link = "http://www."+inputLine+".com/";
    URL url = new URL(link);
    InputStreamReader isr = new InputStreamReader(url.openStream());
    BufferedReader in = new BufferedReader(isr);

    
    
    String line;
    String[] lines_to_print = new String[5];
    for(int i=0;i<5;i++){
       line = in.readLine();
       lines_to_print[i] = line;
     }
    in.close();
    for(int j = 4;j>-1;j--){
      System.out.println(lines_to_print[j]);
    }
    
  }
}