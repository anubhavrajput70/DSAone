package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class PostfixEvaluation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp= "32+7*4-";
		System.out.print(postfix(exp));
	}

	static int postfix(String exp)
	{
		Deque<Character> d=new ArrayDeque<>();
		for(int i=0;i<exp.length();i++)
		{
			int res=0;
		if(exp.charAt(i)!='-'||exp.charAt(i)!='+'||exp.charAt(i)!='/'||exp.charAt(i)!='*')
			d.push(exp.charAt(i));
		else
		{
			i++;
		char op=exp.charAt(i);
		int second_op=(int)d.pop();
		int first_op=(int)d.pop();
		
		switch(op)
		{
		case '-':
			res=first_op-second_op;
			break;
		case '/':
			res=first_op/second_op;
			break;
		case '*':
			res=first_op*second_op;
			break;
		case '+':
			res=first_op+second_op;
			break;
		
		}
		System.out.println(res);
		d.push((char)res);
		}
		
	}
		return (int)d.pop();
}}
