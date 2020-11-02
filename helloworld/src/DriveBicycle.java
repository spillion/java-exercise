//abstruct Bicycle method
public interface DriveBicycle {
    void changeCadence(int newValue);
    void changeGear(int newValue);
    void speedUp(int increment);
//    void applyBrakes(int decrement);
    void printStates();
}
