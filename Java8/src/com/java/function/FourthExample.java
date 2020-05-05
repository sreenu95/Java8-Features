package com.java.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FourthExample {

	public static void main(String[] args) {
		
		List<Student>list= populate();
		Function<Student, String> function=student->{
			int marks=student.marks;
			if(marks>=80) {
				return "A grade";
			} else if(marks>=70) {
				return "B grade";
			} else if(marks>=60) {
				return "C grade";
			} else {
				return "fail";
			}
		};
		
		Predicate<Student> predicate=i->i.marks>=80;
		for(Student student: list) {
			if(predicate.test(student)) {
			System.out.println("Name: "+ student.name);
			System.out.println("Marks: "+student.marks);
			System.out.println("Gread:  "+ function.apply(student));
			System.out.println();
			}
		}
	}
	
	public static List<Student> populate() {
		List<Student> list=new ArrayList<>();
		
		list.add(new Student("ram", 90));
		list.add(new Student("kiran", 70));
		list.add(new Student("gopi", 60));
		list.add(new Student("raj", 34));
		return list;
	}
}
class Student {
	public String name;
	public int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	
}