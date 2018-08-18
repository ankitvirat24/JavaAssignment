import java.io.*;

import java.util.*;

import java.util.regex.*;

class Assignment
{
  
public static void main(String args[])
 
{
    
Scanner sc=new Scanner(System.in);
    
int n,i;
    
String t=sc.nextLine();
    
String a[]=new  String[100];
 
ArrayList<Integer>r = new ArrayList<>();

n=Integer.parseInt(sc.nextLine());
    	for(i=0;i<n;i++)
   	 
{
      	
a[i]=sc.nextLine();

}
		
for(i=0;i<n;i++)
		
{ 
for(int j=-1;(j=t.indexOf(a[i],j+1)) !=-1;)
		
{ r.add(j);
		
}
		
}
	
Collections.sort(r);
	
for(Integer k:r)
	
System.out.print(k+" ");
 }
}