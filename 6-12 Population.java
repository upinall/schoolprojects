public class Population
{
   public static void main(String[] args)
   {
      double mexicoPop = 128;
      double usPop = 323;
      int years = 0;
      double RATE_OF_GROWTH_OF_MEXICO = 0.0101;
      double RATE_OF_DECAY_OF_USA=0.0015;
      
    // your code here
    System.out.printf("%-10s%-20s%-15s\n","Years","Mexico","USA");
    while(mexicoPop<usPop){
        System.out.printf("%-10d%-20.2f%-20.2f\n",years,mexicoPop,usPop);
        mexicoPop += mexicoPop*RATE_OF_GROWTH_OF_MEXICO;
        usPop -=usPop*RATE_OF_DECAY_OF_USA;
        years++;
    }
    System.out.printf("%-10d%-20.2f%-20.2f\n",years,mexicoPop,usPop);

      System.out.println("The population of Mexico will exceed the U.S. population in " + years + " years");
      System.out.println("The population of Mexico will be " + mexicoPop + " million");
      System.out.println("and the population of the U.S. will be " + usPop + " million");
   }
}
