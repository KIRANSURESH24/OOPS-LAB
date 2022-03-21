import java.util.*;
class calculator
{  
public static void main(String[ ]args)  
{    
int a,b,c,ch;
Scanner s=new Scanner(System.in);
System.out.print("enter two number");
System.out.println("1.addition");
System.out.println("2.substraction");
System.out.println("3.multiplication");
System.out.println("4.division");
System.out.println("5.modulus");
System.out.println("enter your choice");
ch=s.nextInt();
System.out.println("enter the number");
a=s.nextInt();    
b=s.nextInt();
switch(ch)
{
case 1:
c=a+b;
System.out.println("addition  "+c);
break;
case 2:
c=a-b;
System.out.println("substraction  "+c);
break;
case 3:
c=a*b;
System.out.println("multiplication  "+c);
break;
case 4:
c=a/b;
System.out.println("division  "+c);
break;
case 5:
c=a%b;
System.out.println("modulus    "+c);
break;
}
}
}