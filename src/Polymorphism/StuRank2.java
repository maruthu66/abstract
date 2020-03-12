package Polymorphism;

public class StuRank2 extends StuRank{
	
		@Override
	
    public void percentage(int id) {
    	System.out.println("100");
    }
		public static void main(String[] args) {
			StuRank2 s= new StuRank2();
			s.stu1();
			s.percentage(0);
			
		}
}
