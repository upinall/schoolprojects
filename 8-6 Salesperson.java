public class DemoSalesperson
{
   public static void main (String args[])
   {
      // your code here
      Salesperson salesperson[]=new Salesperson[10];
      for (int i = 0; i < salesperson.length; i++){
          salesperson[i]=new Salesperson(9999, 0);
      }
      System.out.println("Sales objects demo-1");
      for (int i = 0; i < salesperson.length; i++){
          System.out.println("ID : "+salesperson[i].getId()+" Sales : $"+salesperson[i].getSales());
      }
   }
}


/////////////////////////////

public class Salesperson
{
   private int id;
   private double sales;
    // constructor
    public Salesperson(int id, double sales)
    {
        setId(id);
        setSales(sales);
    }

    // get and set methods
    public void setSales(double sales){
        this.sales = sales;
    }
    public void setId(int id){
        this.id=id;
    }
    public double getSales(){
        return sales;
    }
    public int getId() {
        return id;
    }
}



