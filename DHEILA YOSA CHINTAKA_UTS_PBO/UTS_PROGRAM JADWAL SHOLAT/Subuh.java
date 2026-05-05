public class Subuh extends Prayer implements AudioReminder {

    public Subuh(String time) {
        super(time);
    }

    @Override
    public void remind() {
        System.out.println("Waktu Subuh (" + time + ")");
    }

    @Override
    public void playAdzan() {
        System.out.println("Adzan Subuh...");
    }
}