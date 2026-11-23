package first.robot;

//Create the class here
public class Bottle {

    double capacity;

    public double updateAmount(double amountToBeRemoved){
        double remaining = capacity;
        remaining -= amountToBeRemoved;
        if ((remaining/capacity)<0.25) {
            remaining = capacity;
        }
        return remaining;
    }
}