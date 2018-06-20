package CodingPractice.Programs;

import java.util.Arrays;

/**
 * @author asanne
 *
 */
public class Array_ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray1 = new int[] {1,2,3,4,5,6};	
		ArrayReverse_Iterative(inputArray1);	
		System.out.println("Array after reverse using Iterative method: " + Arrays.toString(inputArray1));
		
		
		int[] inputArray2 = new int[] {1,2,3,4,5,6};	
		ArrayReverse_Recursive(inputArray2, 0, inputArray2.length-1);	
		System.out.println("Array after reverse using Recursive method: " + Arrays.toString(inputArray2));
		
		int[] inputArray3 = new int[] {1,2,3,4,5,6};	
		ArrayReverse_WithoutTemporaryVariable(inputArray3);	
		System.out.println("Array after reverse without using Temporary variable: " + Arrays.toString(inputArray3));
		
	}
	
	
	/**
	 * 
	 * @param array
	 */
	private static void ArrayReverse_Iterative(int[] array) {
		int startIndex = 0;
		int endIndex = array.length-1;
			
		while(startIndex<=endIndex)
		{		
		int temp = array[startIndex];
		array[startIndex] = array[endIndex];
		array[endIndex]= temp;
		startIndex++;
		endIndex--;
		}
		
	}
	
	private static void ArrayReverse_Recursive(int[] array, int startIndex, int endIndex) {		
		if(startIndex>=endIndex)
			return ;

		int temp = array[startIndex];
		array[startIndex] = array[endIndex];
		array[endIndex]= temp;	
		ArrayReverse_Recursive(array, ++startIndex, --endIndex);
	}

	private static void ArrayReverse_WithoutTemporaryVariable(int[] array) {		
		
		int startIndex = 0;
		int endIndex = array.length-1;
			
	//Using XOR operator
		while(startIndex<=endIndex)
		{		
		array[startIndex]^=array[endIndex];
		array[endIndex] ^= array[startIndex];
		array[startIndex]^= array[endIndex] ;
		
		startIndex++;
		endIndex--;
		}

	}
}
