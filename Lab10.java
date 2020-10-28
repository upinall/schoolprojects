public class Lab10 {
    public static void main(String[] args){
        multi();
        triangle();
        System.out.println(reverse("string"));
    }
    public static void multi(){
        for(int i=1;i<11;i++)
        {
            for(int j=1;j<11;j++)
            {
                System.out.println(Integer.toString(i)+" X "+Integer.toString(j)+" = " + Integer.toString(i*j));
            }
            System.out.println("-------------------------");
        }
    }
    public static String reverse(String s)
    {
        String st = new String();
        for (int i=s.length()-1;i>-1;i--)
        {
            st+=s.charAt(i);
        }
        return st;
    }
    public static void triangle()
    {
        for(int i = 1; i <= 5; i++)
        {
            for (int j = 5; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print(Integer.toString(j)+" ");
            }
            System.out.println();
        }
    }
}
