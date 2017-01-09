import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
      Set<Character> set=new HashSet<Character>();
       for(int i=0; i<s.length(); ++i){
           if (!set.contains(s.charAt(i)))
               set.add(s.charAt(i));
           else 
               set.remove(s.charAt(i));
       }
       if(set.size()==0 || set.size()==1)
       {
    	   System.out.println("It is permutation of palindromw");
       }
       else
       {
    	   System.out.println("It is not a permutation of palindromw");

       }
	}

}
