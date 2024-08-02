import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab602 {

	public static void main(String[] args) {
		
		Scanner ss = new Scanner(System.in);
		float[] score = new float[5];
		DecimalFormat frm = new DecimalFormat("##.##");
		float sum = 0;
		for (int i = 0; i < score.length; i++)
		{
			System.out.print("Input score of student " + (i + 1) + " : ");
			score[i] = ss.nextFloat();
			sum = sum + score[i];
		}
		double average = sum/score.length;
		System.out.println();
		System.out.println("Average of " + score.length + " student is " + frm.format(average));
		int count=1;
		for (float _score : score)
		{
			if (_score > average)
			{
				System.out.println(">Student " + count + " (" + _score + ")" );
			    
			}
			count++;
		}
	}

}
