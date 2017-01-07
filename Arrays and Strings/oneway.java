import java.util.Scanner;


public class oneway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s="pale";
		String t="bake";
		boolean b= OneWay(s,t);
		System.out.println(b);
	}

	private static boolean OneWay(String s, String t) {
		// TODO Auto-generated method stub
		if(Math.abs(s.length()-t.length())>1)
			return false;
		int i=0,j=0,count=0;
		while(i<s.length() && j<t.length() )
		{
			if(s.charAt(i)==t.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				count++;
				if(count>1)
					return false;
				if(s.length()>t.length())
					i++;
				else if(t.length()>s.length())
					j++;
				else
				{
					i++;
					j++;
				}
			}
		}
		if(i<s.length() || j<t.length())
			count++;
		if(count==1)
			return true;
		
		return false;
	}

}
