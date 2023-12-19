package ClassObject;

public class Bus extends Vehicle { //Bus is a concrete class, because it is a child of vehicle abstract class.
    int wheels(){
        return 6;
    }

    @Override
    String run() {
        return "Land";
    }


    @Override
    int carryPeople() {
        return 100;
    }

    @Override
    float weight() {
        return 100.09f;
    }
}
