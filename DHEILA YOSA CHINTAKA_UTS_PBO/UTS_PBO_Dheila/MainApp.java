// Class utama untuk menjalankan program
public class MainApp {
    public static void main(String[] args) {

        // POLYMORPHISM: menggunakan referensi superclass
        Vehicle v1 = new Car();
        Vehicle v2 = new Motorcycle();

        // Memanggil method dengan implementasi berbeda
        v1.startEngine(); // dari Car
        v2.startEngine(); // dari Motorcycle

        // Menggunakan interface Electric
        Electric e = new Car();
        e.chargeBattery();
    }
}