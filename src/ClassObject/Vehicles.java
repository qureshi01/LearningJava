package ClassObject;

interface Vehicles {
     public String run(); //in interface method, doesn't required abstract keyword
     public int wheels();
     public int carryPeople();
     public float weight();

    /*void commonParts(){
        System.out.println("Common"); //cannot be used like this
    }*/

    default public void fun(){

    }
}
