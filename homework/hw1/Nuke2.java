import java.net.*;
import java.io.*;


class Nuke2{
public static void main(String[] arg) throws Exception {

BufferedReader keyboard; 
String inpline;
keyboard = new BufferedReader(new InputStreamReader(System.in));

inpline	= keyboard.readLine();
StringBuilder sb = new StringBuilder(inpline);

sb.deleteCharAt(1);
String outputLine = sb.toString();
System.out.println(outputLine);
}
}