class OlympicArray{
	public static void main(String[] args) {
		int[] a = new int[] {1,99,99,1000,100,10000,2};
		System.out.println(isOlympic(a));
	}

	static int isOlympic(int[] a){
		boolean sumOfMinimimumZero = false;

		for(int i = 0; i < a.length; i++){

			int sumOfLowerValue = 0;

			for(int j = 0; j < a.length; j++){

				if(a[i] > a[j]){
					sumOfLowerValue = sumOfLowerValue + a[j];
				}
			}

			if(sumOfLowerValue == 0){
				sumOfMinimimumZero = true;
			}

			if(sumOfLowerValue > a[i]){
				return 0;
			}
		}

		if(sumOfMinimimumZero == false){
			return 0;
		}else{
			return 1;
		}
	}
}