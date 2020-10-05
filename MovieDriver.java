import java.util.Scanner;

/**
 * Movie driver class which tests the
 * movie class
 * @author binya
 *
 */
public class MovieDriver {
	public static void main (String[] args)
	{
		/**
		 * Create a new object of type Scanner 
		 * that reads from the keyboard
		 */
		Scanner keyboard = new Scanner(System.in);
		
		char choice = 'Y';
		while (choice == 'Y' || choice == 'y')
		{
			/**
			 * Create a new movie object
			 */
			Movie watchMovie = new Movie();
			/**
			 * Prompt the user to enter 
			 * the title of a movie 
			 * and enter the title
			 */
			System.out.println("Please enter the title"
					+ " of the movie: ");
			String movieTitle = keyboard.nextLine();
			keyboard.nextLine();
			/**
			 * Set the title in the movie object
			 */
			watchMovie.setTitle(movieTitle);
			/**
			 * Prompt the user to 
			 * enter the movie’s rating
			 * and enter the rating
			 */
			System.out.println("Please enter the rating "
					+ "of the movie: ");
			String movieRating = keyboard.nextLine();
			/**
			 * Set the rating in the movie object
			 */
			watchMovie.setRating(movieRating);
			/**
			 * Prompt the user to enter the number of 
			 * tickets sold at a (unnamed) theater
			 * and enter the number sold
			 */
			System.out.println("Please enter the number"
					+ " of tickets sold: ");
			int numSold = keyboard.nextInt();
			/**
			 * Set the number of 
			 * tickets sold in the movie object
			 */
			watchMovie.setSoldTickets(numSold);
			/**
			 * Print out the information 
			 * using the movie’s toString method
			 */
			System.out.println(watchMovie.toString());
			/**
			 * prompts the user to decide if they 
			 * want to enter another movie title
			 */
			System.out.println("Do you want to enter"
					+ " another movie title? ");
			choice = keyboard.next().charAt(0);
			keyboard.nextLine();
		}
			
		System.out.println("Goodbye");
	}

}
