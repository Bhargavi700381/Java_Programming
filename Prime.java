import java.util.Scanner;
class Prime{
public static void main(String args[]){
 int i,j,n,flag=0,k=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number");
 n=sc.nextInt();
 for(i=0;i<=n;i++)
{
for(j=2;j<=(int)(Math.sqrt(i));j++)
{
k=i%j;
if(k==0)
{
flag=1;
break;
}}
if(flag==0)
System.out.println(i);
flag=0;
}
}
}


 