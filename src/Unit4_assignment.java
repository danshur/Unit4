
public class Unit4_assignment {
/*
	1. Write a program that uses a for loop to print the contents of the main method’s args array.
	2. Change the above program to use a foreach loop.
	3. Change the above program to use a while loop.
	4. Write a program that uses a for loop to print the squares of the integers between 0 and 25.
*/	
	public static void main(String[] args) {		
		
		// each of the assignment parts are a separate method.
		forLoop(args);
		forEachLoop(args);
		whileLoop(args);
		forLoopSquares(args);
	}
	
	private static void forLoopSquares(String[] args) {
		for (int i = 0; i <= 25; i++) {
			System.out.println("Square of [" + i +  "] = " + i*i);
		}
		
	}

	private static void whileLoop(String[] args) {
		int counter = 0;
		while ( counter < args.length )
		{
			System.out.println("While Loop Argument [" + counter +  "] = " + args[counter++]);
		} 
	}

	private static void forEachLoop(String[] args) {
	int counter = 0; //just using counter for index
	for (String a : args)
		System.out.println("For Each Loop Argument [" + counter++ +  "] = " + a);
	}

	public static void forLoop(String[] args) {
		for (int i=0; i < args.length; i++) {
			System.out.println("For Loop Argument [" + i + "] = " + args[i]);
		}
	}
	

}
