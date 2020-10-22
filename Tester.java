public class Tester{
	
	public static void main(String[] args){
	
	// sum test:

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
	}
}