class employee
{
int r;
String n;
long ph;
String des;
String dep;

employee(int Record_id,String name,long phonenumber,String designation,String department)
{
r=Record_id;
n=name;
ph=phonenumber;
des=designation;
dep=department;
}
void display()
{
System.out.println(r+"\t\t"+n+"\t\t"+ph+"\t\t"+des+"\t\t"+dep);
}
public static void main(String[]args)
{
employee obj1=new employee(01,"KIRAN",6284569873L,"CEO","ADMINSTRATOR");
employee obj2=new employee(02,"LEKSHMI",8454569873L,"MD","ADMINSTRATOR");
employee obj3=new employee(03,"AKSHAY", 8456569873L,"MANAGER","ADMINSTRATOR");
obj1.display();
obj2.display();
obj3.display();
}
}

     

        