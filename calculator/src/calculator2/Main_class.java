package calculator2;
import java.util.*;
import calculator1.*;

public class Main_class {

	public static void main(String args[])
	{
		Operations o=new Operations();
		double a,b,res=0;;
		char c;
		Scanner s=new Scanner(System.in);
		a=s.nextDouble();
		b=s.nextDouble();
		System.out.println("{ + , - , * , / }");
		String s1=s.next();
		c=s1.charAt(0);
		switch(c)
		{
		case '+': res=o.add(a,b);break;
		case '-':res=o.subtract(a,b);break;
		case '*':res=o.multiply(a,b);break;
		case '/':if(b==0) {
				System.out.println("canot divide with zero");System.exit(0);}
				else 
				res=o.divide(a, b);
				break;
		}
	  s.close();
		System.out.print(res);
	}
}
