
public class SortedList extends IntegerList {
	//private static final int MIN_CAPACITY = 2;
	
	public SortedList()
	{
		super();
	}
	public SortedList(int capacity)
	{
		super(capacity);
	}
	
	public void add(int integer)
	{
		int index = 0;
	    while (index < size && array[index] < integer) {
	        index++;
	    }
	    int[] newArray = new int[size + 1];
	    System.arraycopy(array, 0, newArray, 0, index);
	    newArray[index] = integer;
	    System.arraycopy(array, index, newArray, index + 1, size - index);
	    array = newArray;
	    size++;
		}
	
	
	public void insert(int index, int integer) 
	{
		throw new UnsupportedOperationException("Insertion at arbitrary positions is not supported.");
	}
}
