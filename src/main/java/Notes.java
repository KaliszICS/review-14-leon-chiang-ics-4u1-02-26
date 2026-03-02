
class Notes {
	public static void main(String[] args) {

		System.out.println("Hello() b c d e f g h i j".replaceAll("\\(\\)", ""));

		//constants - variables

		final int MAXIMUM = 20; //final makes this a constant, it cannot be altered in the future

		//eliminate magic numbers
		//magics are numbers we use to solve a problem that lack a frame of refernce

		int[] nums = {1, 3, 5};

		for (int i = 0; i < 3; i++) {
		// for (int i = 0; i < nums.length; i++)
			System.out.println(nums[i]);
		}

		//making a game
		//maximum amount of turns

		int turns = 0;
		// int maximum = 10;

		// MAXIMUM++; //constants can't be changed
		if (turns < MAXIMUM) {

		}

		//random code goes here

		if (turns < MAXIMUM) {
		}

		for (int i = 0; i < MAXIMUM; i++) {

		}

		//compareTo - comparing non-primitive data types

		String word1 = "ant";
		String word2 = "Zoo";

		System.out.println(word1.equals(word2));

		System.out.println(word1.compareTo(word2));
		System.out.println(word2.compareTo(word1));

		// Negative number means earlier
		// 0 means the same
		// Positive number means later

		//switch statement

		int num = 0;

		// if (num == 1) {
			
		// }
		// if (num == 2) {
			
		// }
		// if (num == 3) {
			
		// }
		// if (num == 4) {
			
		// }
		// if (num == 5) {
			
		// }
		// if (num == 6) {
			
		// }

		switch(num) {
			case 1:
				//run code here]
				break; // or this will run all other cases below it
			case 2:
			case 3:
			case 4:
			case 5:
			default:
				//basically the else case
		}



		

	}
}
