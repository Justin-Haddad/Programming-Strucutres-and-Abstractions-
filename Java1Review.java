import java.util.Arrays;


public class Java1Review {
	
	public static double divide(double x, double y) 
	{
		return x/y;
	}
	
	public static int divide(int x, int y)
	{
		return x/y;
	}
	
	public static boolean isDivisibleBy7(int num)
	{
		if ((num % 7) == 0)
		{
			return true;
		}
		else 
		{
			return false;
		}

	}
	
	public static String main(String input)
	{
		return "Overloaded main method was passed \"" + input + "\".";
		
	}
	
	public static int findMin(int a, int b, int c)
	{
		if ((a < b) && (a < c))
		{
			return a;
		}
		else if ((b < c) && (b < a))
		{
			return b;
		}
		else if ((c < b) && (c < a))
		{
			return c;
		}
		return 0;
		
	}

	 	public static int findMin(int[] array)
	 	{
	 		Arrays.sort(array);
	 		return array[0];
	 	}
	 	
	 	
		 public static void removeDuplicates(int[] array)
		 {
			 int num = 0;
			 for(int index =0; index < array.length; index++)
			 {
				 boolean isDuplicate = false;
				 num = array[index];
				 for( int i = index + 1; i < array.length; i++)
				 {
					 if(num == array[i])
					 {
						 isDuplicate = true;
						 array[i] = 0;
					 }
					 if (isDuplicate)
					 {
						 array[index] = 0;
					 }
			 }
		 }
		 }
	 	
	 	public static double average(int[] array)
	 	{
	 		double total = 0;
	 		for (int index = 0; index < array.length; index++)
	 		{
	 			total = total + array[index];
	 		}
	 		double average = total / array.length;
	 		
	 		return average;
	 	}
	 	
	 	public static void toLowerCase(String[] array)
	 	{
	 		for (int index = 0; index < array.length; index++)
	 		{
	 			array[index] = array[index].toLowerCase();
	 		}
	 		
	 	}
	 	
	 	public static String[] toLowerCaseCopy(String[] array)
	 	{
	 		String[] phrase;
	 		phrase = Arrays.copyOf(array, array.length);
	 		for (int index= 0; index < phrase.length; index++)
	 		{
	 			phrase[index] = phrase[index].toLowerCase();
	 		}
	 		return phrase;
	 	}
	 	
	 	
	 
	
	public static void main(String[] args) {
		
		
	}

}
