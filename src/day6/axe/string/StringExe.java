package day6.axe.string;

public class StringExe {
	public static void main(String[] args) {
		String s="javaClass@1233";
		boolean a=s.contains("a");
		String n=s.toUpperCase();
		
		boolean e=s.equals("javaClass@1233");
		boolean f=s.equalsIgnoreCase("javaclass@1233");
		
		System.out.println("enter contais"+"=" +a);	
		System.out.println("enter uppercase"+"=" +n);
		System.out.println("enter equals"+"=" +e);
		System.out.println("enter equalsignore"+"=" +f);
		

	}

}
