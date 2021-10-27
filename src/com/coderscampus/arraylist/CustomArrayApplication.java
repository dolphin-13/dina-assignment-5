package com.coderscampus.arraylist;


public class CustomArrayApplication {

	public static void main(String[] args) {

		CustomList<Student> students = new CustomArrayList<>();
		
		System.out.println("Initial number of students: " + students.getSize());
		System.out.println("Initial first student: " + students.get(0));
		System.out.println("Now we have students: ");
		populateStudentsData(students);
		System.out.println("Number of students: " + students.getSize());
		System.out.println("Student#13: " + students.get(12));
	}
	private static void populateStudentsData(CustomList<Student> students) {
		for (int i = 0; i < 15; i++) {
			Student student = new Student("Emma" + (i + 1), "Do" + (i + 1));
			students.add(student);
			System.out.println(student);
		}
	}

}
