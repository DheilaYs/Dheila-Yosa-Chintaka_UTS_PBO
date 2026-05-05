// Class Motorcycle mewarisi Vehicle (INHERITANCE)
public class Motorcycle extends Vehicle {

    // Override method startEngine dengan cara berbeda (POLYMORPHISM)
    @Override
    public void startEngine() {
        System.out.println("Motor dinyalakan dengan kick starter.");
    }
}