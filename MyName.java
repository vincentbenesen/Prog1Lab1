public class MyName{
	
	public static void main ( String [] args ){

	String name = "Benesen Vincent";

	String lastname = name.substring (0, 7);

	String firstName = name.substring (8); 

	String firstletter = lastname.substring (0,1);
	 firstletter = firstletter.toLowerCase();
	String nameRemainder = lastname.substring (1);
	nameRemainder = nameRemainder.toLowerCase ();

	 lastname = firstletter + nameRemainder; 

	 String lastFirstLetter = firstName.substring (0,1);
	  lastFirstLetter = lastFirstLetter.toLowerCase ();
	 String lastRemainder = firstName.substring (1);
	 	lastRemainder = lastRemainder.toLowerCase();

	 firstName = lastFirstLetter + lastRemainder;

	System.out.println (firstName + " " + lastname);



	}
}