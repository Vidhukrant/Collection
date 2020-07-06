package map.practice;

public class PrimeNum {
	
	public static boolean isPrimeNum(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int a=2;a<=num;a++) {
			
			if(num%a==0) {
				return false;
			}
			
		}
		return true;
	}
	
	public static void getNum(int num) {
		
		for(int i=2;i<=num;i++) {
			if(isPrimeNum(i)) {
				System.out.println(i+ " ");
			}
		}
	}

	public static void main(String[] args) {
		getNum(22);

	}
}