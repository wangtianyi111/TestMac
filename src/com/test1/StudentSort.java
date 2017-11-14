package com.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			ArrayList<Student> students = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				Student student = new Student(scanner.next(), scanner.nextInt(), scanner.nextInt());
				for (int j = 0; j < students.size(); j++) {
					if (students.get(j).getName() == student.getName() && students.get(j).getScore() == student.getScore() && students.get(j).getAge() == student.getAge() ) {
						students.remove(j);
					}
				}
				students.add(student);
			}
			studentSort(students);
			for (int i = 0; i < students.size(); i++) {
				students.get(i).printStudent();
			}
		}
	}

	public static void studentSort(ArrayList<Student> students) {
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if ((s1.getScore() - s2.getScore()) != 0) {
					return s1.getScore() - s2.getScore();
				} else if (s1.getName().compareTo(s2.getName()) != 0) {
					return s1.getName().compareTo(s2.getName());
				}else{
					return s1.getAge() - s2.getAge();
				}
			}
		});
	}
}

class Student implements Comparable<Student> {
	private String name;
	private int age;
	private int score;
	
	public Student(String name,int age,int score){
		this.age = age;
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		return 0;
	}

	public void printStudent() {
		System.out.println(this.getName() + " " + this.getAge() + " " + this.getScore());

	}

}
