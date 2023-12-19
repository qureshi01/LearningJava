package ClassObject;

public class Bus1 implements Vehicles{
    @Override
    public String run() {
        return "Land";
    }

    @Override
    public int wheels() {
        return 10;
    }

    @Override
    public int carryPeople() {
        return 100;
    }

    @Override
    public float weight() {
        return 110.09f;
    }
}
