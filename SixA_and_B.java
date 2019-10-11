import java.util.*;
public class SixA_and_B
{
  public static void main(String[]args)
  {
    int a[] = new int[] { 85, 45, 69, 32, 14, 24, 22, 15, 7, 98, 65, 65, 47, 12, 32, 44, 58, 69, 56, 32, 21, 64, 79, 82, 19, 37, 45, 65, 87, 16 };
    Scanner sc=new Scanner(System.in);
    int choice=0;
    System.out.println("Would you like to Bubble Sort(1), Insertion Sort(2), or Selection Sort(3):");
    while (!(choice==1||choice==2||choice==3)){
      choice=sc.nextInt();
    }
    if (choice==1){
      long startTime = System.nanoTime();
      bSort(a);
      long endTime   = System.nanoTime();
      System.out.println("NanoTime = "+(endTime-startTime));
      for(int i=0;i<a.length-1;i++){
        System.out.print(a[i]+" ");
      }
    }
    else if (choice==2){
      long startTime = System.nanoTime();
      iSort(a);
      long endTime   = System.nanoTime();
      System.out.println("NanoTime = "+(endTime-startTime));
      for(int i=0;i<a.length-1;i++){
        System.out.print(a[i]+" ");
      }
    }
    else if (choice==3){
      long startTime = System.nanoTime();
      sSort(a);
      long endTime   = System.nanoTime();
      System.out.println("NanoTime = "+(endTime-startTime));;
      for(int i=0;i<a.length-1;i++){
        System.out.print(a[i]+" ");
      }
    }
    sc.close();
  }
  public static int[] iSort(int a[])
  {
    int temp = 0;
    int pos = 0;
    for(int i = 1; i<a.length; i++)
    {
      temp = a[i];
      pos = i;
      while(0<pos&&temp<a[pos-1])
      {
        a[pos] = a[pos-1];
        pos--;
      }
      a[pos] = temp;  
    }
    return a;
  }
  public static int[] sSort(int a[])
  {
    int smallestIndex =0;
    for(int i = 0; i<a.length-1; i++)
    {
      smallestIndex = i; 
      for(int j =i+1; j<a.length; j++)
      { 
        if(a[j]<a[smallestIndex])
        {
          smallestIndex = j;
        }
      }
      int temp=a[i];
      a[i]=a[smallestIndex];
      a[smallestIndex]=temp;
    }
    return a;
  }
  public static int[] bSort(int a[])
  {
    boolean changed = false;
    do{
      changed = false;
      for(int i= 0; i<a.length-1; i++)
      {
        if(a[i] > a[i+1])
        {
          int temp = a[i];
          a[i] = a[i+1];
          a[i+1] = temp; 
          changed = true;
        }
      }
    }while(changed);
    return a;
  }
}