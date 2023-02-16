/*
/* 				//sum of array

import java.util.*;
public class SumOfArray
 {
  public static void main(String[] args)
     {
	 int[] a={100,90,80,70,60};
	 int add=0;
	 for(int i=0;i<a.length;i++)
	   {
	   	add=add+a[i];
		}
		System.out.print(add);
    }
 }
 
/*			    //use scanner  Array 

import java.util.Scanner;
import java.util.*;
public class ArrayTask
 {
  public static void main(String[] args)
     {
		  int[] c=new int[5];
	 Scanner input=new Scanner(System.in);
	 for(int i=0;i<=4;i++)
	 {
	 System.out.println("Enter a number");
       c[i]=input.nextInt();
	 }
	 	System.out.println(Arrays.toString(c));
    }
 }
 
/*			    //Deletetion Array
 
import java.util.*;
public class DeletionArray
 {
  public static void main(String[] args)
     {
     int[] a={10,2,30,40,5,60};
	 int[] b=new int[5];
	 System.out.println(Arrays.toString(a));
	    int i=0;
	     int j=0;
	      while(i<=5)
	       {
			   if(i!=2)
			   {
			    b[j]=a[i];
			    j=j+1;
			   }
			 i++;
	       }
	System.out.println(Arrays.toString(b));
    }
 }
/*				//Insertion Array
 
import java.util.*;
public class Insertion
 {
  public static void main(String[] args)
     {
     int[] a={10,2,30,40,5,60};
	 int[] b=new int[7];
	       b[3]=3;
	    int i=0;
	     int j=0;
	      while(i<=6)
	       {
			   if(i!=3)
			   {
			     b[i]=a[j];
			 j=j+1;
			   }
			   i++;
	       }
	System.out.println(Arrays.toString(b));

    }
 }
 
/*				//odd / even Array
 
 public class OddArray
 {
  public static void main(String[] args)
    {
      int a[]={3,8,5,2,4,9};
	  for(int i=0;i<=5;i++)
	   {
	    if(a[i]%2==0)
	     System.out.println(a[i]);
	   }
	}
 }
 
/*			  //Prime Array
 
public class ArrayTask
{
 public static void main(String args[])
  {
  for(int n=2;n<=10;n++)
  {
	 	boolean a=false;
      for(int i=2;i<=n/2;i++)
	   {
		  if(n%i==0)
		  {
		   a=true;
		   break;
		  }
	  }
	if(!a)
	    System.out.println(n);
  } 
  }
}

*/            //decending

import java.util.*;
public class ArrayTask
{
	public static void main(String[] args)
	{
		int[] arr={5,9,1,0,4,7,3,8};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
		  for(int j=i+1;j<arr.length;j++)
		  {
			if(arr[i]<arr[j])
			{
				temp=arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;
			}
		  }
		}
		System.out.println(Arrays.toString(arr));
	}
}
/*   end    */