
public class UniqueList extends IntegerList 
{
	private static final int MIN_CAPACITY = 2;
	
	public UniqueList()
	{
		super(MIN_CAPACITY);
	}
	
	public UniqueList(int capacity)
	{
		super(capacity);
	}
	
	public void add(int integer)
	{
		super.add(integer);
	}
	
	public void insert(int index, int integer) throws IllegalArgumentException
	{
		if (super.indexOf(integer) >= 0) 
		{
	        throw new IllegalArgumentException("The integer " + integer + " is already in the list.");
	    }
		else {
			super.insert(index, integer);
		}
	    
	}
}

