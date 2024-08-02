//2013111089 ÇÑªÃ¾Å ¾§ÉìÇÔÅÑÂ
import java.util.Scanner;
public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hour pay rate :");
		double Hpr = sc.nextDouble();
		System.out.print("Regular Hour :");
		int H = sc.nextInt();
		System.out.print("Over time :");
		int Ot = sc.nextInt();
		System.out.println();
		System.out.print("Salary is "+separate(Hpr, H, Ot));
		}
	public static double separate(double hpr,int h, int ot) {
		return (hpr*h)+(ot*hpr*1.5);
	}
}
