public class Car
{
    // Instance Variables
    private int myStartMiles;
    private int myEndMiles;
    private double myGallonsUsed;

    // Constructor
    public Car(int odometerReading)
    {
        myStartMiles = odometerReading;
        myEndMiles = odometerReading;
        myGallonsUsed = 0;
    }

    public void fillUp(int odometerReading, double gallons)
    {
        /*
        Simulates filling up the tank by recording the current
        odometer reading and adding the number of gallons used.
         */
        myEndMiles = odometerReading;
        myGallonsUsed += gallons;
    }

    public double calculateMPG()
    {
        /*
        This function returns the MPG for the car
         */
        int milesDriven = myEndMiles - myStartMiles;
        if (myGallonsUsed == 0)
        {
            return 0.0;
        }
        return (double) milesDriven / myGallonsUsed;
    }

    public double resetMPG()
    {
        /*
        Resets the starting odometer reading and gallons used to begin a new MPG calculation period.
         */
        myStartMiles = myEndMiles;
        myGallonsUsed = 0;
        return 0.0;
    }

    // Getter
    public int getStartMiles()
    {
        return myStartMiles;
    }

}
