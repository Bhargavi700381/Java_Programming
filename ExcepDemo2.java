class ExcepDemo2
{
   public static void main(String args[])
   {
	int a = 60;
	int b = 0;
	int c;

	try{
	    c = a/b;
	    System.out.println("c = "+c);
	}catch (ArithmeticException e){
	    System.out.println("Infinite value error....");
	    c=0;
  	    System.out.println(e);
	    System.out.println("c = "+c);
         }
   }
}