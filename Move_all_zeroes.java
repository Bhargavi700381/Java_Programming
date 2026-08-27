class Moves_all_zeroes{
  public void movezeroes(int arr[])
  {
    int n=arr.length;
    int count=0;
    for(int i=0;i<n;i++)
      {
        if(arr[i]!=0)
        {
          arr[count]=arr[i];
          count++;
      }
  }
    for (int i = count; i < n; i++) {
            arr[i] = 0;
    }
  }
  public static void main(String args[])
  {
    int arr[]={5,0,3,4,0,0,7};
    moveszeroes(arr);
    for(int x:arr)
      {
      System.out.println(" " +arr[i]);
      }
  }
}
