import java.util.*;
class Temperatureconversion
{

     public static void main(String args[])
     {
     Scanner sc=new Scanner(System.in);

     float ct,ft;

     System.out.println("Enter the fahrenheit temperature");
     ft=sc.nextFloat();


     ct=(ft-32.0f)*5/9;

     System.out.println("celsius temperature="+ct);  
     }

}


