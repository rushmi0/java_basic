//2013111089 วัชรพล พงษ์วิลัย
import java.io.*;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) throws IOException {
		String[] grade = { "Very Good", "Good", "Average", "Fail" };
		Scanner read = new Scanner(new File("List107.txt"));
		for (String _grade : grade) {

			if (countStudent(_grade) != 0) {
				System.out.println("-------------------------------------------------------------");
				System.out.println("\tLIST OF STUDENT WITH GRADE: " + _grade.toUpperCase() + " (" + countStudent(_grade) + ")");						
				System.out.println("-------------------------------------------------------------");
				while (read.hasNext()) {
					String[] data = read.nextLine().split("\t");
					showListStudent(_grade);
					break;
				}
			}

		}
		read.close();
	}

	public static void showListStudent(String grade) throws IOException {
		Scanner read = new Scanner(new File("List107.txt"));
		int num = 1;
		while (read.hasNext()) {
			String[] data = read.nextLine().split("\t");
			float mid = Float.parseFloat(data[4]);
			float fin = Float.parseFloat(data[5]);
			if (findGrade(mid, fin).equals(grade)) {
				System.out.println(num++ + ") " + data[0] + " " + data[2] + " (Sec" + data[3] + ")");
			}

		}
		read.close();
	}

	public static String findGrade(float mid, float fin) {
		float grade = mid + fin;
		if (grade >= 55)
			return "Very Good";
		if (grade >= 40)
			return "Good";
		else if (grade >= 20)
			return "Average";
		return "Fail";
	}

	public static int countStudent(String grade) throws IOException {
		Scanner read = new Scanner(new File("List107.txt"));
		int num = 0;
		while (read.hasNext()) {
			String[] data = read.nextLine().split("\t");
			float mid = Float.parseFloat(data[4]);
			float fin = Float.parseFloat(data[5]);
			if (findGrade(mid, fin).equals(grade)) {
				num++;
			}
		}
		return num;
	}
}
