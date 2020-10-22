public class ArrayOps{

	
	public static int sum(int[] arr) {
		int total = 0;
		for(int i = 0; i < arr.length; i++){
			total += arr[i];
		}
	return total;
	}

	public static int largest(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static int[] sumRows(int[][] matrix) {
		int[] arr = new int[matrix.length];
		for(int i = 0; i < matrix.length; i++){
			arr[i] = sum(matrix[i]);
		}
		return arr;
	}

	public static int[] largestInRows(int[][] matrix) {
		int[] arr = new int[matrix.length];
		for(int i = 0; i < matrix.length; i++){
			arr[i] = largest(matrix[i]);
		}
		return arr;
	}

	public static int sum(int[][] arr) {
		return sum(sumRows(arr));
	}

	public static int[] sumCols(int[][] matrix) {
		int size = matrix[0].length;
		int[] arr = new int[size];
		int index = -1;
		int total = 0;
		for(int h = 0; h < size; h++){
			index += 1;
			if(h > 0)
				arr[index - 1] = total;
			total = 0;
			for(int i = 0; i < matrix.length; i++){
					total += matrix[i][index];
			}
		}
		return arr;
	}
				
		
		
}
			