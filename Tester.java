public class Tester{
	
	public static void main(String[] args){
	
	// sum test:

		int[] sumtest = new int[5];
		for(int i = 1; i < 4; i++){
			if(i == 1)
				sumtest = new int[] {4, 5, 2, 3, 7};
			if(i == 2)
				sumtest = new int[] {-3, 5, 2, -7};
			if(i == 3)
				sumtest = new int[] {0, 4, 7, 8, 6};
			System.out.println(ArrayOps.sum(sumtest));
		}
	}
}