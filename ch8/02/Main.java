import java.util.ArrayList;

import customClasses.Student;

public class Main {

    public static void displayStudentInfo(Student someStudent) {
	System.out.printf("Student's name: %s%n", someStudent.getName());
	System.out.printf("Student's number: %s%n", someStudent.getNumber());
	System.out.printf("Grades:%n");
	System.out.printf("\tMaths: %d%n", someStudent.getMathsMark());
	System.out.printf("\tEnglish: %d%n", someStudent.getEnglishMark());
	System.out.printf("\tScience: %d%n", someStudent.getScienceMark());
	System.out.printf("Average mark: %.2f%n",
			  someStudent.calculateAverageMark());
	System.out.printf("Fee: %.2f%n", someStudent.getFee());
    }

    // changes a Student object inplace
    public static void setStudentData(Student someStudent,
				      int mathMarkIn, int englishMarkIn,
				      int scienceMarkIn) {
	someStudent.enterMarks(mathMarkIn, englishMarkIn, scienceMarkIn);
    }

    public static void main(String[] args) {
	ArrayList<Student> students = new ArrayList<Student>();
	students.add(new Student("123", "Tom"));
	students.add(new Student("234", "Peter"));
	students.add(new Student("345", "Bill"));
	// sets students fee
	Student.setFee(3000);

	setStudentData(students.get(0), 1, 2, 3);
	setStudentData(students.get(1), 2, 2, 4);
	setStudentData(students.get(2), 3, 4, 5);

	for (int i = 0; i < 3; i++) {
	    System.out.printf("----------%n");
	    displayStudentInfo(students.get(i));
	    System.out.printf("----------%n%n");
	}

    }
}

