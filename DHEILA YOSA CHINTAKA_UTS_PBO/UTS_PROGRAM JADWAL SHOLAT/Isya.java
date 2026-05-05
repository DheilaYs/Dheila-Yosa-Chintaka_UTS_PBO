public class Isya extends Prayer implements AudioReminder {

    public Isya(String time) {
        super(time);
    }

    @Override
    public void remind() {
        System.out.println("Waktu Isya (" + time + ")");
    }

    @Override
    public void playAdzan() {
        System.out.println("Adzan Isya...");
    }
}