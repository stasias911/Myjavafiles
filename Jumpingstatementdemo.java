package jumpingstatement;

public class Jumpingstatementdemo {

	public static void main(String[] args) {

		for (int a = 1; a <= 10; a++)

		{

			if (a == 7)
//jumping statements (if there is a break it will stop the code and is false) 
				//if continue than it will only skip that (condition)
			{
				continue;
			}

			System.out.println(a);
		}
	}
}