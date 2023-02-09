/*	For Loop
 * 	ForEach Loop
 * 	While Loop
 * 	Do While Loop
 */

public class Loops {
	
	public static void main(String[] args)
	{
		forLoop();
		whileLoop();
		doWhileLoop();
		forEachLoop();
	}
	
	// For Loop
	private static void forLoop()
	{
		for(int i=0; i<10; i++)
			System.out.print(i+" For Loop");
	}
	
	//While Loop
	protected static void whileLoop()
	{
		System.out.println();
		int i=0;
		while(i<10)
		{
			System.out.print(i+" While Loop");
			i++;
		}
	}
	
	// Do While Loop
	static void doWhileLoop()
	{
		System.out.println();
		int i=0;
		do {
			System.out.print(i+" Do While Loop");
			i++;
		}while(i<10);
	}
	
	// ForEach Loop
	public static void forEachLoop()
	{
		System.out.print("\n\nForeach Loop \n");
		int arr[] = {1,2,3,4,5,6,7,9,8,10};
		String[] list = {"Arhind", "Shubham", "Rob", "Alex"};
		
		// Integer Array
		for( int i : arr)
			System.out.println(i);
		
		// String Array
		for( String s : list)
			System.out.println(s);
	}
}