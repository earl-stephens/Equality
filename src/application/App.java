package application;

public class App {

	public static void main(String[] args) {
		
		int cats = 42;
		int dogs = 23;
		int weasels = 42;
		
		boolean moreCatsThanDogs = cats > dogs;
		
		System.out.println("More cats than dogs: " + moreCatsThanDogs);
		
		// %b is used for boolean variables
		System.out.printf("Same number of cats and weasels: %b\n", cats == weasels);
		System.out.printf("Same number of cats and dogs: %b\n", cats == dogs);
		
		/* If both of the variables are the same when using greater/less than
		 * then == will return false
		 */
		System.out.printf("Number of cats greater than number of weaseels: %b\n", cats > weasels);
		
		// Don't use == with doubles.  The values are not exact

	}

}
