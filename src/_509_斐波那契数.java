
public class _509_ì³²¨ÄÇÆõÊý {
	
	
	//O(2^n)
	public static int fib(int N) {
		
		//F(4) = F(3) + F(2) = 2 + 1 = 3.
		if (N == 1 || N == 0) return N;
		
		return fib(N-1) + fib(N-2);
		
	}
	
	//O(N)
	public static int fib1 (int N) {
		if (N <= 1 ) return N;
		
		int first = 0;
		int second = 1;
		
		while (N-- > 1) {
			second += first;
			
			first = second - first;
			
		}
		return second + first;
		
	}
	
	public static int fib2 (int N) {
		if (N <= 1) return N;
		
		int first = 0;
		int second = 1;
		for (int i = 0; i < N-1; i++) {
			int sum = second + first;
			first = second;
			second = sum;
		}
		return second;
		
	}
	
	public static void main(String[] args) {
		System.out.println(fib2(3));
		
	}

}
