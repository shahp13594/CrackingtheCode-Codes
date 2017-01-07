import java.util.Scanner;


public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String");
      String s=sc.nextLine();
      s=s.toLowerCase();
      boolean a[]=new boolean[128];
      boolean flag=true;
      for(int i=0;i<s.length();i++)
      {
    	  int val=s.charAt(i);
    	  if(a[val])
    	  {
    		 flag=false;
    		  break;
    	  }
    	  a[val]=true;
      }
      if(flag==true)
    	  System.out.println("Unique");
      else
    	  System.out.println("Not unique");
	}

}
