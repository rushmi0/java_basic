import java.util.Scanner;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject;

public class Lab504 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input name : ");
		String name = sc.next();
		sc.nextLine();
		// contains = ��Сͺ����
		while (!name.contains(" ") || name.lastIndexOf(" ") != name.indexOf(" ") || name.startsWith(" ")
				|| name.endsWith(" ")) {
			System.out.print("Input name, again : ");
			name = sc.next();
			sc.nextLine();
		}

		System.out.println();
		int a = name.indexOf(" ");// <===================================================\
		String f_name = name.substring(0, a); // �觢�ͤ�����������˹觷�� 0 ��件֧ a (a ���� spasebar)==\
		String l_name = name.substring(a + 1);// ����͹�Ѵ�ҡa(spasebar)��˹�觵��˹觤�������� game {haha}
		System.out.print("Show name is format = " + l_name.toLowerCase().charAt(0) + "." + f_name.toLowerCase());

	}

}
