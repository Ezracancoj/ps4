package edu.monmouth.problemSet4;
import java.util.Random;

import edu.monmouth.grade.Grade;

public class ProblemSet4 {
	
	final static int NUMBER_OF_COURSES = 4;
	final static int LOWER_GRADE_BOUNDS=31;
	final static int UPPER_GRADE_BOUNDS=70;
	
	public static void main(String[] args) {
		// verify constructors 
		Grade verify = new Grade("B");
		System.out.println("Score for Grade of B: " + verify.getScore() + " " + verify.getGradeValue());
		verify = new Grade("A-");
		System.out.println("Score for Grade of A-: " + verify.getScore() + " " + verify.getGradeValue());
		verify = new Grade('C');
		System.out.println("Score for Grade of C: " + verify.getScore() + " " + verify.getGradeValue());
		
		// declare and allocate memory for 3 arrays of Grade object references
		Grade student1[] = new Grade[NUMBER_OF_COURSES];
		Grade student2[] = new Grade[NUMBER_OF_COURSES];
		Grade student3[] = new Grade[NUMBER_OF_COURSES];
		
		// fill the 3 arrays of Grade object references with 4 different Grade objects 
		// each with different numeric values - randomly generated (somewhat)
		fillGrades(student1);
		fillGrades(student2);
		fillGrades(student3);
		
		System.out.println("student1 grades:");
		for(Grade grade : student1) {
			System.out.println(grade.getScore()+" "+grade.getGradeLetter());
		}
		System.out.println("student2 grades:");
		for(Grade grade : student2) {
			System.out.println(grade.getScore()+" "+grade.getGradeLetter());
		}
		System.out.println("student3 grades:");
		for(Grade grade : student3) {
			System.out.println(grade.getScore()+" "+grade.getGradeLetter());
		}
		
		// print the lowest Grade for each of the 3 Grade arrays
		Grade lowestGrade = findLowest(student1);
		System.out.println("Lowest grade for student1: " + lowestGrade.getScore());
		lowestGrade = findLowest(student2);
		System.out.println("Lowest grade for student2: " + lowestGrade.getScore());
		lowestGrade = findLowest(student3);
		System.out.println("Lowest grade for student3: " + lowestGrade.getScore());
		
		// print the highest Grade for each of the 3 Grade arrays
		Grade highestGrade = findHighest(student1);
		System.out.println("Highest grade for student1: " + highestGrade.getScore());
		highestGrade = findHighest(student2);
		System.out.println("Highest grade for student2: " + highestGrade.getScore());
		highestGrade = findHighest(student3);
		System.out.println("Highest grade for student3: " + highestGrade.getScore());
		
		// print the average score for each of the 3 Grade arrays
		double averageScore = average(student1);
		System.out.println("student1 average: " + averageScore);
		averageScore = average(student2);
		System.out.println("student2 average: " + averageScore);
		averageScore = average(student2);
		System.out.println("student2 average: " + averageScore);
		
	}
	
	static void fillGrades(Grade[] grades) {
		Random random = new Random();
		for(int i=0; i<grades.length; i++) {
			// generate a random number between 0 and 30, then add 70 to that number
			int randomNum = random.nextInt(LOWER_GRADE_BOUNDS) + UPPER_GRADE_BOUNDS;
			grades[i] = new Grade();
			grades[i].setScore(randomNum);	
		}
	}
	static Grade findLowest(Grade[] grades) {
		Grade lowest = grades[0];
		for(Grade grade : grades) {
			if(grade.getScore() <lowest.getScore()) {
				lowest = grade;
			}
			
		}
		return lowest;
	}
	
	static Grade findHighest(Grade[] grades) {
		Grade highest = grades[0];
		for(Grade grade : grades) {
			if(grade.getScore() > highest.getScore()) {
				highest = grade;
			}
			
		}
		return highest;
		
	}
	
	static double average(Grade[] grades) {
		double sum = 0;
		for(Grade grade : grades) {
			sum += grade.getScore();
			
		}
		
		return sum/grades.length; 
	}
}
