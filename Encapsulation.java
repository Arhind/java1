//	Getting private properties values from set & get methods

public class SetGetMethod {

	private static String name;
	private static int age;
	
	public static void set(String n1, int a1)
	{
		name = n1;
		age = a1;
	}
	
	public static void get()
	{ 
		System.out.println(name+"'s age is : "+age);
	}
	
	public static void main(String[] args) {
	
		set("Arhind", 26);
		get();
	}
}