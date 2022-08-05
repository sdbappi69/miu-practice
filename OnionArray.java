class OnionArray{

	public static void main(String[] args) {
		int[] onion = new int[] {-2,5,0,5,12};
		System.out.println(isOnionArray(onion, onion.length));
	}

	static int isOnionArray(int[] a, int len){
		if(len < 0){
			return 0;
		}

		if(len <= 1){
			return 1;
		}

		for (int i = 0; i < len-1; i++) {
			int j = i;
			int k = len-j-1;

			int summation = a[j] + a[k];
			if(j != k && summation > 10){
				return 0;
			}
		}

		return 1;
	}

}