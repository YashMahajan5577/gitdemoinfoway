class Demo
{
private String name;
private int age;
  Demo(String a, int b)
{
   name=a;
   age=b;
}

  void talk()
{
System.out.println("Hello my name is" +name);
System.out.println(" my age is" +age);
}
}

class Person
{
public static void main(String args[])
{
  Demo raju=new Demo("raju",22);
  raju.talk();
  Demo sita=new Demo("sita",18);
  sita.talk();
}
}