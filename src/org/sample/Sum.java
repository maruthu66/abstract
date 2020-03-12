package org.sample;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//Declaration of Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.println("START");
        byte b = sc.nextByte();
        System.out.println("Byte: "+b);
        int nextInt = sc.nextInt();
        System.out.println(nextInt);
        long nextLong = sc.nextLong();
        System.out.println(nextLong);
        float nextFloat = sc.nextFloat();
        System.out.println(nextFloat);
        double nextDouble = sc.nextDouble();
        System.out.println(nextDouble);
        short nextShort = sc.nextShort();
        System.out.println(nextShort);
        //It ignores the space
        String next = sc.next();
        System.out.println(next);
        //It accepts the space
        String nextLine = sc.nextLine();
        System.out.println(nextLine);
        boolean b2 = sc.nextBoolean();
        System.out.println(b2);
	}
}