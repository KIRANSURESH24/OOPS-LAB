import java.util.*;
class two
{  
public static void main(String[ ]args)  
{    
int a[][]=new int[2][3],i,j;
Scanner s=new Scanner(System.in);
for(i=0;i<2;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("display");
for(i=0;i<2;i++)
{
for(j=0;j<3;j++)
System.out.println(a[i][j]);
}
}
}