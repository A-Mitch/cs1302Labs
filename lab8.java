
public class lab8 {

	//Done by Alexander Mitchell on March 2, 2017 for CSC 1302
	
	public static void main(String[] args) {
		//1
		System.out.println("This is the first problem");
		System.out.println(mystery(7,12));
		System.out.println(mystery(37,8));
		System.out.println(mystery(8,2));
		
		System.out.println();
		
		//2
		System.out.println("This is the second problem");
		printN(3);
		
		System.out.println();
		
		//3
		System.out.println("This is the third problem");
		System.out.println(fact(5));
		System.out.println(fact(4));
		
		System.out.println();
		
		//4
		System.out.println("This is the fourth problem");
		System.out.println(fib(4));
		System.out.println(fib(6));
		System.out.println(fib(8));
		System.out.println(fib(10));

	}
	
	
	//1
	public static int mystery(int x, int y){
		if (x<y){
		return x;
		}else
		{
				return mystery(x-y,y);
		}
		}
	
	//2
	public static void printN(int n)
	{
		if (n <= 0) {
			System.out.println("Sir, you have had enough! It's time to stop! Where are you're parents?");
		} else 
		{
			System.out.println(n);
			printN(n-1);
		}
	}
	
	
	
	//3
	public static int fact(int n)
	{
		if(n <= 0)
		{
			return 1;
		} else 
		{
			return n*fact(n-1);
		}
		
	}
	
	
	//4
	public static int fib(int n)
	{
		if(n <= 2)
		{
			return 1;
		} else 
		{
			return(fib(n-1)+fib(n-2));
		}
		
	}

}
