
public class Example2 {

	public static void main(String[] args) {
		
		int [] nums =  { 12, 50, 93, 45, 75, 52, 80 };
		int count = 0;
		
		System.out.print("List of number divided by 5 : ");
		
		for (int _nums : nums)
		{
			if (_nums % 5 == 0)
			{
				System.out.print(_nums + " ");
				count++;
			}
		}
		
		System.out.println("\nThere are " + count + " number.");


	}

}
