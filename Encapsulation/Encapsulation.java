public class Encapsulation {
    public static void main(String[] args) {
        SportsCar myCar = new SportsCar("Tesla", "CyberTruck");
        myCar.startEngine();
        myCar.shiftGear(1);
        myCar.accelerate();
        System.out.println();
        System.out.println("CurrentSpeed of my Tesla car is " + myCar.getSpeed());
        myCar.shiftGear(2);
        myCar.accelerate();
        System.out.println();
        System.out.println("CurrentSpeed of my Tesla car is " + myCar.getSpeed());
        myCar.brake();
        myCar.stopEngine();
        System.out.println();

        // Setting arbitrary value to speed.
        // myCar.currentSpeed = 500;

        // System.out.println("Current Speed of My Sports Car is set to " +
        // myCar.currentSpeed);

        System.out.println("CurrentSpeed of my Tesla car is " + myCar.getSpeed());

    }
}
