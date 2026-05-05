// Class Car mewarisi Vehicle (INHERITANCE)
// dan mengimplementasikan Electric (INTERFACE)
public class Car extends Vehicle implements Electric {

    // Override method dari abstract class (POLYMORPHISM)
    @Override
    public void startEngine() {
        System.out.println("Mobil dinyalakan dengan tombol start.");
    }

    // Implementasi method dari interface Electric
    @Override
    public void chargeBattery() {
        System.out.println("Mobil sedang mengisi baterai.");
    }
}