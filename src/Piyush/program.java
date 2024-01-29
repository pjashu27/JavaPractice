package Piyush;
import java.util.*;
public class program
{
   public static void main(String[] args)
   {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the size of font:");
	  int num=scan.nextInt();
	  
	  for(int i=0;i<=num-1;i++)
	  {
		  for(int p=0;p<=num-1;p++)
			{
				if(((i==0 && p!=0 && p!=num/2) && (p<=num/2) || (p==num/2 && i<num/2 && i!=0) || (i==num/2&&p<=num/2 && p!=num/2)|| (p==0 && i!=0)))
					System.out.print("*");
				else 
					System.out.print(" ");
			 
			}
		  
		 
		  
		  for(int j=0;j<=num-1;j++)
			{
				if(i==0 ||  i==num-1 || j==num/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		  
		  for(int space=0;space<=5;space++)
		  {
			  System.out.print(" ");
		  }
		  
		  for(int y=0;y<=num-1;y++)
			{
				if((i==y && i<num/2) || ( y==num/2 && i>num/2) || (i+y==num-1 && i-1<num/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
		  
		  for(int space=0;space<=5;space++)
		  {
			  System.out.print(" ");
		  }
		  
		  for(int u=0;u<=num-1;u++)
			{
				if( (i==num-1 && u!=num-1 && u!=0)|| (u==num-1 && i!=num-1 )||(u==0 && i!=num-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
		  
		  for(int space=0;space<=5;space++)
		  {
			  System.out.print(" ");
		  }
		  
		  for(int s=0;s<=num-1;s++)
			{
				if((i==0 && s!=0)|| (i==num-1 && s!=num-1)|| (i==num/2 && s!=num-1 && s!=0)|| ( s==0 && i< num/2 && i!=0) || (s==num-1 && i>=num/2+1 && i!=num-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
		  
		  for(int space=0;space<=5;space++)
		  {
			  System.out.print(" ");
		  }
		  
		  for(int h=0;h<=num-1;h++)
		  {
			  if(h==0||h==num-1||i==num/2)
				  System.out.print("*");
			  else
				  System.out.print(" ");
			  
		  }
		  
		  for(int space=0;space<=15;space++)
		  {
			  System.out.print(" ");
		  }
		  
		  for(int j=0;j<=num-1;j++)
		  {
			  if(i==0 || (j==num/2 && i!=num-1)|| (i==num-1&&j<num/2 && j!=0) || (j==0&&i>num/2 && i!=num-1))
			  {
				  System.out.print("*");
				  
			  }
			  else
				  System.out.print(" ");
		  }
		  for(int space=0;space<=5;space++)
		  {
			  System.out.print(" ");
		  }
		  
		  for(int j=0;j<=num-1;j++)
			{
				if((i==0 && j!=0 && j!=num-1)|| i==num/2 || (j==num-1 && i!=0)|| (j==0 && i!=0))
					System.out.print("*");
				else
					System.out.print(" ");
			}
		  
		  for(int space=0;space<=5;space++)
		  {
			  System.out.print(" ");
		  }
		  
		  for(int j=0;j<=num-1;j++)
			{
				if(i==0 ||  i==num-1 || j==num/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		  
		  for(int space=0;space<=5;space++)
		  {
			  System.out.print(" ");
		  }
		  
		  for(int j=0;j<=num-1;j++)
			{
				if(j==0||j==num-1||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		  
		  System.out.println();
		  
	  }
	  scan.close();
   }
}
