/* Runtime Exceptions
char c[] = new char[5];
c[8] = 100; ---> ArrayIndexOutOfBoundsException
*/
class ExcepDemo1
{
   public static void main(String args[])
   {
	int a = 60;
	int b = 0;
	int c = a/b;

	System.out.println(c);
   }
}