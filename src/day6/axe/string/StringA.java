package day6.axe.string;

public class StringA {
	static void convertOpposite(StringBuffer s)
	{
		int ln=s.length();
		for(int i=0;i<ln;i++)
		{
			Character c=s.charAt(i);
			if(Character.isLowerCase(c))

				s.replace(i, i+1, Character.toUpperCase(c)+"");

			else
				s.replace(i, i+1, Character.toLowerCase(c)+"");
		}
	}
			
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("WelcomE");
		convertOpposite(s);
		System.out.println(s);
		
	}}

		
	
    
