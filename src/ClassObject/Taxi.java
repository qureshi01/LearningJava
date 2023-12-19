package ClassObject;

public class Taxi extends Vehicle{
    @Override
    String run() {
        return "Land";
    }

    @Override
    int wheels() {
        return 4;
    }

    int carryPeople(){
        return 5;
    }

    @Override
    float weight() {
        return 1000.09f;
    }
}
