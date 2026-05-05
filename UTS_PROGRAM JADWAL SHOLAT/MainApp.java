public class MainApp {
    public static void main(String[] args) {

        // POLYMORPHISM
        Prayer p1 = new Subuh("05:00");
        Prayer p2 = new Dzuhr("12:15");
        Prayer p3 = new Ashar("15:30");
        Prayer p4 = new Magrib("18:20");
        Prayer p5 = new Isya("19:30");

        p1.remind();
        p2.remind();
        p3.remind();
        p4.remind();
        p5.remind();

        // Interface (adzan)
        AudioReminder a = new Subuh("05:00");
        a.playAdzan();
    }
}