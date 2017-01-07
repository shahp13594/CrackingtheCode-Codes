import java.util.Arrays;
import java.util.Scanner;


public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       s=s.toLowerCase();
       s=s.replaceAll("\\s","");
       char ch[]=s.toCharArray();
       Arrays.sort(ch);
       
       System.out.println(ch);
	}

}
