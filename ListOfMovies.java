import java.util.ArrayList;
import java.util.Scanner;

public class ListOfMovies {
	
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    String Choice;
	    
	    ArrayList <MovieList> numbers =new ArrayList<MovieList>();
	    
	   String movieCategory;
	   String movieCetegori;
	
	   // String scanner = scanner.toString();
      
	   System.out.println(" Welcome to movie application!");
	   
	  System.out.print("What categor ar eyou interested?");
			
		numbers.add (new MovieList("friends", "Comedy"));
		numbers.add (new MovieList("friends", "Comedy"));
		numbers.add (new MovieList("Citizen Kane", "Drama"));
		numbers.add (new MovieList("The Godfather", "Drama"));
		numbers.add (new MovieList("2001: A Space Odyssey", "scifi"));
		numbers.add (new MovieList("E.T. The extra-terrestrial", "scifi"));
		numbers.add (new MovieList("King Kong", "Horror"));
		numbers.add (new MovieList("Jaws", "Horror"));
		numbers.add (new MovieList("My Fair Lady", "musical"));
		numbers.add (new MovieList("Fantasia", "animated"));
		numbers.add (new MovieList("friends", "Comedy"));
	
	
	// System.out.println(ml.get(0));
	
		System.out.print("--------------");
		String cat=scanner.next(); 
	for (MovieList ml : numbers){
		String MovieList = ml.getCategory();
		if (cat.equals(MovieList)){
		
	System.out.println("Movie " + ml.getTitle());
		}
	//	System.out.println("Do you want to continue ")(yes/No);
	}
	
	}
}



