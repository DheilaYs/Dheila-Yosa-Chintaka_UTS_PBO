public class Dzuhr extends Prayer implements AudioReminder {

    public Dzuhr(String time) {
        super(time);
    }

    @Override
    public void remind() {
        System.out.println("Waktu Dzuhur (" + time + ")");
    }

    @Override
    public void playAdzan() {
        System.out.println("Adzan Dzuhur...");
    }
}