class Vehicle{
    public void drive(){
        System.out.println("vehicle is moving");
    }
}

class Car extends Vehicle{
    public void drive(){
        System.out.println("car is moving");
    }
}

class Bikes extends Vehicle{
    public void drive(){
        System.out.println("Bikes is moving");
    }
}

public class Main{
    public static void main(String[] args){
        Vehicle vehicle1 = new Vehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new Car();
        vehicle2.drive();

        Vehicle vehicle3 = new Bikes();
        vehicle3.drive();
    }
}
