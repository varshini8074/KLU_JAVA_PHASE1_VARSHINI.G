import java.util.*;
class Vehicle{
    void type(){
        System.out.println("Vehicle");
    }
}
class Car {
    void Wheels(){
        System.out.println("Four Wheels");
    }
}

class Bike extends Vehicle{
    void Wheels(){
        System.out.println("Two Wheels");
    }
}
class Auto extends Vehicle{
    void Wheels(){
        System.out.println("Three Wheels");
    }
}
class Main{
    public static void main(String[] args){
        Auto s = new Auto();
        s.Wheels();
        Bike d = new Bike();
        d.Wheels();
        Car f = new Car();
        f.Wheels();
    }
}