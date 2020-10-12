class Factorial{
	public static void main(String args[]){
	int fact;
	fact = fact(5);
	System.out.println("Factorial of 5 is:"+fact);
	}
	
	static int fact(int n){
	
	if(n == 0 || n== 1)
	return 1;
	else
		return n*fact(n-1);	
	}
}
