import java.util.Scanner;

public class PetDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input pet name  : ");
		String name = sc.nextLine();
		System.out.print("Input pet gender  : ");
		char gender  = sc.next().charAt(0);
		System.out.print("Input birth year  : ");
		int birthyear = sc.nextInt();
		System.out.println();
		
		Pet pet = new Pet();
		
		pet.setName(name);
		pet.setBirthyear(birthyear);
		pet.setGender(gender);
		System.out.print(pet);

	}

}
