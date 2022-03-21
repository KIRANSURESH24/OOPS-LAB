import java.util.*;
class pg1
{  
public static void main(String[ ]args)  
{    
int a[]=new int[5],i;
Scanner s=new Scanner(System.in);
System.out.print("enter two number");
for(i=0;i<5;i++)
{
a[i]=s.nextInt();
}
System.out.println("display");
for(i=0;i<5;i++)
{
System.out.println(a[i]);
}
}
}