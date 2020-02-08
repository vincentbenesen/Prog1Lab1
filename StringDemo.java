public class StringDemo{
	
	public static void main ( String [] args){

	String s1 = new String ( "My name ");
	String s2 = "is Vincent ";

	System.out.println (s1 + s2);
	System.out.println (s1.toUpperCase() + s2.toUpperCase());


	String greeting = "Happy Valentines";
	int len = greeting.length ( );


	 String greetingUpper = greeting.toUpperCase ();
	 char greetingFirstLetter = greeting.charAt (0);
	 char greetingLastLetter = greeting.charAt (15);
	 int indexOfV = greeting.indexOf ('V');
	 int indexOfT = greeting.indexOf ("t");

	System.out.println ( greetingUpper + "\nThe first letter in Happy Valentines is " + " " +greetingFirstLetter + " " + "while the last letter is "  +  greetingLastLetter);
	System.out.println ("The index of V is " + indexOfV + " " + "While the index of t is " + " " + indexOfT);

	}
}