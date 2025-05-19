/**
 * CD.java: a CD class. 
 *
 * @author: COM102
 * @version 2.00 
 */
public class CD
{	//Declare 4 private instance variables representing 4 properties assciated with a CD
	private String title, artist; 
	private double value; 
	private int tracks;

	/**
         * A constructor is used to create a new CD object
         * @param title
         * @param artist
         * @param value
         * @param tracks 
         */
	public CD (String title, String artist, double value, int tracks)
	{	this.title = title;
		this.artist = artist;
		this.value = value;
		this.tracks = tracks;
	}
        
        /**
         * Print out the details of a CD
         * @return Nothing
         */
	public void printDetails()
	{	// prints out the details of a CD
		System.out.println("CD title: " + this.title);
		System.out.println("Artist's name: " 
			+ this.artist);
		System.out.println("CD value: " + this.value);
		System.out.println("No. of tracks: " 
			+ this.tracks);
	}
}

