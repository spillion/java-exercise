public class BicycleDemo {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        DriveBicycleImplement bike1 = new DriveBicycleImplement();
        DriveBicycleImplement bike2 = new DriveBicycleImplement();
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}
