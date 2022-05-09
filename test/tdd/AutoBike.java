package tdd;

public class AutoBike {
    private boolean isOn;
    private boolean gear;
    private int speed;
    private int DSpeed;
    private int gearNumber;
    private int increment;
    private int decrement;


    public void setWork(boolean working) {
        isOn = working;
    }

    public boolean getOnValue() {
        return isOn;
    }

    public void engageGear(boolean activated) {
        gear = activated;
    }

    public boolean getGearStatus() {
        return gear;
    }

    public void Accelerate(int speed) {

        this.speed = speed;
        if(speed >= 0 && speed <= 20){
            gearNumber = 1;
        }
        if (speed > 20 && speed <= 30){
            gearNumber = 2;
        }
        if (speed > 30 && speed <= 40){
            gearNumber = 3;
        }
        if (speed > 40){
            gearNumber = 4;
        }
    }

    public int getGearNumber() {
        return gearNumber;
    }

    public int getIncrement() {
        if (gearNumber == 1){
            increment = speed + 1;
        }
        if (gearNumber == 2){
            increment = speed + 2;
        }
        if (gearNumber == 3){
            increment = speed + 3;
        }
        if (gearNumber == 4){
            increment = speed + 4;
        }
        return increment;
    }

    public void Decelerate(int DSpeed) {
        this.DSpeed = DSpeed;
    }

    public int getDecrement() {
        if (gearNumber == 4){
            decrement = DSpeed - 4;
        }
        if (gearNumber == 3){
            decrement = DSpeed - 3;
        }
        if (gearNumber == 2){
            decrement = DSpeed - 2;
        }
        if (gearNumber == 1){
            decrement = DSpeed - 1;
        }
        return decrement;
    }
}
