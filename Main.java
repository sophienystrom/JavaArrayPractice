import java.util.Arrays;

class Main {

  public static void main(String[] args) {
		
		int[] ranNum_Arr = new int[10];
		
		AssignRandomNumbers(ranNum_Arr);
		PrintEvenIndex(ranNum_Arr);
		PrintEvenElement(ranNum_Arr);
		PrintReversedElements(ranNum_Arr);
		PrintFirstLast(ranNum_Arr); //THIS METHOD IS FOR THE ORIGINAL ARRAY, NOT THE REVERSED ARRAY

  }

	/* 1. takes in an empty array
		 2. cycles through each index, calls random num method and assigns those values
		 3. returns array with values*/
	public static int[] AssignRandomNumbers(int[] openNumberArray){
		for(int i = 0; i < openNumberArray.length; i++){
			openNumberArray[i] = RandomArrayNumbers(1, 100);
		}
		return openNumberArray;
	}

	/*1. takes in min/max values that act as the desired range for the randomly chosen values
		2. Specifies the range for math.random from max-min + 1 (to subsitute min val)
		3. returns a random int in given range*/
	public static int RandomArrayNumbers(int minimumValue, int maximumValue){
		
		int randomNumRange = (maximumValue - minimumValue) + 1;

		return (int)(Math.random() * randomNumRange);
	}

	/* 1. Uses integer array with values
		 2. Cycles through each array index
		 3. If the index is divisible by 2 with no remainder, the value will be printed*/
	public static void PrintEvenIndex(int[] numberArray){

		System.out.println("");
		System.out.print("Array elements at even indexes include: ");

		for(int i=0; i < numberArray.length; i++){
			if(i % 2 == 0){
				System.out.print(numberArray[i] + " ");
			}
		}
	}


	/* 1. uses integer array with values
		 2. cycles through each array element
		 3. if element is divisible by 2 with no remainder, the value will be printed*/
	public static void PrintEvenElement(int[] numberArray){
		
		System.out.println("");
		System.out.print("Even array elements include: ");

		for(int i=0; i < numberArray.length; i++){
			if(numberArray[i] % 2 == 0){
				System.out.print(numberArray[i] + " ");
			}
		}
	}

	/* 1. uses integer array with values
		 2. prints each index element starting at the FINAL index 
		 3. stops printing after index [0]*/
	public static void PrintReversedElements(int[] arrayToReverse){

		System.out.println("");
		System.out.print("Array elements in reverse are: ");

		for(int i = arrayToReverse.length - 1; i >= 0; i--){
			System.out.print(arrayToReverse[i] + " ");
		}


	}

	/* 1. uses integer array with values
		 2. prints array element at index 0 
		 3. prints array element at last index*/
	public static void PrintFirstLast(int[] numberArray){

		System.out.println("");
		System.out.println("First index element: " + numberArray[0]);
		System.out.println("Last index element: " + numberArray[numberArray.length - 1]);
	}







/*

Just placing this here in case I end up needing to use this code instead of the method I wrote

for(int i = 0; i < ranNum_Arr.length; i++){
ranNum_Arr[i] = RandomArrayNumbers(1, 100);
		} 
		
*/

}