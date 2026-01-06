public class Abstraction {
    public static void main(String[] args) {
        Car mycar = new SportsCar("Ford", "Mustang");
        Car myCar2 = new SportsCar("Tesla", "Model 3");
        mycar.startEngine();
        mycar.shiftGear(1);
        mycar.accelerate();
        mycar.shiftGear(2);
        mycar.accelerate();
        mycar.brake();
        mycar.stopEngine();

        System.out.println(" ");

        myCar2.startEngine();
        myCar2.shiftGear(1);
        myCar2.accelerate();
        myCar2.shiftGear(2);
        myCar2.stopEngine();
    }
}
