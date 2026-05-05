public class Magrib extends Prayer implements AudioReminder {

    public Magrib(String time) {
        super(time);
    }

    @Override
    public void remind() {
        System.out.println("Waktu Magrib (" + time + ")");
    }

    @Override
    public void playAdzan() {
        System.out.println("Adzan Magrib...");
    }
}