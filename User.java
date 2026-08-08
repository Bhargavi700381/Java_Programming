import java.util.Scanner;
class User{
  public static void main(String args[]){
 Scanner scanner=new Scanner(System.in);
 System.out.println("enter a string:");
 String s=scanner.nextLine();
System.out.println(" welcome," +s);
scanner.close();
}
}