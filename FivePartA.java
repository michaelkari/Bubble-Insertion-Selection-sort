import java.util.*;
public class FivePartA
{
  public static void main(String[]args)
  {
    int a[] = new int[] {  2, 9, 4, 8, 0 };
    int a1[] = new int[] { 2, 9, 4, 8, 0 };
    int a2[] = new int[] { 2, 9, 4, 8, 0 };
    int compare = 0;
    int access = 0;
    iSort(a, compare, access);
    sSort(a1, compare, access);
    bSort(a2, compare, access);
  }
  public static void iSort(int a[], int compare, int access)
  {
    System.out.println("\nInsertion Sort");
    System.out.println("Array: " + Arrays.toString(a)+ "\n");
    int temp = 0;
    int pos = 0;
    for(int i = 1; i<a.length; i++)
    {
      temp = a[i];
      pos = i;
      compare = 0;
      access =0;
      while(0<pos&&temp<a[pos-1])
      {
        a[pos] = a[pos-1];
        pos--;
        access++;
       compare++;
      }
      a[pos] = temp;
     if(!(0<pos&&temp<a[pos-1]))
     {
      compare++;
     }
     System.out.print("Variable i = " + i + ": [ ");
     for(int p=0;p<a.length;p++){
        System.out.print(a[p]+" ");
      }
     System.out.println("] \nComparisons: " + compare);
     System.out.println("Accesses: " + access);
    }
  }
  public static void sSort(int a[], int compare, int access)
  {
    System.out.println("\nSelection Sort");
    System.out.println("Array: " + Arrays.toString(a)+ "\n");
    access=0;
    int smallestIndex =0;
    for(int i = 0; i<a.length-1; i++)
    {
      compare = 0;
      access = 0;
      smallestIndex = i; 
      for(int j =i+1; j<a.length; j++)
      {
        compare++;
        if(a[j]<a[smallestIndex])
        {
          access=1;
          smallestIndex = j;
        }
      }
      int temp=a[i];
      a[i]=a[smallestIndex];
      a[smallestIndex]=temp;
      System.out.print("Variable i = " + i + ": [ ");
      for(int p=0;p<a.length;p++){
        System.out.print(a[p]+" ");
      }
      System.out.println("] \nComparisons: " + compare);
      System.out.println("Accesses: " + access);
    }
  }
  public static void bSort(int a[], int compare, int access)
  {
     System.out.println("\nBubble Sort");
     System.out.println("Array: " + Arrays.toString(a)+ "\n");
     int counter=0;
     boolean changed = false;
     do{
       changed = false;
       compare=0;
       access=0;
       for(int i= 0; i<a.length-1; i++)
       {
         compare++;
         if(a[i] > a[i+1])
         {
           access++;
           int temp = a[i];
           a[i] = a[i+1];
           a[i+1] = temp; 
           changed = true;
         }
       }
       System.out.print("Variable i = " + counter + ": [ ");
       for(int p=0;p<a.length;p++){
         System.out.print(a[p]+" ");
       }
       System.out.println("] \nComparisons: " + compare);
       System.out.println("Accesses:"+access);
       counter++;
     }while(changed);
   }
}