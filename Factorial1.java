public class Factorial1{
public static long gfactorial(int n){
if(n==1)
{
return 1;
}
else
{
return n* gfactorial(n-1);
}
}
public static long lfactorial(int n){
int c=1;
long p=1;
for(int i=1;i<=n;i++)
p=p*i;
return p;
}
public static void main(String args[])
{
int number=5;
if(number<0)
{
System.out.println("factorial is not defined for negative numbers");
}
else
{
long result=gfactorial(number);
System.out.println("factorial of "+number+" using recurrise"+result);
result=lfactorial(number);
System.out.println("factorial of "+number+" using loop" +result);
}
}
}