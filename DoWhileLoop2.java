package loops;

public class DoWhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20;

		do {

			System.out.println(a);

			a++;

		} while (a <= 10);
//this will not work because a<=10 is false, 20 is not less than 10
	}

}
