package HwDay8;

public class Question33 {
	public static void main(String[] args) {

		// for loop

		int total = 0;
		int average = 0;
		int count = 0;

		for (int number = 20; number <= 30; number++) {

			total = total + number;
			count++;
		}
		average = total / count;

		System.out.println(average);
		System.out.println("**********");

		// while loop

		total = 0;
		count = 0;
		average = 0;

		int num = 20;

		while (num <= 30) {

			total = total + num;
			num++;
			count++;
		}
		average = total / count;
		System.out.println(average);

		System.out.println("**************");

		// do while loop

		average = 0;
		total = 0;
		count = 0;

		int n = 20;
		do {
			total = total + n;
			n++;
			count++;
		} while (n <= 30);
		average = total / count;

		System.out.println(average);

		

	}

}
