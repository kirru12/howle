package com.github.Matrixx;
jgjkggjh
import java.util.Scanner;

public class Addmatrices {

	public static void main(String[] args) {
		
		int  c,first,last,middle,n,search,array[];
		
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in); 
System.out.println("enter number of elements");
n = in.nextInt();
array =new int[n];
System.out.println("enter"+n+"integers");
for(c=0;c<n;c++)
{array[c]=in.nextInt();
 fjgbcu7jvc nhy8i


System.out.println("enter value to find ");
search =in.nextInt();
first =0;
last=n-1;
middle =(first+last)/2;
if(array[middle]<search) 
	first =middle+1;else if(array[middle]==search) {
System.out.println(search +"found at location"+(middle+1)+".");
break;}
	
	else
		last =middle-1;
middle =(first +last)/2;

	if(first>last) 
	System.out.println(search +"is not present in the list.\n");
	
}
	}		// TODO Auto-generated method stub

	}
h,dhmfujydtjh

