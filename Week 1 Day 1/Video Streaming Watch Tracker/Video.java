public class Video {
    private String title;
    private int duration;
    private int views;

    public Video(int duration, String title) {
        this.duration = duration;
        this.title = title;
    }

    public void watch(){
        views++;
    }

    public int getViews() {
        return views;
    }

    public String getTitle() {
        return title;
    }
}
