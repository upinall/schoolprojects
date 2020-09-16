class MileConversions
{
public static void main(String[] args)
{
final double INCHES_IN_MILE= 63360; // 1 mile = 63360 inch
final double FEET_IN_MILE = 5280.0;  // 1 mile = 5280 feet
final double YARDS_IN_MILE = 1760.0;  // 1 mile = 1760 yards
double miles = 4.0;
System.out.printf("%.1f miles is %.1f inches, or %.1f feet, or %.1f yards", miles, miles*INCHES_IN_MILE, miles*FEET_IN_MILE, miles*YARDS_IN_MILE);
  }
}
