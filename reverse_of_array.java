import java.util.*;
class reverse_of_array
{
  public void reverse(int arr[])
  {
    int n=arr.length;
    for(int i=0;i<n/2;i++)
      {
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
      }
  }
  public static void main(String[] args)
  {
    int arr[]={5,7,3,9,1};
    reverse(arr);
    for(int i=0;i<n;i++)
      {
        System.out.println("reverse of element"+arr[i]);
      }
  }
