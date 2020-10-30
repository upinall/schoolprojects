public class CountSpaces
{
    public static void main(String[] args)
    {
        // write your code here
        String quote = "Hispanic parents will learn everything and anything except for english - Abdul";
        System.out.println("Number of spaces is " + calculateSpaces(quote));
    }
    public static int calculateSpaces(String inString)
    {
        // write your code here
        int count = 0;
        for (int i = 0; i < inString.length(); i++){
            if(inString.charAt(i) == ' '){
                ++count;
            }
        }
        return count;
    }
}
