/*Client.java
  Example using Runnable Interface.
  Runnable Interface contains abstarct public void run().
  To ctreate a Thread thru a Runnable Interface, follow the steps as bellow:
   1. Declare the class as implementing Runnable Interface and 
      create n object under that class
   2. Implement the run() method according to your requirement
   3. Create a Thread Object with new Thread(....) where
      you pass the object of the Runnable Interface class as an argumnet
*/
import java.lang.Thread;
class Counter implements Runnable
{
   int currentValue;
   Thread worker_thread;
   
   Counter(String thrdname)
   {
   	currentValue = 0;
	worker_thread = new Thread(this, thrdname);
	System.out.println(worker_thread);
	worker_thread.start();
   }

   public void run()
   {
	try{
	     while(currentValue < 5)
	     {
		System.out.println(worker_thread.getName()+": "+(currentValue++));
		Thread.sleep(500);
		Thread s = Thread.currentThread();
		s.setName("AITAM-Thread");
	     }
	   }catch(InterruptedException e){
		System.out.println(worker_thread.getName() + " Interrupted.");
	        }
	System.out.println("Exit from "+worker_thread.getName());
   } // run() ends.

   int getvalue()
   {
   	return currentValue;
   }
}

class Client
{
   public static void main(String args[])
   {
	Counter counterA = new Counter("Thread AITAM");
	try{
	     int val;
	     do
	     {
		val = counterA.getvalue();
		System.out.println("main Thread: "+val);
		Thread.sleep(1000);
	     }while (val < 5);
	}catch(InterruptedException ie){
		System.out.println("main Thread Interrupted.");
		}
	System.out.println("Exit from main Thread.");
   }
}