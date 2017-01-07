import java.util.Scanner;


public class URlify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine(); 
	 int spacecount=0;
	 int index;
	 int truelength=sc.nextInt();
           char ch[]=s.toCharArray();
      System.out.println(ch);
          for(int i=0;i<truelength;i++)
      { 
    	  if(ch[i]==' ')
    	  spacecount++;
      }  
      System.out.println(spacecount);
      index=truelength+spacecount*2;
      if(truelength<ch.length)
    	  ch[truelength]='\0';
      for(int i=truelength-1;i>=0;i--)
      {
    	  if(ch[i]==' ')
    	  {
    		  ch[index-1]='0';
    		  ch[index-2]='2';
    		  ch[index-3]='%';
    		  index=index-3;
    	  }
    	  else
    	  {
    		  ch[index-1]=ch[i];
    		  index--;
    	  }
      }
      
      System.out.println(ch);

        
	}

}
