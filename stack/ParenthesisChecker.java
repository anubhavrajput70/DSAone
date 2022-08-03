package stack;

import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="(()){{}}[]";
		if(isParenthesisMatching(s))
			System.out.println("parenthesis matched");
		else
			System.out.println("parenthesis mismatched");
	}
	static boolean isParenthesisMatching(String str)
	{
		Stack<Character> s=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			char cur=str.charAt(i);
			if(isOpening(cur))
					s.push(cur);
			else
			{
				if(s.isEmpty())
					return false;
				else if(!isMatching(s.peek(),cur))
					return false;
				else
					s.pop();
			}
		}
		return s.isEmpty();
	}
	static boolean isOpening(char c)
	{
		if(c=='('||c=='{'||c=='[')
			return true;
		else 
			return false;	
	}
	static boolean isMatching(char a,char b)
	{
		if((a=='('&&b==')')||(a=='{'&&b=='}')||(a=='['&&b==']'))
			return true;
		else 
			return false;
	}
}
