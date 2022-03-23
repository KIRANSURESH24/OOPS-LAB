import java.util.*;
class matrix1
{
public static void main(String[]args)
{
int i,j,m,n;
Scanner s=new Scanner(System.in);
System.out.println("enter the rows");
i=s.nextInt();
System.out.println("enter the column");
j=s.nextInt();
int mat1[][]=new int[i][j];
int mat2[][]=new int[i][j];
int mat3[][]=new int[i][j];
System.out.println("enter the elements in matrix1");
for(m=0;m<i;m++)
{
for(n=0;n<j;n++)
{
mat1[m][n]=s.nextInt();
System.out.println();
}
}
System.out.println("enter the elements in matrix2");
for(m=0;m<i;m++)
{
for(n=0;n<j;n++)
{
mat2[m][n]=s.nextInt();
System.out.println();
}
}
for ( m= 0 ; m < i ; m++ )
for ( n= 0 ; n < j ;n++ )
mat3[m][n] = mat1[m][n] + mat2[m][n] ;  
System.out.println("Sum of matrices:-");
for ( m= 0 ; m < i ; m++ )
{ 
for ( n= 0 ; n < j ;n++ )
System.out.print(mat3[m][n]+"\t");
System.out.println();
}
}
}