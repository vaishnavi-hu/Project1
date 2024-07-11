import java.util.*;
class Voting
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int age;
System.out.println("Enter the age of person");
age=sc.nextInt();
if(age>=18)
System.out.println("person is eligible for voting");
else
System.out.println("person is not eligible for voting");
}
}