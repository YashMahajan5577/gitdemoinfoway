import java.util.*;
class Demo
{
public void oe(int i)
{
 if(i%2==0)
{
System.out.println("number is even");
}
else
{
System.out.println("number is odd");
}
}

public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

Demo d1=new Demo();
d1.oe(a);

}



}