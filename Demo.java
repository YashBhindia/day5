package com.masai;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Objects to be created");
		int total = sc.nextInt();
		Student[] s2 = new Student[total];
		
		for(Student i:s2)
		{
			System.out.println(i);
		}
	}
}
