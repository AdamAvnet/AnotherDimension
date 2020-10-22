import java.util.Arrays;
public class Tester{
	
	public static void main(String[] args){
	


	// sum test:

		System.out.println("sum test");
		int[] sumtest = new int[5];
		for(int i = 1; i <= 4; i++){
			if(i == 1)
				sumtest = new int[] {4, 5, 2, 3, 7};
			if(i == 2)
				sumtest = new int[] {-3, 5, 2, -7};
			if(i == 3)
				sumtest = new int[] {0, 4, 7, 8, 6};
			if(i == 4)
				sumtest = new int[] {};
			System.out.println(ArrayOps.sum(sumtest));
		}
		System.out.println();

	// largest test:

		System.out.println("largest test");
		int[] bigtest = new int[10];
		for(int i = 1; i < 4; i++){
			if(i == 1)
				bigtest = new int[] {10, 5, 4, 3, -6, 7, -4};
			if(i == 2)
				bigtest = new int[] {4, -2, -6, 98, 1045, 23, 1};
			if(i == 3)
				bigtest = new int[] {0, 3, 2, 5, -92, 94};
			System.out.println(ArrayOps.largest(bigtest));
		}
		System.out.println();

	// sumRows, largestInRows, and sum (overload) test:

		int[][] test = new int[3][5];
		for(int i = 1; i <= 12; i++){
			if((i + 2) % 3 == 0){
				test = new int[][] { { 3, -5, 4, 8, 10 },
						     { -5, 84, 1, -56, 20 },
						     { 4, 38, -23, -25, -5 }
					      	   };
			}
			if((i + 1) % 3 == 0){
				test = new int[][] { { 80, 12, 34, -26, 7 },
						     { -12, -45, 50, -33, -8 },
						     { 45, 3, 21, -84, 2 }
					    	   };
			}
			if(i % 3 == 0){
				test = new int[][] { { 23, 12, 18, 45, -52 },
						     { -90, 88, 45, -57, 2 },
						     { 23, 45, -45, -24, 6 }
					           };
			}
			if(i < 4){
				if(i == 1)
					System.out.println("sumRows test");
				System.out.println(Arrays.toString(ArrayOps.sumRows(test)));
			}
			else if(i < 7){
				if(i == 4)
					System.out.println("\nlargestInRows test");
				System.out.println(Arrays.toString(ArrayOps.largestInRows(test)));
			}
			else if(i < 10){
				if(i == 7)
					System.out.println("\nsum(overloaded) test");
				System.out.println(ArrayOps.sum(test));
			}
			else{
				if(i == 10)
					System.out.println("\nsumCols test");
				System.out.println(Arrays.toString(ArrayOps.sumCols(test)));
			}
		}	
	}
}