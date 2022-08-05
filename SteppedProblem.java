class SteppedProblem{

	public static void main(String[] args) {
		int[] stepped = new int[] {1,1,1,5,5,5,5,8,8,8};
		System.out.println(isStepped(stepped, stepped.length));
	}

	static int isStepped(int[] a, int len){
		if(isAscending(a, len) == true){
			if(isOccurresMoreThenThree(a, len) == true){
				return 1;
			}else{
				return 0;
			}
		}else{
			return 0;
		}
	}

	static boolean isAscending(int[] a, int len){
		if(len <= 1){
			return true;
		}

		for (int i = 0; i < len - 1; i++) {
			if(a[i] > a[i+1]){
				return false;
			}
		}

		return true;
	}

	static boolean isOccurresMoreThenThree(int[] a, int len){
		int[] uniqueA = new int[30];
		int index = 0;

		for (int i = 0; i < len; i++) {
			int isUnique = 1;
			for(int j = 0; j < uniqueA.length; j++){
				if(a[i] == uniqueA[j]){
					isUnique = 0;
					break;
				}
			}
			if(isUnique == 1){
				uniqueA[index] = a[i];
				index++;
			}
		}

		for(int i = 0; i < uniqueA.length; i++){
			if(uniqueA[i] == 0){
				break;
			}
			int count = 0;
			for (int j = 0; j < len; j++) {
				if(uniqueA[i] == a[j]){
					count++;
				}
			}
			if(count < 3){
				return false;
			}
		}

		return true;
	}

}