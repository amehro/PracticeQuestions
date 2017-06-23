package misc;

import java.util.Comparator;

class Movie  
{
    private double rating;
    private String name;
    int year;
 
    // Used to sort movies by year
    public int compareTo(Movie m)
    {
        return this.year - m.year;
    }
 
    // Constructor
    public Movie(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }
 
    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }

	
}

class Rating implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class year implements Comparator<Movie> {
	@Override
	public int compare(Movie o1, Movie o2) {
		if (o1.year > o2.year) return 1;
		if (o1.year < o2.year) return -1;
		return 0;
		
	}
}
