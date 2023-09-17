
public class RangeList extends IntegerList {
	private static final int MIN_CAPACITY = 2;
	
	public RangeList()
	{
		super(MIN_CAPACITY);
	}
	
	public RangeList(int lowerbound, int upperbound)
	{
		
		super(MIN_CAPACITY);
		String message = "The upper bound must be greater than or equal to the lower bound.";
		if (lowerbound > upperbound)
		{
			throw new IllegalArgumentException(message);
		}
		else 
		{
			//for (int j = 0 ; j < size; j++)
			
			for (int i = lowerbound; i <= upperbound; i++) 
			{
	
		       super.insert(size, i);
		       
		      
		     
		      
				
		        		
			}
		
			
	}
		
	}
	public void add(int lowerBound, int upperBound) throws IllegalArgumentException
	{
	
	String message = "The upper bound must be greater than or equal to the lower bound.";
	if (lowerBound > upperBound)
	{
		throw new IllegalArgumentException(message);
	}
	else if  (size == 0)
	 {
		
		for (int i = lowerBound, j = 0; i <= upperBound; ++i, ++j)
		{
			super.insert(j, i);
		}
	 }
	 if (lowerBound < array[0])
	 {
		 int stop = array[0];
		 for (int i = lowerBound, j = 0 ; i < stop ; ++i, ++j)
		 {	
		 		super.insert(j, i);
		 		
		 }
	}
			 
	 if (upperBound > array[size -1])
	 {
		 for (int i = array[size - 1] + 1, j = size; i <= upperBound; ++i, ++j)
		 {
			 super.insert(j, i);
		 }
	 }
	}
	
	public void remove(int lowerbound, int upperbound)
	{
		int start = array[0];
		if (lowerbound > upperbound) {
	        throw new IllegalArgumentException("The upper bound must be greater than or equal to the lower bound.");
	    }
		else if (size == 0) {
	        throw new UnsupportedOperationException("Cannot remove range from an empty list.");
	    }
		else  if (lowerbound < start || upperbound > array[size - 1] ) {
	        throw new IllegalArgumentException("Lower and/or upper bounds are out of the current list range.");
	    }
		else if (lowerbound != start && upperbound != array[size - 1]) {
	        throw new IllegalArgumentException("Cannot remove non-terminal ranges.");
	    }
	    else 
	    {
	    for (int i = lowerbound; i <= upperbound; i++)
	    {
	    	super.remove(indexOf(i));
	    }
	    }
	}
	public void add(int integer)
	{
		throw new UnsupportedOperationException("Insertion at arbitrary positions is not supported.");
	}
	public void insert(int index, int integer)
	{
		throw new UnsupportedOperationException("Insertion at arbitrary positions is not supported.");
	}
}