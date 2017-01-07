import java.util.Arrays;
import java.util.Scanner;


public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    String s1,s2;
     s1=sc.nextLine();
     s2=sc.nextLine();
     s1=s1.toLowerCase();
     s2=s2.toLowerCase();
     if(s1.length()!=s2.length()) 
     System.out.println("Not an anagram");
     char[] c1=s1.toCharArray();
     char[] c2=s2.toCharArray();
      Arrays.sort(c1);
      Arrays.sort(c2);
    	if(Arrays.equals(c1, c2))
        System.out.println("anagram");
    	else
       System.out.println("Not an anagram");
    }
	}


