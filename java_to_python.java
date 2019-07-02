import java.util.*;
import java.io.*;
class java_to_python
{
void getconnection()
{
     try{
    String command = "python3 test.py";
    Process p = Runtime.getRuntime().exec(command);
    p.waitFor();
    BufferedReader bri = new BufferedReader(new InputStreamReader(p.getInputStream()));
    BufferedReader bre = new BufferedReader(new InputStreamReader(p.getErrorStream()));
          String line;
        while ((line = bri.readLine()) != null) {
            System.out.println(line);
          }
          bri.close();
          while ((line = bre.readLine()) != null) {
            System.out.println(line);
          }
          bre.close();
          p.waitFor();
          System.out.println("Done.");

    p.destroy();
   }
   catch(Exception e)
   {
      System.out.println(e);
   }

}

public static void main(String[] args)
{
  System.out.println("CALLING PYTHON USING JAVA : ");

  java_to_python j=new java_to_python();

  j.getconnection();

}
}
