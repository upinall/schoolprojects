public class InchesToFeet
{
	public static void main(String[] args)
	{
		final int INCHES_IN_FEET = 12;
        int inches = 86;
		int feet = 7;
		int remainder = 2;			
		feet = inches/12;		
		remainder = inches%12;
		System.out.println(inches + " inches equals " + feet + " feet " + remainder + " inches");

	} 

}
