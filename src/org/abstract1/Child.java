package org.abstract1;

public class Child extends Abstract {
	@Override
	public void car() {
		System.out.println("honda");
	}

	@Override
	public void bke() {
		System.out.println("hero");
	}
	public static void main(String[] args) {
		Child c =new Child();
		c.bke();
	}
	
	
}
