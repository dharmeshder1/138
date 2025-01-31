class interest
{
public static void main(String[] args)
	{
	int principal=5000;
	int rate=5;
	int time=3;
	
	System.out.println("a principal amount" +principal);
	System.out.println("a rate of interest" +rate);
	System.out.println("a time piriod(in year)" +time);
	
	int simpleinterest=(principal*rate*time)/100;
	
	System.out.println("a simple interest is" + simpleinterest);
	}
}