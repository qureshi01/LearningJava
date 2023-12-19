package ClassObject;
abstract class Vehicle {
    abstract String run();
    abstract int wheels();
    abstract int carryPeople();
    abstract float weight(); //abstract functions

    void commonParts(){ //non-abstract functions
        System.out.println("Common");
    }

}

//abstract class is implemented in Bus and Taxi class file
