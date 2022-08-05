class SelfReferentialArray{
	public static void main(String[] args) {
		int[] a = new int[] {2,0,2,0};
		System.out.println(isSelfReferential(a));
	}

	static int isSelfReferential(int[] a){
		if(a.length <= 1){
			return 0;
		}

		for(int i = 0; i < a.length; i++){
			int count = 0;
			for(int j = 0; j < a.length; j++){
				if(a[j] == i){
					count++;
				}
			}
			if(a[i] != count){
				return 0;
			}
		}

		return 1;
	}
}