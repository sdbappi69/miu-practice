class MartianArray{
	public static void main(String[] args) {
		int[] a = new int[] {1,3};
		System.out.println(isMatian(a));
	}

	static int isMatian(int[] a){
		if(a.length == 0){
			return 0;
		}

		if(a.length == 1 && a[0] == 1){
			return 1;
		}

		int countOne = 0;
		int countTwo = 0;
		if(a.length > 1){
			for (int i=0; i < a.length; i++) {
				if(i != a.length-1 && a[i] == a[i+1]){
					return 0;
				}
				if(a[i] == 1){
					countOne++;
				}
				if(a[i] == 2){
					countTwo++;
				}
			}
		}

		if(countOne > countTwo){
			return 1;
		}else{
			return 0;
		}
	}
}