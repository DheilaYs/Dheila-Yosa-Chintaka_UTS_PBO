public class Ashar extends Prayer implements AudioReminder {

    public Ashar(String time) {
        super(time);
    }

    @Override
    public void remind() {
        System.out.println("Waktu Ashar (" + time + ")");
    }

    @Override
    public void playAdzan() {
        System.out.println("Adzan Ashar...");
    }
}
