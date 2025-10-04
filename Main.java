public class Main
{
    public static void main(String[] args)
    {
        System.out.println("|| 3.1 MPG ASSIGNMENT ||");
        System.out.println("\n");

        Car car = new Car(15);
        System.out.println("Starting odometer: " + car.getStartMiles());

        // Intial fill-up
        car.fillUp(150, 8);
        System.out.println("Miles per gallon after first fill-up: " + car.calculateMPG());

        // Second fill-up without reset
        car.fillUp(200, 4);
        System.out.println("Miles per gallon after second fill-up: " + car.calculateMPG());

        // Reset and fill again
        car.resetMPG();
        car.fillUp(350, 10);
        System.out.println("Miles per gallon after reset and new fill-up: " + car.calculateMPG());

        // Another reset and long trip
        car.resetMPG();
        car.fillUp(603, 25.5);
        System.out.println("Miles per gallon after long trip: " + car.calculateMPG());

        // Test for zero gallons used
        car.resetMPG();
        car.fillUp(700, 0);
        System.out.println("Miles per gallon with zero gallons used: " + car.calculateMPG());

        System.out.println("\n");
        System.out.println("|| End of Test ||");
    }
}
