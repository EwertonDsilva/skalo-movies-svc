
public class MovieServiceTest {
    public static void main(String[] args) {
    	MovieService movieService = new MovieService();

        MovieRequest request = new MovieRequest();
        request.setTitle("Inception");
        request.setYear(2010);
        request.setDirector("Christopher Nolan");

        MovieResponse response = movieService.addMovie(request);

        System.out.println("MovieService: " + response.getTitle() + ", " + response.getYear() + ", " + response.getDirector());
    }
}
