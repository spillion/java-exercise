public class DriveBicycleImplement implements DriveBicycle {
    Bicycle bicycle = new Bicycle();
    public void changeCadence(int newValue) {
        bicycle.cadence = newValue;
    }
    public void changeGear(int newValue) {
        bicycle.gear = newValue;
    }

    @Override
    public void speedUp(int increment) {
        bicycle.speed = bicycle.speed + increment;
    }

    public void applyBrakes(int decrement) {
        bicycle.speed = bicycle.speed - decrement;
    }

    @MyAnnotation(name="zhangsan")
    public void printStates() {
        System.out.println("cadence:" +
                bicycle.cadence + " speed:" +
                bicycle.speed + " gear:" + bicycle.gear);
    }
}
