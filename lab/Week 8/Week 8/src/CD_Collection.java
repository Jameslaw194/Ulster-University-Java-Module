/**
 * CD_Collection.java: a collection of CD objects 
 *
 * @author : COOM102
 * @version 2.00
 */
public class CD_Collection 
{	// properties
	private CD [] collection; 
	private int size; 	// total number of CDs in 
	// collection
	private double valueCDs;	// total value of the CD 
	// collection 

	//constructor
	public CD_Collection()
	{	
		// creates an initially empty 
		// array ‘collection’ of 10 CDs
		// sets size and valueCDs equal to 0
	}

	public void addCD (String title, String artist, 
	double value, int tracks) 
	{	// creates a new CD object and adds the new CD
		// to the collection 
		// increases the total value of the collection
		// increases the number of CDs in the 
		// collection by 1
	}

	public void details()
	{
		// prints out the details of all the CDs 
		// currently held 
		// in the array collection 
		// and the average cost of a CD 
	}

	private double averageCost()
	{
		// private method to calculate and return the 
		// average cost 
		// of a CD in the collection
	}

}//end class CD_Collection
